package by.htp4.first.task;

import java.util.Scanner;

public class TaskFourteen {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		int n;
		int x;

		x = met("введите номер месяца >>");
		n = met2(x);

	}

	private static int met(String string) {

		@SuppressWarnings("unused")
		int i = 0;
		@SuppressWarnings("resource")
		Scanner gh = new Scanner(System.in);
		System.out.println(string);
		while (!gh.hasNextInt()) {
			i = gh.nextInt();

		}
		return gh.nextInt();

	}

	private static int met2(int n) {
		
		switch (n) {
		case 1:
			System.out.println("Январь");
			break;
		case 2:
			System.out.println("Февраль");
			break;
		case 3:
			System.out.println("Март");
			break;
		case 4:
			System.out.println("Апрель");
			break;
		case 5:
			System.out.println("Май");
			break;
		case 6:
			System.out.println("Июнь");
			break;
		case 7:
			System.out.println("Июль");
			break;
		case 8:
			System.out.println("Август");
			break;
		case 9:
			System.out.println("Сентябрь");
			break;
		case 10:
			System.out.println("Октябрь");
			break;
		case 11:
			System.out.println("Ноябрь");
			break;
		case 12:
			System.out.println("Декабрь");
			break;
		default:
			System.out.println("Месяца с таким номером не существует");
		}
		return n;
	}

}