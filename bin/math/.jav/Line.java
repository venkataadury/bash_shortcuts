import java.io.*;
import maths.*;
import commons.*;
import java.util.*;
public class Line
{
	double length;
	Point Start=new Point(0,0);
	Point End;
	Line(double len)
	{
		length=len;
		End=new Point(0,len);
	}
	Line(int len)
	{
		length=len;
		End=new Point(0,len);
	}
	Line(Point p1,Point p2)
	{
		Start=p1;
		End=p2;
		Graph g1=new Graph(100,100);
		length=g1.dist(Start,End);
	}
	Line(double[] p1,double[] p2)
	{
		Graph g1=new Graph(100,100);
		if(g1.isValidPoint(p1) && g1.isValidPoint(p2))
		{
			Start=new Point(p1);
			End=new Point(p2);
			length=g1.dist(Start,End);
		}
		else
			X.sepln("Invalid point");
	}
}
