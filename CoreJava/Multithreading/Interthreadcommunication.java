package Multithreading;
class ChatBoard{
	boolean turn=false;
	synchronized void printQuestions(String msg) {
		if(turn==true){
			
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		} 
		
		System.out.println(msg);
		turn=true;
		notify();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 
	}
	
	synchronized void printAnswers(String msg) {
		if(turn==false) 
		
		{
			
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		
			System.out.println(msg);
			turn=false;
			notify();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
}

class ChaterA extends Thread{
	String questions[]= {"What is your name?","How old are you","In which school do you study"};
	ChatBoard board;
	ChaterA(ChatBoard board){
		this.board=board;
	}
	public void run() {
		for(int i=0;i<questions.length;i++) {
			board.printQuestions(questions[i]);
		}
	}
}

class ChaterB extends Thread{
	String answers[]= {"My name is Ani","6 years","M S Public School"};
	ChatBoard board;
	ChaterB(ChatBoard board){
		this.board=board;
	}
	public void run() {
		for(int i=0;i<answers.length;i++) {
			board.printQuestions(answers[i]);
		}
	}
}
public class Interthreadcommunication {

	public static void main(String[] args) {
		ChatBoard board=new ChatBoard();
		ChaterA chatera=new ChaterA(board);
		ChaterB chaterb=new ChaterB(board);
		chatera.start();
		
		chaterb.start();
	}

}
