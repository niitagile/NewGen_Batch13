package oopsconcepts;
//blocks always execute before constuctor calling. static is sharable. So it in having only 1 copy for all objects
class ClassA{
	
	static {
		System.out.println("static block");
	}
	{
		System.out.println("initializer block");
	}
	ClassA(){
		System.out.println("Constructor");
	}
}
public class StaticExample {

	public static void main(String[] args) {
		ClassA obj=new ClassA();
		ClassA obj1=new ClassA();

	}

}
