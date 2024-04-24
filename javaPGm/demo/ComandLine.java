package demo;
import java.util.Scanner;
public class ComandLine {
	
	public static void main(String arg[])
	{
      
		String str,search;
	
		int flag=1;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String ");
		str=sc.nextLine();
		
		System.out.println("Enter the string do u want to search");
		search=sc.nextLine();
		
		if(str.substring(search)==true)
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("not found");

		}

		
		
		
		
        
		


	}

}
