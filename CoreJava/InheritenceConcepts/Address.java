package InheritenceConcepts;

public class Address {
	private int houseno;
	private String city;
	Address(int houseno, String city){
		this.houseno=houseno;
		this.city=city;
	}
	
	void display() {
		System.out.println("house no="+houseno);
		System.out.println("city="+city);
	}
}
