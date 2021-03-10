
package Threads;

import java.awt.Toolkit;
class WorkerThread extends Thread {

	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println("띵");
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

class NewThread implements Runnable {

	@Override
	public void run() {
		
		
	}
	
}

public class BeepPrintExample {

	public static void main(String[] args) {
		Thread thread = new WorkerThread();
		thread.start();
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
for(int i = 0; i<5; i++) {
	System.out.println("띵");
}
try {
	Thread.sleep(500);
} catch (InterruptedException e) {
	e.printStackTrace();
}
	}

}
