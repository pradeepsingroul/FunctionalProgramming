package FunctionalInterFace;

public class ImplF_inter implements F_Interface{

	@Override
	public void sayHello(String message) {
		// TODO Auto-generated method stub
		System.out.println("welcome to FI using another class :"+message);
	}

}
