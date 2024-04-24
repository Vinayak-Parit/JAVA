package primeprograme;

public class PerfectNumber {
	 public static void main(String arg[])
	   {
	     int range,i,sum=0,j;
	     range=Integer.parseInt(arg[0]);
	     

	     for(i=1; i<=range; i++)
	     {
	        for(j=1; j<=i; j++)
	        {
	           if(i%j==0)
	           {
	             sum=sum+i;
	           }
	        }

	        if(sum==i)
	        {
	          
	          System.out.print(i+", ");
	        }
	      
	      }

	    }

}
