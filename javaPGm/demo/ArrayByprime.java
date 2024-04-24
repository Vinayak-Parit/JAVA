package demo;
import java.util.*;

public class ArrayByprime {
	public static void main(String[] args)
	{
		int a[];
		int count=0,j,i;
		
		Scanner sc=new Scanner(System.in);
		
		for(i=1;i<6;i++)
		{
			for(j=1;j<=a[i]/2;j++)
			{
				if(a[i]%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.printf("\nprime=",a[i]);
			}

		}
		
	}

}
