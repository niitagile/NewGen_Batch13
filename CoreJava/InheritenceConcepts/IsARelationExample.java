package InheritenceConcepts;

public class IsARelationExample {
	public static void main(String[] args) {
		Student stu=new Student();
		stu.setId(1);
		stu.setName("Mohit");
		stu.setMarks(90);
		AccountHolder obj=new AccountHolder();
		obj.setId(101);
		obj.setName("Manish");
		obj.setBalance(100000);
		
		System.out.println("Student information");
		System.out.println(stu.getId()+" "+stu.getName()+" "+stu.getMarks());
		
		System.out.println("Account information");
		System.out.println(obj.getId()+" "+obj.getName()+" "+obj.getBalance());
	}

}
