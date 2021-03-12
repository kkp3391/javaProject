package collection;

import java.util.ArrayList;
import java.util.List;

public class Sort {
 public static void main(String[] args) {
	int[] intAry = null;
	intAry = new int[] {3,8,4};
	sort(intAry);
	for(int i=0; i <intAry.length; i++) {
		System.out.println(intAry[i]);
	}
	List<Integer> aList= new ArrayList<>();
	aList.add(3);
	aList.add(8);
	aList.add(3);
	int temp = 0;
	if(aList.get(0)>aList.get(1)) {
		temp = aList.get(0);
		aList.set(0, aList.get(1));
		aList.set(1, temp);
	}
 }

public static void sort(int[] intAry) {
	
	
}
}
