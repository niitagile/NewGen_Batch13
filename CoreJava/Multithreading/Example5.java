package Multithreading;
class MyThread2 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}
public class Example5 {

	public static void main(String[] args) {

		MyThread2 t=new MyThread2();
		t.start();
	}

}
