package controls;

public class Exercise05 {

	public static void main(String[] args) {
				
		//임의이 값 두수를 35, 60
		// 35~60까지의 합을 구하는 프로그램 생성.
		int sNum = 44;
		int eNum = 67;
			
		int sum = getSumValue(sNum, eNum);
		//44, 67
		//결과 = getSumValue(44,67)
		System.out.println(sNum + "과 " + eNum + "합 " + sum);

	}

	private static int getSumValue(int n1, int n2) {
		// TODO Auto-generated method stub
		int sum = 0;
		if(n1 > n2) {
		for(int i=n2; i<=n1; i++) {
			return sum;
		}
		} else {
			for (int i = n1; i <= n2; i++) {
				sum = sum + i;
			}
		}
		
		return sum;
	
		}
	}
	
			
		
		// 정수1, 정수2 사이의 합을 구하는 메소드
	

	


