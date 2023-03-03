package oopsconcepts;
//Encapsulation- Wrapping of data and functionality together. To implements Encapsulation we use getter and setter

class Bank{
	private int accno;
	private String name;
	Bank(){
		accno=0;
		name=null;
	}
	
	//getter
	public int getAccno(){
	return this.accno;	
	}
	public String getName(){
		return this.name;
	}
	
	//Setter
	public void setAccno(int accno){
		this.accno=accno;
	}
	public void setName(String name){
		this.name=name;
	}
}

public class EncapsulationExample {

	public static void main(String[] args) {
		Bank obj=new Bank();
		obj.setAccno(101);
		obj.setName("Kavita sharma");
		System.out.println("Account no="+obj.getAccno());
		System.out.println("Name="+obj.getName());
		

	}

}
