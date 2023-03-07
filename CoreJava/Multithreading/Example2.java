package Multithreading;
//Runnable is defined in java.lang package. It is having only 1 method run()

class MyThread implements Runnable{

	@Override
	public void run() {
		
		System.out.println("I am running");
	}
	
}
public class Example2 {

	public static void main(String[] args) {
		MyThread obj=new MyThread();
		
		Thread t=new Thread(obj);
		
		t.start();//start() will call run()
	}

}
