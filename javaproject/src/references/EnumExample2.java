package references;

interface Animal {
	int DOG = 1;
	int CAT = 2;
}
interface Person {
	int MAN = 1;
	int WOMAN = 2;
}
public class EnumExample2 {

	public static void main(String[] args) {
		who(Person.MAN);
		who(Animal.DOG);
	}
	public static void who(int num) {
		switch (num) {
		case Person.MAN:
		System.out.println("남자입니다");
		break;
		case Person.WOMAN:
			System.out.println("여자입니다");
			break;
		}
	}

}
