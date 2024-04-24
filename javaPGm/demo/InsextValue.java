package demo;
import java.util.Scanner;
public class InsextValue
{
  public static void main(String[] args)
  {
	  int size,i,index,value;
	  System.out.println("Enter the size of array....");
	  Scanner sc=new Scanner(System.in);
	  size=sc.nextInt();
	  
	  int a[]=new int[size];
	  System.out.println("Enter the array elements ......");
	  for(i=0;i<size;i++)
	  {
		  a[i]=sc.nextInt();
	  }
	
		
		System.out.println("\nEnter the index");
		index=sc.nextInt();
		
		System.out.println("Enter the value do u wnat to insert");
		value=sc.nextInt();
		for(i=size-1;i>=index;i--)
		{
			a[i+1]=a[i];
		}
		a[index]=value;
		System.out.println("After inserting value....");
		for(i=0;i<=size;i++)
		{
			System.out.print(a[i]+" \t" );
		}
  }
}
