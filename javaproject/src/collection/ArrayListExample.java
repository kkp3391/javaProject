package collection;

import java.awt.List;
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		String[] strAry = new String[10]; //기본값 null
		strAry[0] = "Hello";
		strAry[1] = "World";
		strAry[4] = "Nice";
		for(int i=0; i<strAry.length; i++) {
			if(strAry[i]!=null) {
				System.out.println(strAry[i]);
			}
		}
		
		ArrayList<String> strList = new ArrayList();
		strList.add("Hello");
		strList.add("Nice");
		strList.add("Good");
		strList.add(0,"Very");
		for(Object obj : strList) {
			System.out.println(strList.size());
			strList.remove(2);
			System.out.println(strList.size());
		}
		

	}

}
