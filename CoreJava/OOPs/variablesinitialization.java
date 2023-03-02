package oopsconcepts;
class ClassC{
	
	int num1;
	boolean flag;
	String name;
	float num2;
	char grade;
	void display() {
		
		System.out.println("num1="+num1);
		System.out.println("flag="+flag);
		System.out.println("name="+name);
		System.out.println("num2="+num2);
		System.out.println("grade="+grade);
	}
	
}
public class variablesinitialization {

	public static void main(String[] args) {
	ClassC obj=new ClassC();
	obj.display();

	}

}
