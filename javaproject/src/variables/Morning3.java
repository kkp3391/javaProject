package variables;

public class Morning3 {

	public static void main(String[] args) {
		int v1 = 11;
		int v2 = 30;
		int sum = 0;
		sum = getSum(v1, v2);
		System.out.println("3) " + v1 + "~" + v2 + "까지 합:" + sum);

	}
	public static int getSum(int fromValue, int toValue) {
		int sum = 0;
		for (int i = fromValue; i <= toValue; i++) {
			sum += i;
		}
		return sum;
	}

}
