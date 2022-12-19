//import 
public class LargeInt
{
	String val;
	LargeInt(int i)
	{
		val=""+i;
	}
	LargeInt(long i)
	{
		val=""+i;
	}
	LargeInt(float i)
	{
		val=""+i;
	}
	LargeInt(double i)
	{
		val=""+i;
	}
	LargeInt(char i)
	{
		val=""+(int)i;
	}
	LargeInt(String i)
	{
		val=i;
	}
	String flip(String s)
	{
		String res="";
		for(int i=s.length()-1;i>=0;i--)
			res+=s.charAt(i);
		return res;
	}
	void printno()
	{
		//X.sopln(val);
		int i=0;
		while(true)
		{
			X.sop(first5(i));
			i+=5;
			if(i>=val.length())
				break;
		}
		X.sopln();
	}
	void add(LargeInt l1) //1234567887654321 + 17875784
	{
		//l1.val
		//val
		String s1,s2;
		s1=val; s2=l1.val;
		if(s2.length()>s1.length())
		{
			String s3=s2;
			s2=s1;
			s1=s3;
		}
		int diff=s1.length()-s2.length();
		String extra;
		if(diff>0)
			extra=s1.substring(0,diff);
		else
			extra="";
		s1=flip(s1);
		s2=flip(s2);
		int j=0,k=0;
		String res="";
		int i=0;
		X.sopln(extra,"red");
		while(true)
		{
			k=next5(i)+l1.next5(i);
			if(j==1)
				k++;
			if((""+k).length()>5)
			{
				j=1;
				k=k%100000;
			}
			else
				j=0;
			res=k+res;
			i+=5;
			if(i>s2.length())
				break;
			
		}
		X.sopln(res,"green");
		if(res.length()>s1.length())
		{
			val=res;
			return;
		}
		if(j>0)
		{
			extra=flip(s1).substring(0,s1.length()-res.length());
			LargeInt nli=new LargeInt(extra);
			nli.add(new LargeInt("1"));
			val=nli.val+res;
		}
		else
		{
			extra=flip(s1).substring(0,s1.length()-res.length());
			X.sopln(extra);
			val=extra+res;
		}
	}
	void Trim()
	{
	}
	int next5(int c) //12345678910
	{
		int x=5;
		String eval=flip(val);
		String added="";
		for(int i=c;i<c+5;i++)
		{
			try
			{
				added+=eval.charAt(i);
			}
			catch(Exception e)
			{
				break;
			}
		}
		return X.ipi(flip(added.trim()));
	}
	int first5(int c)
	{
		String added="";
		for(int i=c;i<c+5;i++)
		{
			try
			{
				added+=val.charAt(i);
			}
			catch(Exception e)
			{
				break;
			}
		}
		return X.ipi(added.trim());
	}
	void printNo()
	{
		X.sopln(val);
	}
	public static void main(String args[])
	{
		LargeInt i1=new LargeInt("123456789");
		LargeInt i2=new LargeInt("123456789");
		/*i1.printno();
		i2.printNo();*/
		i1.add(i2);
		i1.printNo();
	}
}
