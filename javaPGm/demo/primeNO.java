package demo;
import java.util.*;

public class primeNO {

	public static void main(String[] args)
	{
		int n,i,count=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number do u want to check prime or not\n");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		
		if(count==2)
		{
			System.out.println("Number is prime....");
			
		}
		else
		{
			System.out.println("Number is not prime....");
		}
		
	}

}
