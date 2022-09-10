package Example;

import java.util.ArrayList;
import java.util.Iterator;

public class Test 
{
	public static void main(String [] args)
	{
		
		ArrayList <student > a=new ArrayList<student >();
		
		student s1=new student(100,"arun");
		
		a.add(s1);
		
        student s2=new student(200,"raja");
		
		a.add(s2);
		
		System.out.println(a);
		
		for(student x:a)
		{
			System.out.println(x.rollno+ "  "+x.name);
		}
		
		student q=a.get(0);
				{
			     System.out.println("ZERO INDEX :"+q.name);
				}
		student q1=a.get(1);
		{
			System.out.println("first index "+q1.rollno);
		}

	}
	
}
