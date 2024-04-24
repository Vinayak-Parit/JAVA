package demo;
import java.util.*;
abstract class Value 
{
	abstract void setValue(int x, int y);
	abstract void perForm();
}
class Add extends Value
{
	int n1,n2;
	void setValue(int x,int y)
	{
		n1=x;
		n2=y;
	}
	void perForm()
	{
		System.out.println("addition="+(n1+n2));
	}
}
class Mul extends Value
{
	int n1,n2;
	void setValue(int x,int y)
	{
		n1=x;
		n2=y;
	}
	void perForm()
	{
		System.out.println("Multillication="+n1*n2);
	}
}
class Calculate
{
	int x,y;
	public void performCal(Value v,int x,int y )
	{
		this.x=x;
		this.y=y;
		
		v.setValue(x,y);
		v.perForm();
		
	}
}
public class AbstractionPgm
{
   public static void main(String arg[])
   {
	int n1,n2,choice;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the two number:-");
	n1=sc.nextInt();
	n2=sc.nextInt();
	
	
	Calculate c=new Calculate();
	Value v=null;
	do
	{
		System.out.println("1.ADD");
		System.out.println("2.MUL");
		
		System.out.println("Enter ur choice");
		choice=sc.nextInt();

	   switch(choice)
	   {
	   case 1:
        v=new Add();
        c.performCal(v, n1, n2);
        break;
        
	   case 2:
		   v=new Mul();
		   c.performCal(v, n1, n2);
		   break;
		   default:
			   System.out.println("Wrong Choice.....");
		   
	   }
	}
	while(choice!=0);
   }
}
