package demo;
import java.util.Scanner;
public class pgm2{

	public static void main(String[] agrs)
	{
		int n,i,sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the number:=");
		n=sc.nextInt();
		
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
			  sum=sum+i;
			}
		}
		
		if(sum==n)
		{
			System.out.println("\nNumber is perfect.....");
		}
		else
		{
			System.out.println("\nNUmber is not perfect....");
		}
		
	}
}
