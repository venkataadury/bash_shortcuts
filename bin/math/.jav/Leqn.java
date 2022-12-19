import java.io.*;
import maths.Point;
import maths.GLine;
import commons.*;
public class Leqn
{
	public static void main(String args[])
	{
		Point p1,p2;
		String t1=args[0];
		String t2=args[2];
		String s1=args[1];
		String s2=args[3];
		
		GLine gl1=new GLine(s1,s2,t1,t2);
		gl1.printEqn();
		/*Point p=new Point(2,7);
		X.sopln(gl1.onLine(p));*/
	}
	
}
