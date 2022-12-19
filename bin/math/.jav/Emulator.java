import java.io.*; 
import maths.*;
import commons.*;
public class Emulator
{
	static String comm="";
	boolean chr=false;
	Var[] vars=new Var[250];
	int CTR=0;
	public static void main(String[] args)throws IOException
	{
		Emulator emu=new Emulator();
		String mcomm="";
		String rcomm="";
		while(!comm.trim().equalsIgnoreCase("Quit"))
		{
			X.sop("Graph emu >> ");
			comm=X.rL().trim();
			if(X.hasChar(comm,' '))
			{
				emu.chr=true;
				mcomm=Y.cut(comm,' ',1);
				rcomm=comm.substring(comm.indexOf(' '));
			}
			else
				emu.chr=false;
			if(comm.trim().equalsIgnoreCase("Quit"))
				break;
			if(!emu.chr)
			{
				//So far nothing
				if(emu.hasVar(comm))
				{
					X.sop("Variable: ","red");
					X.sTerm("green");
					emu.printVar(comm);
					X.sTerm("white");
				}
				else
				{
					if(isNum(comm))
					{
						X.sop("Number: ","red");
						X.sopln(comm,"blue");
					}
					else
						X.sopln(comm+": Variable not found");
				}
				continue;
			}
			if(mcomm.equalsIgnoreCase("new"))
			{
				String[] pscm=emu.parseComm(rcomm);
				emu.makeObj(pscm[0],pscm[1].charAt(0),pscm[2]);
				continue;
			}
			else if(mcomm.equalsIgnoreCase("del"))
				emu.delVariable(rcomm.trim());
			emu.chr=false;
			mcomm=rcomm="";
			comm="";
		}
	}
	void delVariable(String vname)
	{
		int iov=indexOfVar(vname);
		vars[iov]=null;
		for(int i=iov+1;i<vars.length;i++)
		{
			if(vars[iov]==null)
				continue;
			else
				vars[iov-1]=vars[iov];
		}
		CTR--;
	}
	void makeObj(String varname,char tp,String val)
	{
		Var v=new Var(varname,tp,val);
		vars[CTR]=v;
		CTR++;
	}
	boolean hasVar(String vname)
	{
		return (indexOfVar(vname)==-1)?false:true;
	}
	int indexOfVar(String vname)
	{
		int i=0;
		for(Var vr : vars)
		{
			if(vr==null)
				continue;
			if(vr.name.trim().equals(vname))
				return i;
			i++;
		}
		return -1;
	}
	Var getVar(String nm)
	{
		for(Var vr : vars)
		{
			if(vr==null)
				continue;
			if(vr.name.trim().equals(nm))
				return vr;
		}
		return null;
	}
	char varType(String vname)
	{
		return getVar(vname).type;
	}
	void printVar(String vname)
	{
		Var vt=getVar(vname);
		if(vt==null)
			X.sopln("null","red");
		else
			vt.printIt();
	}
	public static boolean isNum(String n)
	{
		try
		{
			X.dpd(n);
			return true;
		}
		catch(NumberFormatException e)
		{
			return false;
		}
	}
	String[] parseComm(String cm) // x=Point (6,7)
	{
		cm=cm.trim();
		String[] toret=new String[3];
		String str;
		String ans="";
		String cm2=cm;
		cm2=cm2.substring(cm2.indexOf('=')+1);
		String str2=cm2; String ns;
		CommReader cr=new CommReader(str2);
		while(!cr.over)
		{
			str=cr.nextWord();
			if(str.startsWith("var("))
			{
				ns=str.substring(str.indexOf('(')+1);
				ns=ns.substring(0,ns.length()-1);
				str2=str2.replace(str,getVar(ns.trim()).getValue().trim());
			}
		}
		X.sopln(str2,"green");
		str=Y.cut(str2,' ',1);
		toret[1]=(str.equalsIgnoreCase("Point"))?"P":(str.equalsIgnoreCase("Line") || str.equalsIgnoreCase("GLine"))?"L":(str.equalsIgnoreCase("Val") || str.equalsIgnoreCase("Num") || str.equalsIgnoreCase("Number"))?"V":(str.equalsIgnoreCase("Angle"))?"A":(str.equalsIgnoreCase("expr"))?"E":" ";
		toret[2]=str2.substring(Params.indexOfChar(str2,' ',1));
		toret[0]=Y.cut(cm,'=',1);
		return toret;
	}
}
class Params
{
	Point p1,p2;
	double m,inc;
	double yin,xin;
	GLine ln;
	boolean[] founds=new boolean[] {false,false,false,false,false,false}; //p1,p2,m,inc,yin,xin
	Params()
	{
		
	}
	void addPoint(Point p)
	{
		if(founds[0] && founds[1])
			return;
		if(!founds[0])
		{
			p1=p;
			founds[0]=true;
		}
		else
		{
			p2=p;
			founds[1]=true;
		}
	}
	public static int indexOfChar(String str,char ch,int occ)
	{
		int j=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				j++;
				if(j==occ)
					return i;
			}
		}
		return -1;
	}
}
