import java.io.*;
import commons.*;
public class CommReader
{
	String comm;
	int spaces;
	int cH=0;
	boolean over;
	CommReader(String com)
	{
		comm=com;
		spaces=X.countchar(comm,' ');
		over=false;
	}
	String nextWord()
	{
		cH++;
		if(cH-1>spaces)
		{
			cH=1;
			over=true;
		}
		return Y.cut(comm,' ',cH);
	}
}
