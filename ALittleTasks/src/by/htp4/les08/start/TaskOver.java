package by.htp4.les08.start;

//В классе A в пакете by.htp4.les08.start определить метод x, принимающий два строковых 
//параметра и возвращающий целое число. В классе B в том же пакете переопределить метод x. 
//Объяснить поведение java-программы при вызове метода x на объекте класса B через ссылку типа A.



public class TaskOver {
	
	public static void main(String[]args){
	
		@SuppressWarnings("unused")
		String one = "5";
		@SuppressWarnings("unused")
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
