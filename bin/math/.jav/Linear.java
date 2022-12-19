import java.io.*;
import maths.*;
import commons.*;
public class Linear extends Maths
{
	double[] ld,rd;
	Blk[] ln,rn;
	double fld,frd;
	int nVars=1;
	int nEqns=1;
	String vs1="",vs2="";
	String[] EQs;
	AnsV[] varis;
	Linear(String eqat)throws InvalidEquationArgsException
	{
		this(eqat,1,"x","x"); //Equation, num of vars, var-names,vars-to-find
	}
	Linear(String eqat,char vari)throws InvalidEquationArgsException
	{
		this(eqat,1,""+vari,""+vari);
	}
	Linear(String eqat,String vars)throws InvalidEquationArgsException
	{
		this(eqat,vars.trim().length(),vars.trim(),vars.trim()); //Equation, num of vars, var-names,vars-to-find
	}
	Linear(String eqat,String vars,char fnd)throws InvalidEquationArgsException
	{
		this(eqat,vars.trim().length(),vars.trim(),""+fnd); //Equation, num of vars, var-names,vars-to-find
	}
	Linear(String eqat,String vars,String fnd)throws InvalidEquationArgsException
	{
		this(eqat,vars.trim().length(),vars.trim(),fnd.trim()); //Equation, num of vars, var-names,vars-to-find
	}
	Linear(String eqat,int nvars,String evars,String tfvars)throws InvalidEquationArgsException
	{
		eqat=eqat.trim();
		if(evars.length()!=nvars)
			TIAE();
		//nvars OK
		for(char c : evars.toCharArray())
		{
			if(!X.haschar(eqat,c))
				TIAE();
		}
		for(char c : tfvars.toCharArray())
		{
			if(!X.haschar(eqat,c))
				TIAE();
		}
		for(char c : tfvars.toCharArray())
		{
			if(!X.haschar(evars,c))
				TIAE();
		}
		int pips=X.countchar(eqat,'|');
		if(pips<nvars-1)
			WARN("Not enough equations. You can give more equations by separating them with a '|'");
		//All OK
		nVars=nvars;
		nEqns=pips;
		vs1=evars; vs2=tfvars;
		EQs=new String[pips+1];
		for(int i=1;i<=pips;i++)
			EQs[i-1]=Y.cut(eqat,'|',i).trim();
		varis=new AnsV[nVars];
		for(int i=0;i<evars.length();i++)
			varis[i]=new AnsV(evars.charAt(i));
		parseEqns();
	}
	public void parseEqns()throws InvalidEquationArgsException 
	{
		int N=nEqns;
		String ceq,lsd,rsd; //rn,ln; ld,rd
		for(int STD=0;STD<N;STD++)
		{
			ceq=EQs[STD];
			if(!confirm(ceq))
				throw new ExtraVariableFoundException();
			lsd=Y.cut(ceq,'=',1).trim();
			rsd=Y.cut(ceq,'=',2).trim();
			ln=new Blk[X.countchar(lsd,' ')+1];
			rn=new Blk[X.countchar(rsd,' ')+1];
			StringParser spr=new StringParser(lsd);
			int K=0;
			while(!spr.end)
			{
				ln[K++]=new Blk(spr.nextWord());
			}
		}
	}
	public boolean confirm(String eq)
	{
		String eqn=eq.replace(" ","").replace("+","").replace("-","").replace("*","").replace("/","");
		for(char ch : eqn.toCharArray())
		{
			if(Character.isLetter(ch))
			{
				boolean fg=false;
				for(char ch2 : vs1.toCharArray())
				{
					if(ch2==ch)
						fg=true;
				}
				if(!fg)
					return false;
			}	
		}
		return true;
	}
	public static void WARN(String msg)
	{
		int st=msg.length();
		X.sop("*","yellow");
		for(int i=0;i<st;i++)
			X.sop("-","red");
		X.sopln("*","yellow");
		X.sopln(" "+msg,"red");
		X.sop("*","yellow");
		for(int i=0;i<st;i++)
			X.sop("-","red");
		X.sopln("*","yellow");
	}
	public static void TIAE()throws InvalidEquationArgsException
	{
		throw new InvalidEquationArgsException(true);
	}
	public static void main(String args[])throws InvalidEquationArgsException
	{
		int l=args.length;
		if(l<=0)
			return;
		Linear le;
		if(l==1)
			le=new Linear(args[0]);
		else if(l==2)
			le=new Linear(args[0],args[1]);
		else if(l==3)
			le=new Linear(args[0],args[1],args[2]);
		else
			le=new Linear(args[0].trim(),X.ipi(args[1].trim()),args[2].trim(),args[3].trim());
	}
}
class Blk
{
	double val;
	char var=(char)0;
	Blk(int value)
	{
		this((double)value,(char)0);
	}
	Blk(long value)
	{
		this((double)value,(char)0);
	}
	Blk(float value)
	{
		this((double)value,(char)0);
	}
	Blk(double value)
	{
		this(value,(char)0);
	}
	Blk(double value,char vn)
	{
		var=vn;
		val=value;
	}
	Blk(String unit)
	{
		unit=unit.trim();
		if(!Character.isDigit(unit.charAt(0)))
		{
			val=1;
			var=unit.charAt(0);
			return;
		}
		val=X.dpd(unit.substring(0,unit.length()-1));
		var=unit.charAt(unit.length()-1);
	}
	public void type()
	{
		if((int)var==0)
			X.sop(val);
		else
			X.sop(val+""+var);
	}
	public void print()
	{
		if((int)var==0)
			X.sopln(val);
		else
			X.sopln(val+""+var);
	}
}
class InvalidEquationArgsException extends Exception
{
	InvalidEquationArgsException() {}
	InvalidEquationArgsException(boolean pr)
	{
		if(pr)
			X.sopln("Invalid Arguments. Please check input","red");
	}
}
class ExtraVariableFoundException extends InvalidEquationArgsException
{
	ExtraVariableFoundException() 
	{
		X.sopln("Extra Variable found. Such variable was not declared before","red");
	}
	ExtraVariableFoundException(char v)
	{
		X.sopln("Extra Variable '"+v+"' found. Such variable was not declared before","red");
	}
	ExtraVariableFoundException(String s)
	{
		X.sopln(s,"red");
	}
}
class AnsV
{
	char vn;
	double value;
	AnsV() {}
	AnsV(char vna) {vn=vna;}
	public void setV(double d) {value=d;}
	public void setV(float d) {value=d;}
	public void setV(long d) {value=d;}
	public void setV(int d) {value=d;}
}
