package prerators;

public class WhileExample {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while(i <= 10) {
			sum = sum + i;
			i++;
			}
	System.out.println("1~10 합:" + sum);
	i = 1;
	sum = 0;
	while (true) {
		sum = sum + i;
		if (i >= 10) {
			break;
		}
	i++;
	}
	
	}
	
	
}
