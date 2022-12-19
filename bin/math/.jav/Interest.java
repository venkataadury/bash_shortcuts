import java.io.*;
import commons.*;
public class Interest
{
	public static void main(String args[])throws IOException
	{
		X.sop("1) Prinicipal\n2) Rate\n3) Time\n4) Maturity value\nEnter choice: ");
		int ch=X.rI();
		int rate,time,pri;
		double mv;
		switch(ch)
		{
			case 1:
				X.sop("Enter rate: ");
				rate=X.rI();
				X.sop("Enter time: ");
				time=X.rI();
				X.sop("Enter Maturity value: ");
				mv=(double)X.rF();
				findP(rate,time,mv);
				break;
			case 2:
				X.sop("Enter principal: ");
				pri=X.rI();
				X.sop("Enter time: ");
				time=X.rI();
				X.sop("Enter Maturity value: ");
				mv=(double)X.rF();
				findR(pri,time,mv);
				break;
			case 3:
				X.sop("Enter rate: ");
				rate=X.rI();
				X.sop("Enter prinicipal: ");
				pri=X.rI();
				X.sop("Enter Maturity value: ");
				mv=(double)X.rF();
				findT(rate,pri,mv);
				break;
			case 4:
				X.sop("Enter rate: ");
				rate=X.rI();
				X.sop("Enter time: ");
				time=X.rI();
				X.sop("Enter prinicipal: ");
				pri=X.rI();
				findM(rate,time,pri);
				break;
			default:
				X.sepln("Error: Wrong choice.");
				return;
		}
	}
	public static void findP(int r,int tim,double mv)
	{
		// MV= P*n + r/100*1/12*P*(n*n+1)  -- Mv= P(n+r/1200*n*n+1)
		double s1=(double)((tim+(r/(double)1200)*tim*(tim+1))/2.00);
		double p=mv/s1;
		X.sopln("The prinicipal is: "+p);
	}
	public static void findR(int p,int tim,double mv)
	{
		// MV -P*n = r/1200*P(n*(n+1)) -- 
		double s1= (double)((mv-(p*tim))*1200.00/(tim*(tim+1)));
	}
	public static void findM(int p,int r,int t)
	{
	}
	public static void findT(int p,int r,double mv)
	{
	}
}
