package CollectionExamples;

import java.util.Vector;
import java.util.Iterator;

public class Example5 {

	public static void main(String[] args) {
		
	//generic ArrayList
		
		Vector<Integer> obj1=new Vector<>();
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
