package project;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp e=new Emp(100,"arun",10000);
		
		Emp e1=new Emp(200,"krish",15000);
		
		Emp e2=new Emp(300,"abi",20000);
		
		System.out.println(e);
		
		Emp[]a=new Emp[3];
		
        a[0]=e;
		
		a[1]=e1;
		
		a[2]=e2;
		
		System.out.println(e1);
		
		for(Emp ee:a)
		{
			System.out.println(ee.eid+"..."+ee.ename+"..."+ee.esal);
		}
		
		for(Emp ep:a)
				{
			int m=a.length;
			{
				System.out.println(m);
			}
			
				}
		System.out.println(e.eid+""+e.ename+""+e.esal);

	}

}
