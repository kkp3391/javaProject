package references;

import java.util.Scanner;

public class ArrayExample2 {

	public static void main(String[] args) {
		int[] arrays = new int[10];
		int sum = 0;
		double avg = 0;
	Scanner scn = new Scanner(System.in);
		for (int i = 0; i < arrays.length; i++) {
			arrays[i] = (int) (Math.random() * 100) + 1;
			{

			}

		}
		System.out.println(arrays[0]);
		System.out.println(arrays[1]);
		System.out.println(arrays[2]);
		System.out.println(arrays[3]);
		System.out.println(arrays[4]);
		System.out.println(arrays[5]);
		System.out.println(arrays[6]);
		System.out.println(arrays[7]);
		System.out.println(arrays[8]);
		System.out.println(arrays[9]);

		for (int i = 0; i < arrays.length; i++) {
			if (arrays[i] % 2 == 0) {
				sum += arrays[i];
			}

		}
		System.out.println("짝수의합" + sum);

		avg = sum / (double) arrays.length;
		System.out.println("평균" + (double) avg);

		int count = 0;
		for (int i = 0; i < arrays.length; i++) {
			if (arrays[i] % 2 == 0) {
				
			
				count += 1;	
			}

		}
		System.out.println("짝수의 갯수" + count);
	
		while (true) {
			System.out.print("배열의 위치 입력>> ");
			int loc = scn.nextInt();
			if (loc < 0) {
				break;
			}
			System.out.println(loc + "위치의 배열값은: " + arrays[loc]);
		}
		scn.close();
		System.out.println("end of prog");
	}

}
// double avg
//짝수값만 합하여 평균