package oopsconcepts;
class ClassB{
	int id;
	static int count;//static variables are also called as class variables or shared variables.
	ClassB(){
		id++;
		count++;
		
	}
	void display() {
		System.out.println("id="+id+"count="+count);
	}
}
public class StaticVariableExample {

	public static void main(String[] args) {
		ClassB obj=new ClassB();
		obj.display();
		ClassB obj1=new ClassB();
		obj1.display();
		ClassB obj2=new ClassB();
		obj2.display();
		
		obj.display();
		obj1.display();
		obj2.display();
		
	}

}
