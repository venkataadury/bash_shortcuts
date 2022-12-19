import java.io.*;
import commons.X;
public class RTheorom
{
	public static void main(String[] args)throws IOException
	{
		Pnom pn=new Pnom();
		pn.derEqn();
		X.sopln("Take a guess: ","yellow");
		int d=X.rI();
		X.sopln(pn.isX(d));
	}
}
