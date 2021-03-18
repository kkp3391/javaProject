package io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class Example {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("이름 입력>");
		String inputString = scanner.nextLine();
		System.out.println(inputString);
		System.out.println();
		
		System.out.print("전화번호 입력>");
		int inputInt = scanner.nextInt();
		System.out.println(inputInt);
		
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo=reader.read(cbuf))!=-1) {
			String data = new String(cbuf,0,readCharNo);
			
			
		}
		reader.close();
		FileOutputStream fos = new FileOutputStream("C:/Temp/file4.txt");
		Writer writer = new OutputStreamWriter(fos);
		
		String data = cbuf;
		
		
	}
}
