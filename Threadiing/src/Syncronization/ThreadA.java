package Syncronization;

public class ThreadA implements Runnable{

    Common c;
    
    
	
	public ThreadA(Common c) {
		super();
		this.c = c;
	}

	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		c.func1("Pradeep");
		
	}
}
