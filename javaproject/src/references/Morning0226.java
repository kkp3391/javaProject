package references;
		//int 영어성적 담을 수 있는 배열. engScores =>3
		//int 수학성적 담을 수 있는 배열. mathScores =>3
		
		// 영어, 수학 성적 입력
		// 영어의 평균, 수학점수의 평균을 구하는 코딩.
		// 출력형태->영어평균:85.5/ 수학평균 88.7
public class Morning0226 {

	public static void main(String[] args) {
		int[] engScores = {90,85,80};
		int[] mathScores = {95,90,85};
		double engsum = 0;
		double mathsum = 0;
		double engavg = 0;
		double mathavg = 0;
		
		
		for (int i = 0; i < engScores.length; i++) {
			engsum += engScores[i];
		}
		engavg =  engsum / engScores.length;
		System.out.println(engavg);
		
		for (int i = 0; i < mathScores.length; i++) {
			mathsum += mathScores[i];
		}
		mathavg =  mathsum / mathScores.length;
		System.out.println(mathavg);
		
	
			
		}
		
	
	
			
		
	}


