import commons.*;
import maths.*;
public class EXPR extends Maths
{
	public static final char[] operators=new char[] {'+','-','*','/'};
	public static double arithmetic(String in)
	{
		 // "3+4/5-24*2+2"
		while(hasOp(in,operators))
		{
			
		}
		return 0;
	}
	

	public static boolean hasOp(String in,char[] chs)
	{
		for(char c : chs)
		{
			if(in.indexOf(c)!=-1)
				return true;
		}
		return false;
	}
}
