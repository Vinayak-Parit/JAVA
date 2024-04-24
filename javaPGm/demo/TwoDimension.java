package demo;
import java.util.Scanner;
public class TwoDimension {
	public static void main(String[] args)
	{
		int a[][]=new int[3][3],i,j;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the array elements.......");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Array elements are.....");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("tringale first");
	
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
			  
				if(i>=j)
				{
					System.out.print(a[i][j]+"\t");
				}
			 
		    }
			System.out.println();
		}
		
		System.out.println("tringale second...");

		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(j>=i)
				{
					System.out.print(a[i][j]+"\t");


				}
			

			}
			System.out.println();

		}
	
	}

}
