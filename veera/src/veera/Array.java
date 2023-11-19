package veera;
import java.util.*;
public class Array {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,j,k;
		int [][] a = new int[2][];
		a[0]=new int[3];
		a[1] =new int [2];
		System.out.println(a[0].length);
		System.out.println(a[1].length);
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
			System.out.println("theages are the "+i);
			a[i][j]=sc.nextInt();
			}
			System.out.println("the ages are the ");
			for(i=0;i<a.length;i++)
			{
				for(j=0;j<a[i].length;j++)
				{
				System.out.println(a[i][j]);
			
		}
		
	}
}
}
}