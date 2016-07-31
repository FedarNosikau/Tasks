package by.htp4.first.task;

import java.util.Scanner;

public class taskFourteen {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		int n;
		int x;

		x = met("введите >>");
		n = met2(x);

	}

	private static int met(String string) {

		int i = 0;
		@SuppressWarnings("resource")
		Scanner gh = new Scanner(System.in);
		System.out.println(string);
		while (gh.hasNextInt()) {
			i = gh.nextInt();

		}
		return i;

	}

	private static int met2(int n) {
		System.out.println(n);
		switch (n) {
		case 1:
			System.out.println("Понедельник");
			break;
		case 2:
			System.out.println("Вторник");
			break;
		case 3:
			System.out.println("Среда");
			break;
		case 4:
			System.out.println("Четверг");
			break;
		case 5:
			System.out.println("Пятница");
			break;
		case 6:
			System.out.println("Суббота");
			break;
		case 7:
			System.out.println("Воскресенье");
			break;
		default:
			System.out.println("Дня с таким номером не существует");
		}
		return n;
	}

}