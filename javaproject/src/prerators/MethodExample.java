package prerators;

public class MethodExample {

	public static void main(String[] args) {
		int result = sum(10, 20);
		// result = 30, 20의 차이를 계산하는 minus()
		// result = 15, 13의 곱을 계산하는 multi()
		// result = 30, 12의 나눈 몫을 계산하는 divide()
		int result1 = minus(30, 20);
		int result2 = multi(15, 13);
		int result3 = divide(30, 12);
		System.out.println("합 : " + result);
		System.out.println("차이 : "+ result1);
		System.out.println("곱 : " + result2);
		System.out.println("나눔 : " + result3);
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
