package example1;

class parent
{
	void m1()
	{
		System.out.println("parent class method");
	}
}

public class Demo 
{

	public static void main(String[] args)  //1
	{
		parent p=new parent()    //annoy
		{
			void m1()
			{
				System.out.println("annoymous inner class method");
			}
		};
		
		p.m1();
		
		parent p1=new parent();
		p1.m1();
	}

	}


