package by.htp4.les08.start;

public class TaskOver {
	
	public static void main(String[]args){
	
		String one = "5";
		String two = "10";
		
		A a = new A();
		a.methX();
		
		A b = new B();
		
		b.methX();
		
		
	}
}

class A{
	
	public int methX(){
			
		String a = "12";
		String b = "18";	
		int c = Integer.parseInt(a+b);
		
		System.out.println(c);
		return c;
	
					
		
	}
		
}

class B extends A{
	
	public int methX(){
	String a = "13";
	String b = "21";	
	int c = Integer.parseInt(a+b);
	
	System.out.println(c);
	return c;

	
}	
}
