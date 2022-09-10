package project;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Emp e=new Emp(1000,"arun",20000);
		
		Emp e1=new Emp(2000,"krish",50000);
		
		Emp e2=new Emp(30000,"abi",30000);
		
		Emp[]a=new Emp[3];
		
        a[0]=e;
		
		a[1]=e1;
		
		a[2]=e2;
		
		for(Emp ee:a)
		{
			System.out.println(ee.ename);
		}

	}

}
