package prerators;

public class Morning0224 {

	public static void main(String[] args) {
		int e = 90;
		int m = 80;
		int sum = (e+m)/2;
		String grade = "F";
		
		if(sum >= 90) {
			grade = "수";
		}
		else if(sum >= 80) {
			grade = "우";
		}
		else if(sum >= 70) {
			grade = "미";
		}
		else  {
			grade = "가";
		}
		System.out.println("영어점수는 " + e + "," + "수학점수는" + m + "입니다.");
		System.out.println("평균점수는 " + sum + "입니다.");
		
		
		}
}
