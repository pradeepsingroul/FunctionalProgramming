package Syncronization;

public class Common {

	//synchronized means only one thread can enter in the syncrnized method at the time
	public synchronized void func1(String s){
		System.out.print("welcome : ");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(s);
	}
	
}
