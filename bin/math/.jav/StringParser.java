import java.io.*;
import commons.*;
public final class StringParser
{
	String orig;
	int nsp=0;
	String cwd="";
	int csp=1;
	boolean end=false;
	StringParser() {}
	StringParser(String s)
	{
		orig=s;
		nsp=X.countchar(orig,' ');
		csp=1;
	}
	public String nextWord()
	{
		if(nsp<=0)
		{
			end=true;
			return orig;
		}
		if(csp>nsp)
		{
			end=true;
			csp=1;
		}
		return Y.cut(orig,' ',csp++);
	}
}
