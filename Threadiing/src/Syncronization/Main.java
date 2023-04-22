package Syncronization;

public class Main{

	
	
	
	public static void main(String[] args) {
		
		Common c = new Common();
		
		ThreadA a = new ThreadA(c);
		ThreadB b = new ThreadB(c);
		
		
		Thread ta = new Thread(a);
		Thread tb = new Thread(b);
		
		ta.start();
		tb.start();
		
	}

	
}
