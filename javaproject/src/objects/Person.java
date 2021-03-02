package objects;

public class Person {
	String name;
	int age;
	int kg;
	int cm;
	private String Person;
	protected double height;
	

	Person(String Person) {
		this.Person = Person;
	}
	
	Person() {
		
	}
	
	
	void eat() {
		System.out.println("먹는다");
	}
	void sleep() {
		System.out.println("잔다");
	}
	void working() {
		System.out.println("걷는다");
	}
	void introduce() {
		System.out.println("이름은" + name + "나이는" + age  + "입니다" );
	}

}
