package oopsconcepts;

public class StudentDrive {

	public static void main(String[] args) {
		//Object of student class
		//classname objectname=new Constructor();
		Student student1=new Student();
	student1.display();
		Student student2=new Student();
		System.out.println("Enter values for Ist Student");
		student1.getData();
		System.out.println("Enter values for Ist Student");
		student2.getData();
		student1.display();
		student2.display();
		//student2.rollno=56;
	}

}
