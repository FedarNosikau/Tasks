package by.htp4.first.task;

import java.util.Scanner;

public class TaskTwo {

	public static void main(String[] args) {
		
		double x = readFromConsole("введите значение x>>");
		double y = readFromConsole("введите значение y>>");
	
		double z = (1+Math.pow((Math.sin((x+y))), 2)/
				(2+Math.abs(x-((2*x)/(1+Math.pow(x, 2)*Math.pow(y, 2))))));

		System.out.println("Результат вычисления >> " + z);
		
	}

	private static double readFromConsole(String string) {
		
		int i = 0;
		@SuppressWarnings("resource")
		Scanner a = new Scanner(System.in);
		System.out.println(string);
		while (a.hasNext()){
			if(a.hasNextInt()){
				i = a.nextInt();
				break;
				
			}else{
				
				System.out.println(string);
				a.next();
				
				
			}
			
			
		}
		
		return i;
	}

}
