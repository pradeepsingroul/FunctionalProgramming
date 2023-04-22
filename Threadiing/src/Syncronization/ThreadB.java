package Syncronization;

public class ThreadB implements Runnable{

	Common c;
	
	
	
	public ThreadB(Common c) {
		super();
		this.c = c;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		c.func1("Pradeep");
		
	}

}
