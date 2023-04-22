package ThreadsProjramming;

import java.util.Iterator;

public class ThreadA implements Runnable{

	@Override
	public void run() {
		
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		// TODO Auto-generated method stub
		for(int i = 0; i<10; i++) {
			System.out.println("inside the thread A "+i);
		}
		
	}
	
	

}
