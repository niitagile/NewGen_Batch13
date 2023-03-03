package InheritenceConcepts;
class classC{
	private int a=90;
	void show() {
		System.out.println("classC's method");
	}
}
class classD extends classC{
	void show() {
		
		System.out.println("classD's method");
		super.show();
	}
}
public class OverridingExample {

	public static void main(String[] args) {
		classD obj=new classD();
		obj.show();

	}

}
//method overiding- same signature are used by parent and child but method's working is different'
//super keyword is used to call any parent's member in child class. can't use super keyword with private and static members'
