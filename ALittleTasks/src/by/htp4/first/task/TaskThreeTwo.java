package by.htp4.first.task;

import java.util.Scanner;

public class TaskThreeTwo {
	
	public static void main(String[] args) {
		
		
		int n;
		int s = 1;
		int i;
	  
		
		n = scan("Введите четырехзначное число >> ");
			
	 if(n>=1000&&n<10000){
		
		 for(i=1;i<=4;i++){

			s*=n%10;
			 n= n/10;
			 
			  }	
		System.out.println(s);	
			  
	  }else{
		  
		  System.out.println("Вы ввели не четырехзначное число, прощайте навеки..."); 
		 
	  }
	 }
	    
	  
	    

	 private static int scan(String mess) {
	  System.out.println(mess);
	  
	  int i = 0;
	  @SuppressWarnings("resource")
	Scanner gh = new Scanner(System.in);
	  while (gh.hasNext()){
		  if(gh.hasNextInt()){
			i=  gh.nextInt();
		  break;
		  
		  
	  }else{
		  gh.next();
		  System.out.println(mess);
		  
	  	}
	 
	 }
	return i;
	
}

}
