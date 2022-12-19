import maths.GLine;
import commons.*;
import java.io.IOException;
public class PointOfInter
{
	public static void main(String args[])throws IOException
	{
		GLine gl1=new GLine(args[0]);
		GLine gl2=new GLine(args[1]);
		gl1.printEqn();
		gl2.printEqn();
		gl1.intersect(gl1,gl2).printPoint();
	}
}
