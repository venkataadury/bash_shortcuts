import java.io.*;
import maths.Graph;
import maths.Point;
import commons.*;
public class Dist
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
		double ans=graph1.dist(p1,p2);
		if(X.isint(ans))
			X.sopln((int)ans);
		else
			X.sopln(graph1.distSq(p1,p2));
	}
}
