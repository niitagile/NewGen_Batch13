package oopsconcepts;
//Construtor Overloading-- when a class contains multiple constructor
class Course{
	
	private int cid;
	private String course;
	
	Course(){
		this.cid=0;
		this.course="B.Tech";
	}
	Course(int cid, String course){
		this.cid=cid;//this is used to store current object address
		this.course=course;
	}
	void display() {
		System.out.println("course id="+cid);
		System.out.println("course="+course);
	}
	
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		Course obj1=new Course();
		obj1.display();
		Course obj2=new Course(1, "BCA");
		obj2.display();

	}

}
