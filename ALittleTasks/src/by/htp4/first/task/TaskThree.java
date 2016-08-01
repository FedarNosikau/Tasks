package by.htp4.first.task;

import java.util.Scanner;

public class TaskThree {

	public static void main(String[] args) {
		
		  @SuppressWarnings("unused")
		int n;
		  
		  n = scan("Введите четырехзначное число");
		
			  
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
