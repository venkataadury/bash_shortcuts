import java.io.*;
public class Matrix
{
	Double[][] mat;
	int rows,columns;
	String mname;
	
	Matrix() {mat=new Double[0][0];SETUP();}
	Matrix(Integer[][] m) {setM(m);SETUP();}
	Matrix(Long[][] m) {setM(m);SETUP();}
	Matrix(Float[][] m) {setM(m);SETUP();}
	Matrix(Double[][] m) {mat=m;SETUP();}
	public void setM(Number[][] m)
	{
		Double[][] n=new Double[m.length][m[0].length];
		Number[] mp;
		for(int i=0;i<m.length;i++)
		{
			mp=m[i];
			for(int j=0;j<mp.length;j++)
				n[i][j]=(Double)m[i][j];
		}
		mat=n;
	}
	void SETUP()
	{
		rows=mat.length;
		columns=mat[0].length;
	}
	public void print()
	{
		for(int h=0;h<mat.length;h++)
		{
			for(int i=0;i<mat[0].length;i++)
				X.sop(mat[h][i]+"\t");
			X.sopln();
		}
	}
	public static void main(String[] args)throws IOException
	{
		Integer[][] m1=new Integer[][] {{2,3,4},{8,12,15},{19,23,12},{96,43,67}};
		Matrix m=new Matrix(m1);
		m.print();
	}
}
class Matrices
{
}
