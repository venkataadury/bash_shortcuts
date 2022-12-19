import maths.matrices.*;
import maths.Maths;
import commons.X;

public class MatDet
{
	public static void main(String[] args)throws Exception
	{
		SquareMatrix sm=new SquareMatrix(Matrix.inputMatrix());
		X.sopln(sm.getDeterminant());
	}
}
