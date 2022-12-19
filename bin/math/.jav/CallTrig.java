import maths.*;
import commons.*;
import java.io.IOException;
public class CallTrig extends Maths
{
	public static void main(String args[])throws IOException
	{
		if(args[0]==null || args[1]==null)
			return;
		args[0]=args[0].trim();
		args[1]=args[1].trim();
		if(args[0].equalsIgnoreCase("sin"))
			X.sop(""+sin(args[1]),"red");
		if(args[0].equalsIgnoreCase("cos"))
			X.sop(""+cos(args[1]),"red");
		if(args[0].equalsIgnoreCase("tan"))
			X.sop(""+tan(args[1]),"red");
		if(args[0].equalsIgnoreCase("cot"))
			X.sop(""+cot(args[1]),"red");
		if(args[0].equalsIgnoreCase("sec"))
			X.sop(""+sec(args[1]),"red");
		if(args[0].equalsIgnoreCase("cosec"))
			X.sop(""+cosec(args[1]),"red");
		X.sopln();
	}
}
