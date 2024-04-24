package javaDemo;
import java.util.Scanner;
public class Perfect1ToN 
{
    public static void main(String args[])
    {
    	int range,i,j,sum=0;
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("Enter the range");
    	range=sc.nextInt();
    	System.out.println("perfect numbers are.....");
    	for(i=1;i<range;i++)
    	{
    	    sum=0;
    		for(j=1;j<i;j++)
    		{
    			if(i%j==0)
    			{
    				sum=sum+j;
    			}
    		}
    		if(sum==i)
    		{
    			System.out.print(i +"\t");
    		}
    	}
    }
}
