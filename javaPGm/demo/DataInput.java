package demo;
import java.io.*;
public class DataInput {

	public static void main(String arg[] ) throws Exception
	{
		int a[]=new int[5],i;
		
		DataInputStream d=new DataInputStream(System.in);
		
		for(i=0;i<5;i++)
		{
			a[i]=Integer.parseInt(d.readLine());
		}
		
		for(i=0;i<5;i++)
		{
			System.out.printf("%d /t",a[i]);
		}
		
	}
}
