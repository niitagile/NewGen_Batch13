package Multithreading;
//Thread class provides different methods to control thread and its properties.
//Thread class implements runnable interface. So we don't require to implement Runnable but overide run()
class MyThread1 extends Thread{

	@Override
	public void run() {
		
		System.out.println("I am running");
	}
	
}
public class Example3 {

	public static void main(String[] args) {
		MyThread1 obj=new MyThread1();
		
		
		
		obj.start();//start() will call run()
	}

}
