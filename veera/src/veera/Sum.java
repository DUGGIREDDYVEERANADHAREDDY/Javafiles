package veera;
import java.util.*;
public class Sum {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("please enter  number");
		int number = sc.nextInt();
		int digit =sumofnumber(number);
		System.out.print("the sum of the "+number+"is:-"+digit);
	}
	public static int sumofnumber(int n)
	{
		int sum=0;
		while(n>0)
		{
			int digit =n%10;
			sum+=digit;
			n/=10;
		}
		return sum;
		
	}

}
