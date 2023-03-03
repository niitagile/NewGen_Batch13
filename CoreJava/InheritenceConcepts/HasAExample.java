package InheritenceConcepts;

public class HasAExample {

	public static void main(String[] args) {
		Address adr=new Address(12,"Delhi");
		Employee emp=new Employee(101,"Heena",adr);
		emp.show();
		

	}

}
