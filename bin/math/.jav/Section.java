import java.io.*;
import maths.*;
import commons.*;
public class Section
{
	public static void main(String[] args)throws IOException
	{
		double[] p1=new double[] {0,0};
		double[] ip1,ip2;
		int sect=0,n=0;
		boolean flag=false;
		Graph graph1=null;
		try
		{
			graph1=new Graph(100,100);
			ip1=graph1.mkPoint(args[0]);
			ip2=graph1.mkPoint(args[1]);
			sect=X.ipi(args[2]);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return;
		}
		try
		{
			n=X.ipi(args[3]);
		}
		catch(Exception e2)
		{
			flag=true;
		}
		Point pt1=new Point(ip1);
		Point pt2=new Point(ip2);
		if(flag)
		{
			X.sopln("The points are: ","cyan");
			graph1.printPoints(graph1.section(pt1,pt2,(long)sect));
		}
		else
			X.sopln(graph1.wrtPoint(graph1.section(pt1,pt2,sect,n)));
		return;
	}
}
		
