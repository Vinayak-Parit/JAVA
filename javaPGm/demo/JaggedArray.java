package demo;
import java.util.Scanner;
public class JaggedArray {
	public static void main(String args[])
	{
		int a[][]=new int[3][],i,j; //jagged array]
		a[0]=new int[3];
		a[1]=new int[4];
		a[2]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements....");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Array elements are......");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
