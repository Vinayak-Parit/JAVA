package demo;
import static java.lang.Math.*;
import java.util.Scanner;
public class ArmstronNu {
	public static void main(String arg[])
	{
		int n,rem,count=0,fSum=0;
				double p=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		int temp=n;

		while(n>0)
		{
		     rem=n%10;
				n=n/10;

			++count;

		}
		System.out.println(count);
		n=temp;
		while(n!=0)
		{
			rem=n%10;
			n=n/10;

		    p=Math.pow((double)rem,(double)count);
            fSum=fSum +(int)p;
		}
	    System.out.println(fSum);
	    
	    
		if(fSum==temp)
		{
			System.out.println("Number is armstrong....");
			
		}
		else
		{
			System.out.println("Number not armstrong......");
			
		}
		
	}

}
