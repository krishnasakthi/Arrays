package example1;

public class CSC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student s=new student();
		
		s.setRollno(100);
		s.setName("arun");
		s.setAge(21);
		s.setDept("computer");
		
		System.out.println(s.getRollno());
		
		System.out.println(s.getName());
		
		System.out.println(s.getAge());
		
		System.out.println(s.getDept());
		
		
       student s1=new student();
		
		s1.setRollno(200);
		s1.setName("kumar");
		s1.setAge(20);
		s1.setDept("computer");
		
		System.out.println(s1.getRollno());
		
		System.out.println(s1.getName());
		
		System.out.println(s1.getAge());
		
		System.out.println(s1.getDept());

	}

}
