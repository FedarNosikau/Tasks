package by.htp4.headfirst.my;

public class PhraseOMatic {

	public static void main(String[] args) {
		
		String[]wordListOne = {"��������������", "����-��������", "30000-��������", "��������", 
				"�������� �������", "��������", "�� ������ ���-����������", "�����������", 
				"�����", "����� ����", "����� ������������ ����", "����������"};
		String[]wordListTwo = {"��������������", "�������", "������ �������", "���������������", "�����������",
				"��������������", "����������������", "���������", "������������� ��", "�����������������",
				"�������", "���������������", "�������������� � �������", "�����������", "���������� ��", 
				"�����", "����������", "����������"};
		String[]wordListThree = {"�������", "����� ���������", "����� �� ���������", "��� ���������", "������", 
				"������", "������� ���������� ��������", "������", "������ �������", "�����", "�������",
				"����� ����������"};
	
	int oneLehgth = wordListOne.length;
	int twoLehgth = wordListTwo.length;
	int threeLehgth = wordListThree.length;
	
	int rand1 = (int) (Math.random()*oneLehgth);
	int rand2 = (int) (Math.random()*twoLehgth);
	int rand3 = (int) (Math.random()*threeLehgth);
	
	String phrase = wordListOne[rand1]+ " " + wordListTwo[rand2]+ " " + wordListThree[rand3];
	
	System.out.println("���, ��� ��� �����, ��� " + phrase);
	
	}
	
	

}
