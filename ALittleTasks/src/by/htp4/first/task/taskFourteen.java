package by.htp4.first.task;

import java.util.Scanner;

public class taskFourteen {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		int n;
		int x;

		x = met("������� >>");
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
			System.out.println("�����������");
			break;
		case 2:
			System.out.println("�������");
			break;
		case 3:
			System.out.println("�����");
			break;
		case 4:
			System.out.println("�������");
			break;
		case 5:
			System.out.println("�������");
			break;
		case 6:
			System.out.println("�������");
			break;
		case 7:
			System.out.println("�����������");
			break;
		default:
			System.out.println("��� � ����� ������� �� ����������");
		}
		return n;
	}

}