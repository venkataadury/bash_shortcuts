import java.io.IOException;
import maths.*;
import commons.*;
public class PoL
{
	public static void main(String args[])throws IOException
	{
		try
		{
			Point p=new Point(args[1]);
			String t1=args[0];
			GLine gl1=new GLine(t1);
			if(gl1.pointOnLine(p))
				X.sopln("Yes");
			else
				X.sopln("No");
		}
		catch(Exception e)
		{
			X.sepln("Error occured.");
			e.printStackTrace();
			return;
		}
	}
}
