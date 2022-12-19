import java.io.IOException;
import maths.*;
import commons.*;
public class Angle extends Maths
{
	double angleD,angleR;
	char tp;
	Angle() {}
	Angle(double val)
	{
		angleD=val;
		setangle();
		//angleR=
	}
	Angle(long val)
	{
		angleD=(double)val;
		setangle();
		//angleR=
	}
	Angle(float val)
	{
		angleD=val;
		setangle();
		//angleR=
	}
	Angle(int val)
	{
		angleD=(double)val;
		setangle();
		//angleR=
	}
	void setangle()
	{
		angleD%=360;
		if(angleD==90)
		{
			tp='R';
			return;
		}
		if(angleD==180)
		{
			tp='S';
			return;
		}
		if(angleD<0)
		{
			tp=(char)0;
			return;
		}
		else if(angleD<90)
		{
			tp='A';
			return;
		}
		else if(angleD<180)
		{
			tp=(char)'O';
			return;
		}
		else if(angleD<270)
		{
			tp='r';
			return;
		}
		else
			tp='r';
	}
}
