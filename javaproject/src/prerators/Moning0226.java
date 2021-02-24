package prerators;

public class Moning0226 {

	public static void main(String[] args) {
		int e = (int)(Math.random()*100) +1;
		int m = (int)(Math.random()*100) +1;
		 String result = getAverage (e, m);
		System.out.println("영어점수는 " + e + "," + "수학점수는" + m + "입니다.");
		System.out.println("평균점수는 " + result + "입니다.");
	}
		public static String getAverage(int n1, int n2) {
			int avg = (n1 + n2)/2;
			String grade = "";
		
		if(avg >= 90) {
			grade = "수";
		}
		else if(avg >= 80) {
			grade = "우";
		}
		else if(avg >= 70) {
			grade = "미";
		}
		else  {
			grade = "가";
		}
		return grade;
		
		
	}
}
