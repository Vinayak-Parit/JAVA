package demo;
class Fixcriteria
{
	int marks;
	public void fixedCriteria(int marks)
	{
		marks=35;
		System.out.println("Marks="+marks);
	}
	
}
class Infoses extends Fixcriteria
{
	public void fixedCriteria()
	{
	    marks=100;
		System.out.println(" New Marks Criteria="+marks);
	}
	
}
class Google extends Fixcriteria
{
	public void fixedCriteria()
	{
		marks=30;
		System.out.println("New marks marks="+marks);
	}
}
public class MethodOverriding {
	
	public static void main(String arg[])
	{
		Infoses in=new Infoses();
		in.fixedCriteria();
		
		Google g=new Google();
		g.fixedCriteria();
	}

}
