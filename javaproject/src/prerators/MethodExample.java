package prerators;

public class MethodExample {

	public static void main(String[] args) {
		int result = sum(10, 20);
		// result = 30, 20�� ���̸� ����ϴ� minus()
		// result = 15, 13�� ���� ����ϴ� multi()
		// result = 30, 12�� ���� ���� ����ϴ� divide()
		int result1 = minus(30, 20);
		int result2 = multi(15, 13);
		int result3 = divide(30, 12);
		System.out.println("�� : " + result);
		System.out.println("���� : "+ result1);
		System.out.println("�� : " + result2);
		System.out.println("���� : " + result3);
	}

	public static int sum(int a, int b) {
		int result = a + b;
		return result;
	}
	public static int minus(int a, int b) {
		int result1 = a - b;
		return result1;
	}
	public static int multi(int a, int b) {
		int result2 = a * b;
		return result2;
	}
	public static int divide(int a, int b) {
		int result3 = a / b;
		return result3;
	}
}
