package Multithreading;
class Board{
	synchronized void print(String arr[] ){
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
class Teacher extends Thread{
	String studentnames[]= {"Jones","Mary","Leena","Kavin"};
	Board board;
	Teacher(Board board){
		this.board=board;
	}
	public void run() {
		board.print(studentnames);
	}
}
class Student extends Thread{
	String courses[]= {"Btech","BCA","BA","BBA"};
	Board board;
	Student(Board board){
		this.board=board;
	}
	public void run() {
		board.print(courses);
	}
}
public class syncexample1 {

	public static void main(String[] args) {
		Board board=new Board();
		Teacher teacher=new Teacher(board);
		Student student=new Student(board);
		teacher.start();
		student.start();

	}

}
