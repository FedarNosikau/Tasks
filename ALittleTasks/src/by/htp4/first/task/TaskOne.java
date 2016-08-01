package by.htp4.first.task;

import java.util.Scanner;

public class TaskOne {

	
	public static void main(String[]args){
		
		double x = readFromConcole("введите значение>>");
		
			
			double y = x - Math.pow(x, 3)/3+Math.pow(x, 5)/5;
			System.out.println("Результат вычисления >>" + y);
	}

	private static double readFromConcole(String string) {
		
		int i=0;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println(string);
		
		
		while (s.hasNext()){
		if (s.hasNextInt()){
		i=s.nextInt();
			break;
		}else{
			s.next();
			System.out.println(string);
	
		}
	}
		return i;

	}
}

