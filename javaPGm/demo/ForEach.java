package demo;
import java.util.Scanner;
public class ForEach 
{
	public static void main(String args[])
	{
		int size,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ente the size of array");
		size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the array elemeents....");

		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Dispplay array elements by using foreeach.....");
		for(int b:a)
		{
			System.out.print(+b +" ");
		}
		
		
		System.out.println("\nsearch the given element is found or not...");
		int search,flag=0;
		System.out.println("Enter the serch value");
		search=sc.nextInt();
		for(int b:a)
		{
			flag=0;
			if(b==search)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Element is found.....");
		}
		else
		{
			System.out.println("Not found.....");
		}
		
		
		
		
		System.out.println("\nEven number from array");
		for(int b:a)
		{
			if(b%2==0)
			{
				System.out.print(+b+ " ");
			}
		}
		
		
		
		
	}

}
