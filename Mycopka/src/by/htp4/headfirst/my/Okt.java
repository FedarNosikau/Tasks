package by.htp4.headfirst.my;

import java.util.Scanner;

public class Okt {
	public static void main(String[] args) {

		//123
		double a;
		double b;

		a = readIntFromConsole("������� ������������ ������, ������ ");
		b = readIntFromConsole("������� ������ ����������, ���� ");
		@SuppressWarnings("unused")
		String c = readIntFromConsole1("������� ����� ����������, ������������ ");

		numNum(a,b);

	}

	private static String readIntFromConsole1(String string) {

		String i = " ";

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println(string + ">");
		while (scan.hasNextLine()) {
			if (scan.hasNext()) {
				i = scan.nextLine();
				break;
			} else {
				scan.hasNext();
				System.out.println(string + ">");

			}
		}
		return i;
	}

	private static double numNum (double a,double b) {
		double d;
		d = a*b;
		System.out.println("��������� ���������� = " + d);
		return d;

	}

	private static int readIntFromConsole(String string) {

		@SuppressWarnings("unused")
		int i = 0;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println(string + ">");
		while (scan.hasNextInt()) {
			if (scan.hasNext()) {
				i = scan.nextInt();
				break;
			} else {
				scan.hasNext();
				System.out.println(string + ">");

			}

		}

		return 0;

	}

}
