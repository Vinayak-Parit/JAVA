package demo;
import java.util.*;
class Student
{
	int id;
	String name;
	float marks;
	long contact;
	
	public void setId(int i)
	{
		id=i;
	}
	public int getId()
	{
		return id;
	}
	
	
	public void setName(String n)
	{
		name=n;
	}
	public String getName()
	{
		return name;
	}
	
	
	public void setMark(float m)
	{
		marks=m;
	}
	public float getMarks()
	{
		return marks;
	}
	
	
	public void setContact(long c)
	{
		contact=c;
	}
	public long getContact()
	{
		return contact;
	}
}
class Admission
{
	Student stu;
	public void setStudetData(Student student)
	{
		stu=student;
	}
   
	public void showAddmisionData()
	{
	    System.out.printf("Id\t Name\t Marks \t contact\n");
			System.out.print(+stu.getId()+"\t"+stu.getName()+"\t"+stu.getMarks()+"\t"+stu.getContact());

	    

	}
}
public class ReferenceToClass 
{
    public static void main(String args[])
    {
    	int id;
    	String name;
    	float marks;
    	long contact;
    	
    	Scanner sc=new Scanner(System.in);
    	
    	
    	Student s = new Student();
    	
    	System.out.println("Enter the student data.....Id, Name ,Marks ,contact");
    		
    		id=sc.nextInt();
    		name=sc.next();
    		marks=sc.nextFloat();
    		contact=sc.nextLong();
    		
    		s.setId(id);
    		s.setName(name);
    		s.setMark(marks);
    		s.setContact(contact);
        	Admission ad=new Admission();
        	ad.setStudetData(s);


        	ad.showAddmisionData();


    	
    	


    	
    }
}
