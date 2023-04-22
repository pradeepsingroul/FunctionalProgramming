package ThreadsProjramming;

public class MainClass extends Thread{
	
	
	public static void main(String[] args) throws InterruptedException  {
		
		
		
//		Thread A = new Thread(new ThreadA());
//		A.setName("Raj");
//		A.start();
//		
//		System.out.println(A.getName());
//		
//		try {
//			A.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		/*try {
//			a.sleep(1000);//this will stop the thread A for 1 Second
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}*/
//		
//		for(int i = 10; i<20; i++) {
//			System.out.println("inside the main A "+i);
//		}
//		
//		
//		
//		System.out.println("inside the main therad");
		
		
		
		
		
		
		
		
		
		
//=========== >		
		
		
		ThreadA a = new ThreadA();
		Thread threadA = new Thread(a);
		
		ThreadB b = new ThreadB();
		Thread threadB = new Thread(b);
		
		threadB.start();
		threadB.join();
		threadA.start();
		
		
		
		System.out.println("end of main thread");
		
		
		
		
		
	}

}
