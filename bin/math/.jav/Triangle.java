import java.io.*;
import maths.*;
import commons.*;
public class Triangle
{
	String type; //i
	double s1,s2,s3; //i
	double area,perimeter; //i
	double a1,a2,a3; 
	Line l1,l2,l3;
	Line[] lines;
	Triangle(double si1,double si2,double si3)
	{
		s1=si1; s2=si2; s3=si3;
		gettype();
		double S=(s1+s2+s3)/2;
		double S1=S*(S-s1)*(S-s2)*(S-s3);
		area=Math.sqrt(S1);
		perimeter=s1+s2+s3;
		l1=new Line(s1);
		l2=new Line(s2);
		l3=new Line(s3);
	}
	Triangle(Line li1,Line li2,Line li3)
	{
		l1=li1; l2=li2; l3=li3;
		Line[] lns=new Line[2];
		lns[0]=l1; lns[1]=l2; lns[2]=l3;
		s1=l1.length; s2=l2.length; s3=l3.length;
		double S=(s1+s2+s3)/2;
		double S1=S*(S-s1)*(S-s2)*(S-s3);
		area=Math.sqrt(S1);
		perimeter=s1+s2+s3;
		gettype();
	}
	void gettype()
	{
		if(s1+s2<=s3 || s2+s3<=s1 || s3+s1<=s2)
		{
			X.sepln("Illegal dimensions for triangle. Sum of two sides is always more than the third side");
			s1=s2=s3=0;
			return;
		}
		if(s1==s2)
		{
			if(s2==s3)
				type="Equilateral";
			else
				type="Isosceles";
		}
		if(s1==s3)
		{
			if(s2==s3)
				type="Equilateral";
			else
				type="Isosceles";
		}
		if(s3==s2)
		{
			if(s1==s3)
				type="Equilateral";
			else
				type="Isosceles";
		}
		if(s1!=s2 && s2!=s3 && s1!=s3)
			type="Scalene";
	}
	Triangle(double si1,double si2,double si3,String init)
	{
		if(init.equalsIgnoreCase("SSS"))
		{
			s1=si1; s2=si2; s3=si3;
			gettype();
		}
		else if(init.equalsIgnoreCase("SAS"))
		{
			s2=si1;
			s3=si3;
			a1=si2;
			
		}
		double S=(s1+s2+s3)/2;
		double S1=S*(S-s1)*(S-s2)*(S-s3);
		area=Math.sqrt(S1);
		perimeter=s1+s2+s3;
	}
}
