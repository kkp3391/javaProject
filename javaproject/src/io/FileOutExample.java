package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutExample {

	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("C:/Temp/Dir/cap.PNG");
		FileOutputStream fos = new FileOutputStream("C:/Temp/Dir/capp.PNG");
		int data = 0, cnt=0;
		byte[] readBytes = new byte[100];
		while((data = fis.read(readBytes)) != -1) {
			fos.write(readBytes);
			cnt++;
		}
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("end....." + cnt);
		
	}

}
