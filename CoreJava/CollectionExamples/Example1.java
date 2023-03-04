package CollectionExamples;

import java.util.ArrayList;
import java.util.Iterator;

public class Example1 {

	public static void main(String[] args) {
		//This list stores all data in Object but not in specfic data type
		ArrayList obj=new ArrayList();
		obj.add(23);
		obj.add("Geet");
		obj.add("56");
		
		
		System.out.println(obj);

	//generic ArrayList
		
		ArrayList<Integer> obj1=new ArrayList<>();
		obj1.add(89);
		//obj1.add("Mani");
		obj1.add(78);
		obj1.add(90);
		System.out.println(obj1);
		//Iterator is an interface 
		Iterator itr= obj1.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		for(int i=0;i<obj1.size();i++) {
			int val=obj1.get(i);
			val=val+10;
			obj1.set(i, val);
		}
		
		//New Values
		System.out.println("New Values");
		 itr= obj1.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
	}

}
