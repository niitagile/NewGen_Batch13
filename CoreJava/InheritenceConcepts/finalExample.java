package InheritenceConcepts;
final class A{}
//class B extends A{} final classes can't be inherited
class c{
	final float PI=3.14f;//must be initalize with declaration.can't be modified
	final void display() {
		
	}
}
class D extends c{
	/*void display() {
		
	}*/
	//final methods can't be overidden
}
public class finalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
