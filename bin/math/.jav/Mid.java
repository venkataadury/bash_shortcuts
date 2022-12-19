import java.io.*;
import maths.Graph;
import maths.Point;
import commons.*;
public class Mid
{
	public static void main(String args[])throws IOException
	{
		double[] p1,p2;
		Graph graph1=null;
		try
		{
			graph1=new Graph(100,100);
			p1=graph1.mkPoint(args[0]);
			p2=graph1.mkPoint(args[1]);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return;
		}
		X.sopln(graph1.wrtPoint(graph1.midPoint(p1,p2)));
	}
}
