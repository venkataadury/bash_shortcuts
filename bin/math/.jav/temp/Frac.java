import java.io.*;
public class Frac
{
	int x,y;
	double val;
	Frac(int a,int b)
	{
		x=a; y=b;
		val=(double)a/(double)b;
	}
	Frac(String s)
	{
		x=X.ipi(Y.cut(s,'/',1));
		y=X.ipi(Y.cut(s,'/',2));
	}
	void lowest()
	{
		int hcf=Maths.hcf(x,y);
		x=x/hcf; y=y/hcf;
	}
	double dec()
	{
		return val;
	}
}
