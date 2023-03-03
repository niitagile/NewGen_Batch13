package InheritenceConcepts;
class classA{
	classA(){
		System.out.println("classA's Constructor ");
	}
	classA(String b){
		System.out.println("b="+b);
	}
}

class classF{}
//a class can't access 2 classes
class classB extends classA{
	classB(){
		//super();
		super("jyoti");//to invoke Parent class constructor.It must be first line in code
		System.out.println("classB's Constructor ");
	}
	
}
public class ConcsttructorCalling {
	public static void main(String[] args) {
		classB obj=new classB();
		
	}

}
