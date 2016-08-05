package by.htp4.first.task;
//Найти произведение цифр заданного четырехзначного числа

import java.util.Scanner;

public class TaskThree {

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
			System.out.println("Результат произведения цифр заданного числа >> " + s);	
				  
		  }else{
			  
			  System.out.println("Вы ввели не четырехзначное число, прощайте навеки..."); 
			 
		  }
		 }
		    
		  
		    

		 private static int scan(String mess) {
		  System.out.println(mess);
		  
		  @SuppressWarnings("resource")
		Scanner gh = new Scanner(System.in);
		  while (!gh.hasNextInt()){
			  if(gh.hasNext()){
				  gh.next();
			  break;
		  }else{
			  gh.nextInt();
			  System.out.println(mess);
			  
		  	}
		 
		 }
		return gh.nextInt();
	}

}
