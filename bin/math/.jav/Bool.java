import maths.*;
import commons.*;
import java.io.IOException;
public class Bool
{
	boolean v;
	Bool(boolean b)
	{
		v=b;
	}
	Bool(int i)
	{
		if(i==0)
			v=true;
		else
			v=false;
	}
	Bool()
	{
		v=false;
	}
	boolean eq()
	{
		return v;
	}
	void set(boolean b)
	{
		v=b;
	}
	void flip()
	{
		if(v)
			v=false;
		else
			v=true;
	}
	int getV()
	{
		if(v)
			return 0;
		else
			return 1;
	}
}
