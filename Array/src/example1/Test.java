package example1;

interface parents
{
	void m();
	
	void m1();
}



class child implements parents
{
	
	public void m() 
	{
		System.out.println("parent interface method 1");
	}
	
	public void m1() 
	{
		System.out.println("parent interface method 2");
	}
	
	
	
}



public class Test 
{

	public static void main(String[] args) 
	{
		
		child c=new child();
		
		c.m();
		c.m1();
	}

}
