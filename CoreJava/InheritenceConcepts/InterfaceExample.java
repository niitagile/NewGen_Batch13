package InheritenceConcepts;
import java.lang.*;
//interface is a contract for a class 
interface Selection{
	void intro();//public abstract methods
	void tech();
	void hr();
}
interface department{
	void show();
}
class Harish implements Selection,department{
	public void intro() {System.out.println("intro round");}//public abstract methods
	public void tech() {System.out.println("tech on platform");}
	public void hr() {System.out.println("hr round");}
	@Override
	public void show() {
		System.out.println("show method");
		
	}
}
public class InterfaceExample {

	public static void main(String[] args) {
		Harish obj=new Harish();
		obj.intro();
		obj.tech();
		obj.hr();
		obj.show();
		//Selection obj1=new Selection() ;we can't create interface objects

	}

}
