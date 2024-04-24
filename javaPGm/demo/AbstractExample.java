package demo;
import java.io.*;
abstract class Value
{
	abstract void setValue(int x,int y);
	abstract void perForm();
	
}
class Add extends Value
{
	int x,y;
	public void setValue(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public void perForm()
	{
		System.out.println("addition is"+(x+y));
	}
}
class Mul extends Value
{
	int x,y;
	public void setValue(int x,int y)
	{
		this.x=x;
		this.y=y;
		
	}
	public void perForm()
	{
		System.out.println("multilplication="+(x*y));
		
	}
}
public class AbstractExample
{
   public static void main(String arg[]) throws Exception
   {
	   int n1,n2;
	   DataInputStream d= new DataInputStream(System.in);
	   
	   System.out.println("Enter the two number");
	   n1=Integer.parseInt(d.readLine());
	   n2=Integer.parseInt(d.readLine());
	   
	   Add ad=new Add();
	   ad.setValue(n1, n2);
	   ad.perForm();
	   
	   Mul m=new Mul();
	   
	   m.setValue(n1,n2);
	   m.perForm();
	   
	  
   }
}
