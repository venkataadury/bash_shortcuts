import java.io.IOException;
import maths.GLine;
import commons.X;
public class SlopeOf
{
	public static void main(String args[])throws IOException
	{
		GLine gl=new GLine(args[0]);
		X.sopln("Slope: "+gl.m);
		X.sopln("Y-intercept: "+gl.c);
	}
}
