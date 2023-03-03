package oopsconcepts;
class ClassF{
	int num;
	int x;
	ClassF(int num){
		this.num=num;//obj.num=num; obj1.num=num
	x=89; //this.x=89=> obj.x=89 obj1.x=89
	}
	void display() {
		System.out.println(num);
	}
}
public class Exampleofthis {

	public static void main(String[] args) {
		ClassF obj=new ClassF(5);
		obj.display();
		ClassF obj1=new ClassF(8);
		obj1.display();
	}

}
