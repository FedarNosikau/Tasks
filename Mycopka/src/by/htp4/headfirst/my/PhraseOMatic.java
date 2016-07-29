package by.htp4.headfirst.my;

public class PhraseOMatic {

	public static void main(String[] args) {
		
		String[]wordListOne = {"круглосуточный", "трех-звездный", "30000-метровый", "взаимный", 
				"обоюдный выигрыш", "фронтэнд", "на основе вэб-технологий", "проникающий", 
				"умный", "шесть сигм", "метод критического пути", "динамичный"};
		String[]wordListTwo = {"уполномоченный", "трудный", "чистый продукт", "ориентированный", "центральный",
				"распределенный", "кластеризованный", "фирменный", "нестандартный ум", "позиционированный",
				"сетевой", "сфокусированный", "использованный с выгодой", "выровненный", "нацеленный на", 
				"общий", "совместный", "ускоренный"};
		String[]wordListThree = {"процесс", "пункт разгрузки", "выход из положения", "тип структуры", "талант", 
				"подход", "уровень завоевания внимания", "портал", "период времени", "обзор", "образец",
				"пункт следования"};
	
	int oneLehgth = wordListOne.length;
	int twoLehgth = wordListTwo.length;
	int threeLehgth = wordListThree.length;
	
	int rand1 = (int) (Math.random()*oneLehgth);
	int rand2 = (int) (Math.random()*twoLehgth);
	int rand3 = (int) (Math.random()*threeLehgth);
	
	String phrase = wordListOne[rand1]+ " " + wordListTwo[rand2]+ " " + wordListThree[rand3];
	
	System.out.println("Все, что нам нужно, это " + phrase);
	
	}
	
	

}
