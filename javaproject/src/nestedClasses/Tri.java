package nestedClasses;

public class Tri {

	public static void main(String[] args) {
		int[][]ary = new int[5][5];
		int num = 1;
		for(int i=0; i < ary.length; i++) {
			for(int j=0; j <ary[i].length; j++) {
				ary[i][j] = num++;
			}
		}
		for(int i= 0; i<ary.length; i++) {
			for(int j=0; j<ary[i].length; j++) {
				System.out.printf("%3d",ary[i][j]);
			}
			System.out.println();
		}
	
	System.out.println("-----------------------");
	
		int num1 = 1;
		for(int i=0; i < ary.length; i++) {
			for(int j=0; j <ary[i].length; j++) {
				ary[j][i] = num1++;
			}
		}
		for(int i= 0; i<ary.length; i++) {
			for(int j=0; j<ary[i].length; j++) {
				System.out.printf("%3d",ary[i][j]);
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		
		int num2 = 1;
		for(int i=ary.length-1; 0<=i; i--) {
			for(int j=0; j <ary[i].length; j++) {
				ary[i][j] = num2++;
			}
		}
		for(int i= 0; i<ary.length; i++) {
			for(int j=0; j<ary[i].length; j++) {
				System.out.printf("%3d",ary[i][j]);
			}
			System.out.println();
			
	}
		System.out.println("-----------------------");
		int num3 = 1;
		for(int i=0; i < ary.length; i++) {
			for(int j = ary[i].length-1; 0<=j; j--) {
				ary[i][j] = num3++;
			}
		}
		for(int i= 0; i<ary.length; i++) {
			for(int j=0; j<ary[i].length; j++) {
				System.out.printf("%3d",ary[i][j]);
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		int num4 = 1;
		for(int i=0; i < ary.length; i++) {
			for(int j = ary[i].length-1; 0<=j; j--) {
				ary[j][i] = num4++;
			}
		}
		for(int i= 0; i<ary.length; i++) {
			for(int j=0; j<ary[i].length; j++) {
				System.out.printf("%3d",ary[i][j]);
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		int num5 = 1;
		for(int i=0; i < ary.length; i++) {
			for(int j = ary[i].length-1; 0<=j; j--) {
				ary[j][i] = num5++;
			}
		}
		for(int i= 0; i<ary.length; i++) {
			for(int j=0; j<ary[i].length; j++) {
				System.out.printf("%3d",ary[i][j]);
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		int num6 = 1;
		for(int i= ary.length-1;0<=i; i--) {
			for(int j = ary[i].length-1; 0<=j; j--) {
				ary[i][j] = num6++;
			}
		}
		for(int i= 0; i<ary.length; i++) {
			for(int j=0; j<ary[i].length; j++) {
				System.out.printf("%3d",ary[i][j]);
			}
			System.out.println();
	}		
	}
}
