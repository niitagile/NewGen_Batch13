package oopsconcepts;
class ClassD{
	int a=34;
	static int b=90;
	void method1() {
		// a non-static method can use any type of static and non-static members
		System.out.println(a);
		System.out.println(b);
		method2();
	}
	
	static void method2() {
		//System.out.println(a); static methods can't use non-static variables and methods
		System.out.println(b);
		//method1(); can't call non-static method
	}
}
public class StaticMethodsExample {

	public static void main(String[] args) {
		ClassD obj=new ClassD();
		obj.method1();
		//static methods call with the name of class
		ClassD.method2();

	}

}
