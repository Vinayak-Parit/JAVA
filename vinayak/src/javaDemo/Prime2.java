package javaDemo;
import java.util.Scanner;

class Prime2
{
   public static void main(String[]args)
   {
      int n,i,j,flag=0;
      Scanner sc=new Scanner(System.in);

      System.out.println("Enter the size of array:");
      n=sc.nextInt();

      System.out.println("\nPrime Elements are");

      for(i=2;i<=n;i++)
      {
    	  flag=1;
          for(j=2;j<=i/2;j++)
          {
             if(i%j==0)
             {
                 flag=0;
                 break;
             }
          } 
          if(flag==1)
          {
              System.out.print(i +"\t");
          }

          
      }
     }
}
      
