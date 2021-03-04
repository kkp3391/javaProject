package object2;

public class SinletonExample {
public static void main(String[] args) {
	Singleton s1 =  Singleton.getInstance();
	Singleton s2 =  Singleton.getInstance();
	
	Book b1 = new Book("자버", "저자", "출판사", 1000);
	Book b2 = new Book("자버", "저자", "출판사", 1000);
	
	System.out.println(s1==s2);
	System.out.println(b1==b2);
}
}
