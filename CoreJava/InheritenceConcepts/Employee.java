package InheritenceConcepts;

public class Employee {
	private int id;
	private String name;
	private Address adr;//reference object
	Employee(int id, String name, Address adr){
		this.id=id;
		this.name=name;
		this.adr=adr;
	}
	void show() {
		System.out.println("Employee id="+id);
		System.out.println("name="+name);
		adr.display();
		
	}
}
