package veera;
import java.util.*;
public class Sravani {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,j,k;
		int[][][]a=new int[2][][];
		a[0]=new int[5][];
		a[1]=new int[4][];
		a[0][0]=new int[1];
		a[0][1]=new int[1];
		a[0][2]=new int[1];
		a[0][3]=new int[1];
		a[0][4]=new int[1];
		a[1][0]=new int[2];
		a[1][1]=new int[2];
		a[1][2]=new int[2];
		a[1][3]=new int[2];
		for(i=0;i<a.length;i++)	
		{
			for(j=0;j<a[i].length;j++)
			{
				for(k=0;k<a[i][j].length;k++)
				{
					System.out.println("the states are the"+i+"the restaranet"+j+"suborninate"+k);
					a[i][j][k]=sc.nextInt();
				}
				System.out.println("the restaren are the below");
				for(i=0;i<a.length;i++)	
				{
					for(j=0;j<a[i].length;j++)
					{
						for(k=0;k<a[i][j].length;k++)
						{
							System.out.println(a[i][j][k]);
			}
		}
		
	}
}
}
}
}
			
