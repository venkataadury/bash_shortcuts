import maths.*;
import maths.equations.*;
import commons.*;
import java.io.IOException;
public class SolveSingleVarEqn
{
	/*
		This Solver is a combined solver for both equations and inequations
		it takes block input with 'x' as the ONE AND ONLY VARIABLE:
			a+b  ==> a +b
			a-b ==> a -b
			(*),(/) in fractions:
				 2*x ==> 2x
				 x/2 ==> x/2
				 3/4*x ==> 3x/4
			(a+b)/c ==> a+b/c
			a + b/c ==> a +b/c
			4/5*x + 35 ==> 4x/5 +35
			
			No brackets (Stick together without spaces)
			NO VARIABLE CAN BE IN THE DENOMINATOR
	*/
	public static void main(String[] args)throws IOException
	{
		X.clear();
		Balanced eq=null;
		String eqn;
		if(args.length<=0)
		{
			X.sop("Enter the equation/inequation: ","yellow");
			eqn=X.rL().trim();
		}
		else
			eqn=args[0];
		if(Equation.isCompatible(eqn))
			eq=new Equation(eqn);
		else
			eq=new InEquation(eqn);
		eq.solveForX();
	}
}
