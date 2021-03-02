package objects;

public class PersonExample {

	public static void main(String[] args) {
	 new Person() {
		Person[] persons = new Person[5] ;
	persons[0] = new Person("홍길동", 15, 160, 70);
	persons[1] = new Person("김길동", 15, 160, 70);
	persons[2] = new Person("최길동", 15, 160, 70);
	persons[3] = new Person("길동", 15, 160, 70);
	persons[4] = new Person("엄길동", 15, 160, 70);
	
		for (Person person : person ) {
		if (person.age > 20 && person.height > 180.0) {
			
			person.introduce();
	}

	}
	}
}
}