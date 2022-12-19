import maths.*;
import maths.equations.*;
import commons.*;
import java.io.IOException;

public class SolveSimultaneousInEquations
{
	public static void main(String[] args)throws IOException
	{
		String[] str=X.testedInput(args,new String[] {"Enter inequation 1: ","Enter inequation 2: ","Enter Belonging set (I or R): "});
		InEquation ie1,ie2;
		ie1=new InEquation(str[0]);
		ie2=new InEquation(str[1]);
		str[2]=str[2].trim().toUpperCase();
		NumberSet ns=new NumberSet(ie1.solveIneq(),ie2.solveIneq(),str[2].charAt(0)=='R');
		ns.represent("green");
		ns.drawLine();
	}
}
