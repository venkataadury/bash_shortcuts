import java.io.IOException;
public class ArrayUser extends ArrayFx
{
	public static void main(String[] args)throws IOException
	{
		String type="";
		X.sop("Enter a string: ","yellow");
		type=X.rL();
		String[] a=splitString(type,'-');
		printArray(a);
		int[] q=new int[] {1,2,3,4};
		IntConv ob=new IntConv(q);
		/*int[] b;
		X.sop("Enter word to search: ","red");
		float v=X.rL();*/
			//X.sopln(Bsearch(a,v));
	}
}
