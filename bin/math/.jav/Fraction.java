import java.io.IOException;
import maths.*;
import commons.*;
public class Fraction extends Maths implements Comparable<Fraction>,Ratios
{
	int num,den=1;
	int multip=1;
	Fraction()
	{
		num=0;
	}
	Fraction(int n,int d)
	{
		num=n;
		den=d;
		this.adjust();
	}
	Fraction(int i)
	{
		num=i;
		this.adjust();
	}
	Fraction(long i)
	{
		this((int)i);
	}
	Fraction(float f)
	{
		parse((double)f);
	}
	Fraction(double d)
	{
		parse(d);
	}
	public Fraction add(Fraction f2)
	{
		int n1=num,d1=den;
		int n2=f2.num,d2=f2.den;
		Fraction f=new Fraction();
		f.num=n1*d2+n2*d1;
		f.den=d1*d2;
		return f;
	}
	public Fraction subtract(Fraction f2)
	{
		int n1=num,d1=den;
		int n2=f2.num,d2=f2.den;
		Fraction f=new Fraction();
		f.num=n1*d2-n2*d1;
		f.den=d1*d2;
		return f;
	}
	public Fraction multiply(Fraction f2)
	{
		return new Fraction(num*f2.num,den*f2.den);
	}
	public Fraction divide(Fraction f2)
	{
		return new Fraction(this.calc()/f2.calc());
	}
	public Fraction square()
	{
		return this.multiply(this);
	}
	public int compareTo(Fraction f2)
	{
		double d1=this.calc();
		double d2=f2.calc();
		return (int)(d1-d2);
	}
	public double calc()
	{
		return (double)((double)num/(double)den);
	}
	private void parse(double v)
	{
		String s=""+v; // 0.8
		String s1=Y.cut(s,'.',1);
		String s2=Y.cut(s,'.',2);
		int mv=X.ipi(s1);
		if(s2.endsWith("0"))
		{
			num=mv;
			return;
		}
		den=(int)Math.pow(10,s2.length());
		num=mv*den+X.ipi(s2);
		this.adjust();
	}
	private void adjust()
	{
		int gc=(int)Maths.hcf(num,den);
		num/=gc;
		den/=gc;
		multip=gc;
	}
	void printFrac()
	{
		printFrac("White");
	}
	void printFrac(String col)
	{
		X.sopln(num+"/"+den,col);
	}
	void typeFrac()
	{
		typeFrac("White");
	}
	void typeFrac(String col)
	{
		X.sop(num+"/"+den,col);
	}
	void printRatio()
	{
		printRatio("White");
	}
	void printRatio(String col)
	{
		X.sopln(num+":"+den,col);
	}
	void typeRatio()
	{
		typeRatio("White");
	}
	void typeRatio(String col)
	{
		X.sop(num+":"+den,col);
	}
	void printWholeFrac(String col)
	{
		X.sopln(num*multip+"/"+den*multip,col);
	}
	void printWholeFrac()
	{
		printWholeFrac("White");
	}
	public static void main(String[] args)throws IOException
	{
		X.sop("Enter decimal value: ","yellow");
		Fraction f=new Fraction(X.dpd(X.rL()));
		f.printWholeFrac();
		f.printFrac("red");
	}
}
