import java.io.*;
public class Maths
{
	static int roundK=3;
	static final double PI=219911.0000D/70000.000D;
	static final double practicalPI=22D/7D;
	Graph g1=new Graph(100,100);
	public static int addInt(String a,String b)
	{
		return X.ipi(a)+X.ipi(b);
	}
	public static float addFloat(String a,String b)
	{
		return X.fpf(a)+X.fpf(b);
	}
	public static double addDouble(String a,String b)
	{
		return X.dpd(a)+X.dpd(b);
	}
	public static long addLong(String a,String b)
	{
		return X.lpl(a)+X.lpl(b);
	}
	public static int subInt(String a,String b)
	{
		return X.ipi(a)-X.ipi(b);
	}
	public static float subFloat(String a,String b)
	{
		return X.fpf(a)-X.fpf(b);
	}
	public static double subDouble(String a,String b)
	{
		return X.dpd(a)-X.dpd(b);
	}
	public static long subLong(String a,String b)
	{
		return X.lpl(a)-X.lpl(b);
	}
	
	public static int Sum(int[] a)
	{
		int sum=0,l=a.length;
		for(int i=0;i<l;i++)
			sum+=a[i];
		return sum;
	}
	public static float Sum(float[] a)
	{
		float sum=0;
		int l=a.length;
		for(int i=0;i<l;i++)
			sum+=a[i];
		return sum;
	}
	public static double Sum(double[] a)
	{
		double sum=0;
		int l=a.length;
		for(int i=0;i<l;i++)
			sum+=a[i];
		return sum;
	}
	public static long Sum(long[] a)
	{
		long sum=0;
		int l=a.length;
		for(int i=0;i<l;i++)
			sum+=a[i];
		return sum;
	}
	public static double round(double no,int n)
	{
		double res = ((double) Math.round(no * Math.pow(10,n))) / Math.pow(10,n);
		return res;
	}
	public static double sin(double angle)
	{
		double ans=Math.sin(Math.toRadians(angle));
		ans=round(ans,roundK);
		return ans;
	}
	public static double sin(int angle)
	{
		double ans=Math.sin(Math.toRadians(angle));
		ans=round(ans,roundK);
		return ans;
	}
	public static double sin(float angle)
	{
		double ans=Math.sin(Math.toRadians(angle));
		ans=round(ans,roundK);
		return ans;
	}
	public static double sin(long angle)
	{
		double ans=Math.sin(Math.toRadians(angle));
		ans=round(ans,roundK);
		return ans;
	}
	public static double sin(String angle)
	{
		double ans=Math.sin(Math.toRadians(X.dpd(angle)));
		ans=round(ans,roundK);
		return ans;
	}
	public static double cos(double angle)
	{
		double ans=Math.cos(Math.toRadians(angle));
		ans=round(ans,roundK);
		return ans;
	}
	public static double cos(int angle)
	{
		double ans=Math.cos(Math.toRadians(angle));
		ans=round(ans,roundK);
		return ans;
	}
	public static double cos(float angle)
	{
		double ans=Math.cos(Math.toRadians(angle));
		ans=round(ans,roundK);
		return ans;
	}
	public static double cos(long angle)
	{
		double ans=Math.cos(Math.toRadians(angle));
		ans=round(ans,roundK);
		return ans;
	}
	public static double cos(String angle)
	{
		double ans=Math.cos(Math.toRadians(X.dpd(angle)));
		ans=round(ans,roundK);
		return ans;
	}
	
	public static double tan(double angle)
	{
		double ans=Math.tan(Math.toRadians(angle));
		ans=round(ans,roundK);
		return ans;
	}
	public static double tan(int angle)
	{
		double ans=Math.cos(Math.toRadians(angle));
		ans=round(ans,roundK);
		return ans;
	}
	public static double tan(float angle)
	{
		double ans=Math.cos(Math.toRadians(angle));
		ans=round(ans,roundK);
		return ans;
	}
	public static double tan(long angle)
	{
		double ans=Math.cos(Math.toRadians(angle));
		ans=round(ans,roundK);
		return ans;
	}
	public static double tan(String angle)
	{
		double ans=Math.tan(Math.toRadians(X.dpd(angle)));
		ans=round(ans,roundK);
		return ans;
	}
	
	public static double cot(double angle)
	{
		double ans=1/(Math.tan(Math.toRadians(angle)));
		ans=round(ans,roundK);
		return ans;
	}
	public static double cot(int angle)
	{
		double ans=1/(Math.tan(Math.toRadians(angle)));
		ans=round(ans,roundK);
		return ans;
	}
	public static double cot(float angle)
	{
		double ans=1/(Math.tan(Math.toRadians(angle)));
		ans=round(ans,roundK);
		return ans;
	}
	public static double cot(long angle)
	{
		double ans=1/(Math.tan(Math.toRadians(angle)));
		ans=round(ans,roundK);
		return ans;
	}
	public static double cot(String angle)
	{
		double ans=1/(Math.tan(Math.toRadians(X.dpd(angle))));
		ans=round(ans,roundK);
		return ans;
	}
	public static double sec(double angle)
	{
		double ans=1/(Math.cos(Math.toRadians(angle)));
		ans=round(ans,roundK);
		return ans;
	}
	public static double sec(int angle)
	{
		double ans=1/(Math.cos(Math.toRadians(angle)));
		ans=round(ans,roundK);
		return ans;
	}
	public static double sec(long angle)
	{
		double ans=1/(Math.cos(Math.toRadians(angle)));
		ans=round(ans,roundK);
		return ans;
	}
	public static double sec(float angle)
	{
		double ans=1/(Math.cos(Math.toRadians(angle)));
		ans=round(ans,roundK);
		return ans;
	}
	public static double sec(String angle)
	{
		double ans=1/(Math.cos(Math.toRadians(X.dpd(angle))));
		ans=round(ans,roundK);
		return ans;
	}
	
	public static double cosec(double angle)
	{
		double ans=1/(Math.sin(Math.toRadians(angle)));
		ans=round(ans,roundK);
		return ans;
	}
	public static double cosec(int angle)
	{
		double ans=1/(Math.sin(Math.toRadians(angle)));
		ans=round(ans,roundK);
		return ans;
	}
	public static double cosec(float angle)
	{
		double ans=1/(Math.sin(Math.toRadians(angle)));
		ans=round(ans,roundK);
		return ans;
	}
	public static double cosec(long angle)
	{
		double ans=1/(Math.sin(Math.toRadians(angle)));
		ans=round(ans,roundK);
		return ans;
	}
	public static double cosec(String angle)
	{
		double ans=1/(Math.sin(Math.toRadians(X.dpd(angle))));
		ans=round(ans,roundK);
		return ans;
	}
	public static int hcf(int a,int b)
	{
		if(a==0 && b==0)
			return 2/0;
		if(a==0 || b==0)
			return Math.max(a,b);
		int c=Math.min(a,b)/2;
		for(int i=c;i>=1;i++)
		{
			if(a%i==0 && b%i==0)
			{
				return i;
			}
		}
		return 1;
	}
	public static char signOf(double n)
	{
		if(n>0)
			return '+';
		else
			return (char)0;
	}
	public static String sqrt(double val)
	{
		double ans=Math.sqrt(val);
		if(X.isint(val))
			return Integer.toString((int)val);
		else
			return "sqrt <"+((int)val)+">";
	}
	public static int gcd(int i,int j)
	{
		return hcf(i,j);
	}
}
