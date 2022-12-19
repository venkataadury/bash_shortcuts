import java.io.IOException;
import maths.Maths;
import commons.X;
public class Try1
{
	public static void main(String args[])throws IOException
	{
		int r=X.rI("Enter radius: ");
		X.sopln(Maths.PI*r*r);
		X.sopln(Maths.practicalPI*r*r);
		X.sopln(Maths.PI/Maths.practicalPI);
		X.sopln(Maths.practicalPI/Maths.PI);
	}
}
