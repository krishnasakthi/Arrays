package project;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp e1=new Emp(1,"A",10000.00f);
		
		Emp e2=new Emp(2,"B",12000.50f);
		
		
		Emp [] e=new Emp[2];  //class array
		
		e[0]=e1;
		
		e[1]=e2;
		
		System.out.println(e);
		
		
		for(Emp m:e)
		{
			System.out.println("emp id: "+m.eid+" emp name:  "+m.ename+"  emp salary: "+m.esal);
			
			
		}
		
		for(Emp ep:e)
	{
	int m=e.length;
	{
		System.out.println(m);
	}
	
		}

//particular id get value      System.out.println(e.eid+""+e.ename+""+e.esal);



	}

}
