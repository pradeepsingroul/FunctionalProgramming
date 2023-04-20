package FunctionalInterFace;

public class Demo {
	
	public static void main(String[] args) {
		
		//Functional interface using another class
		F_Interface fi = new ImplF_inter();
		fi.sayHello("Ram");
		
		
		//funcitonal inteface using annonymous class
		F_Interface fi2 = new F_Interface() {
			
			@Override
			public void sayHello(String message) {
				// TODO Auto-generated method stub
				System.out.println("welcome to annonyous class :"+message);
			}
		};
		fi2.sayHello("pradeep");
		
		//functional interface using lambda expression
		F_Interface fi3 =  (n) -> {
			System.out.println("welcmoe"+n);
		};
		fi3.sayHello("lambda expression");
		
	}

	
	
	
	
}
