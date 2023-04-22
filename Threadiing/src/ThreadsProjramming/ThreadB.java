package ThreadsProjramming;

public class ThreadB implements Runnable{

	
	@Override
	public void run() {
		
		
		
		for(int i = 10; i<20; i++) {
			System.out.println("inside the threadB : "+i);
		}
	}

}
