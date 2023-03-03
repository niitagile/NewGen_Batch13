package oopsconcepts;
//method overloading- a class conatins multiple methods with same name but different no of arguments, 
//sequence of arguments and type of arguments.here is no role of return type
class ClassE{
	void area(int a) {
		System.out.println("method1");
	}
	void area(int a, float b) {
		System.out.println("method2");
	}
	void area(float a, int b) {
		System.out.println("method3");
	}
	//int area(int a) {} duplicate method
}
public class MethodOverloading {

	public static void main(String[] args) {
		ClassE obj=new ClassE();
		obj.area(34);
		obj.area(4,6.7f);
		obj.area(6.7f,4);
		System.out.println(obj instanceof ClassE);
		//System.out.println(obj instanceof Student);

	}

}
