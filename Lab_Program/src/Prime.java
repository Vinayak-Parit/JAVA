    import java.util.*;
	class Prime
	{
	   public static void main(String[]args)
	   {
	      int n,i,j,count=0;
	      Scanner sc=new Scanner(System.in);

	      System.out.println("Enter the size of array:");
	      n=sc.nextInt();

	      int a[]=new int[n];
	      System.out.println("Enter the array elements:");
	      for(i=0;i<n;i++)
	      {
	         a[i]=sc.nextInt();
	      }

	      System.out.println("\nPrime Elements are");

	      for(i=1;i<=n;i++)
	      { count=0;
	          for(j=1;j<=i/j;j++)
	          {
	             if(i%j==0)
	             {
	                 count++;
	             }
	             if(count==1)
	             {
	                System.out.println(i+"\t");
	             }
	          }
	      }
	     }
	}
	      

}
