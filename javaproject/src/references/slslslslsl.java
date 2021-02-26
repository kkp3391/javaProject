package references;

public class slslslslsl {

	public static void main(String[] args) {
		String[] names = {"임성원" , "정준영", "도왕락" };
		int[] scores = {88, 89, 90};
		//임성원88
		//정준영 89
		//도왕락 90
		for (String name : names) {
			System.out.println(name);
		}
		for (int i = 0; i <names.length; i++ ) {
			for(int j = 0; j<scores.length; j++) {
				
			}
			System.out.println(names[i] + "의 점수" + scores[i]);
		}
		int sum = 0;
		for (int score : scores) {
			sum = sum +score;
			System.out.println(score);
		}
		System.out.println("합계점수: " + sum);
		
		
		
		
		
		
		
		//int [] oldAry = {45,55,67};
		//int [] newAry = new int[3];
		//for (int i=0; i <oldAry.length; i++) {
		//	newAry[i] = oldAry[i];
		//}
		//System.out.println(newAry[0]);
		//System.out.println(newAry[1]);
		//System.out.println(newAry[2]);
		
		//int[] newAry2 = new int[5];
		//System.arraycopy(newAry, 0, newAry2, 0 ,0);
		//System.out.println(newAry2[0]);
		//System.out.println(newAry2[1]);
		//System.out.println(newAry2[2]);
	}

}
