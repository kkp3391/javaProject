package object2;

import objects.Student;

public class MethodExample {
	public static void main(String[] args) {
		Calculator.getRect(4.5, 2);
		
		for (int i = 0; i < args.length; i++) {
			System.out.println("매개값[" + i + "]:" + args[i]);
		}
		
		Calculator cal = new Calculator();
		double result = cal.getArea(3.5);
		
		
		
		sum(10,20);
		
		
		Book b1 = new Book("", "", "", 100);
		Student s1 = new Student();
		s1.run();
		s1.study();
	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
}
