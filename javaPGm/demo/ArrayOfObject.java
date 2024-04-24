package demo;
import java.util.*;
class StudentData
{
	private int id;
	private String name;
	private float marks;
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}

	public void setId(int id)
	{
		this.id = id;
	}
	public int getId() 
	{
		return id;
	}
	
	public void setMarks(float marks) 
	{
		this.marks = marks;
	}

	public float getMarks() 
	{
		return marks;
	}
	
}
public class ArrayOfObject {

public static void main(String arg[])
{
	int id,i;
	String name;
	float marks;

	StudentData s[]=new StudentData[5];
	
	System.out.println("Enter the Id Name Marks...... ");
	for( i=0;i<s.length;i++)
	{
		Scanner sc=new Scanner(System.in);

		s[i]=new StudentData();

        name=sc.nextLine();

	    id=sc.nextInt();
	    marks=sc.nextFloat();
	    
	    
	    s[i].setName(name);

	    s[i].setId(id);

	    s[i].setMarks(marks);
	    
	}
	
	System.out.print("Id\tName\tMarks\t ");
	for(i=0;i<s.length;i++)
	{
		System.out.println(+s[i].getId()+"\t"+s[i].getName()+"\t"+s[i].getId());
	}

}
}
