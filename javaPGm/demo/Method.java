package demo;

class Argument{

		void setDta(int ...a)
		{
			System.out.println("\nDisplay prime argument value");
			for(int i=1;i<a.length;i++)
			{
				int count=0;
				for(int j=1;j<=a[i]/2;j++)
				{
					if(a[i]%j==0)
					{
						count++;
					}
				}
				if(count==1)
				{
					System.out.println(a[i]+"\t");
				}
			}



			System.out.println("Display argument value");
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
			
			System.out.println("Display Even argument value");
			for(int i=0;i<a.length;i++)
			{
				if(a[i]%2==0)
				{
					System.out.print(a[i]+"\t");
				}
			}
			System.out.println("\nDisplay duck argument value");
			for(int i=0;i<a.length;i++)
			{
				if(a[i]%10==0)
				{
					System.out.print(a[i]+"\t");
				}
			}
		}
}

	public class Method
	{
	   public static void main(String arg[])
	   {
		   Argument ar=new Argument();
		   ar.setDta(1,20,3,4,5,7,9,80,77,90);
		   
	   }
	}



