package io;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderExample {

	public static void main(String[] args) throws Exception{
		int data = 0;
		int readCharNo;
		char[] cbuf = new char[200];

		FileReader fr = new FileReader(
				"C:/Dev/git/javaproject/javaproject/src/io/FileExample.java");
		FileWriter fw = new FileWriter("C:/Temp/dir/file3.txt");
				
		while ((data =fr.read(cbuf)) !=-1) {
			String readLines= new String(cbuf,0,data);
			//System.out.print(data);
			fw.write(readLines);
			fw.write(data);
		}
		fw.flush();
		fw.close();
fr.close();
System.out.println("end...");
	}

}
