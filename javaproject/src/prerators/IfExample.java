package prerators;

public class IfExample {

	public static void main(String[] args) {
		String grade = "F";
		int score = 87;
		if (score >= 90) {
			grade = "A";
			if (score >= 95) {
				grade = "A+";
			} else {

			}
		} else if (score >= 80) {
			grade = "B";
			if (score >= 85) {
				grade = "B+";
			} else {
				
			}
		} else if (score >= 70) {
			grade = "C";
			if (score >= 75) {
				grade = "C+";
			}
		} else {
			grade = "F";
		}
		System.out.println(score + "는" + grade + "입니다.");
	}

}
