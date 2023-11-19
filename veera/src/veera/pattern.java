package veera;
import java.util.*;
public class pattern {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,j;
		 int[] a=new int [5];
		 for(i=0;i<5;i++)
		 {
		 System.out.println("the ages are the "+i);
		 a[i]=sc.nextInt();
		 }
		 System.out.println("the agres are the ");
		 for(i=0;i<5;i++)
		 {
		 System.out.print(a[i]+" ");
		 }
		 System.out.println();
	}
}
