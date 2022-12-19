import java.io.*;
import maths.*;
import commons.*;
public class Pnom
{
	double[] coefs;
	double equa=0;
	String exp;
	Pnom()throws IOException
	{
		X.sop("Enter eqn: ","yellow");
		exp=X.rL().trim().replace("^","");
		parseEq();
	}
	Pnom(String eq)
	{
		exp=eq;
		parseEq();
	}
	public void parseEq()
	{
		String exp2=exp;
		if(X.haschar(exp,'='))
		{
			equa=X.dpd(Y.cut(exp,'=',2).trim());
			exp=Y.cut(exp,'=',1).trim();
		}
		int spc=X.countchar(exp,' ')+1;
		coefs=new double[spc];
		String cpc;
		int k=0;
		for(int i=spc-1;i>=0;i--)
		{
			cpc=Y.cut(exp,' ',i+1).trim().toLowerCase().replace("+","").trim();
			if(X.haschar(cpc,'x'))
				cpc=Y.cut(cpc,'x',1);
			if(cpc.equals(""))
				cpc="1";
			coefs[k]=X.dpd(cpc);
			k++;
		}
		exp=exp2;
	}
	public boolean isX(int x)
	{
		double sum=0;
		for(int i=0;i<coefs.length;i++)
			sum+=coefs[i]*Math.pow(x,i);
		return sum==equa;
	}
	String factorize()
	{
		return null;
	}
	void printEqn()
	{
		X.sopln(exp,"red");
	}
	void derEqn()
	{
		for(double d : coefs)
			X.sop(d+",");
		X.sopln();
	}
}
