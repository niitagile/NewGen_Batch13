package InheritenceConcepts;
//all members are public by default
interface interface1{
	int age=90; //can declare only final types of variables.public
	
	private void privateMethod() {
		System.out.println("private method");
	}
	//final void finalMethod() {} 
	static void staticMethod() {
		//privateMethod();
		System.out.println("static method");
	}
	default void defaultMethod() {
		privateMethod();
		System.out.println("default method");
	}
}

class Test implements interface1{
	void show() {
		System.out.println(age);
		//privateMethod();
		defaultMethod();
		interface1.staticMethod();
	}
}
public class InterfaceExample2 {

	public static void main(String[] args) {
		Test t1=new Test();
		t1.show();

	}

}
