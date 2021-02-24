package variables;

public class Morning2 {
	public static void main(String[] args) {
		int sum = 0;
		
		int i = 0;
		for(i=11; i<=30; i++) {
			sum += i;
		}
		System.out.println("11~" + (i-1) + "합 : " + sum );
	}
}
