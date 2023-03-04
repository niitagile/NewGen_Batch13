package CollectionExamples;

import java.util.HashMap;

public class HashmapExample1 {
	public static void main(String[] args) {
		//Map is an interface which stores information <key, value>.Hashmap is a class which imlements Map.
		
		HashMap<Integer, String> obj=new HashMap<>();
		obj.put(1, "imran");
		obj.put(2, "armaan");
		obj.put(3, "arijit");
		obj.put(4, "shreya");
		obj.put(5, "armaan");
		obj.put(7, "arijit");
		obj.put(6, "armaan");
		obj.put(8, "arijit");
		obj.put(2,"amrita");
		obj.put(null, "Nikita");
		obj.put(2, "Bhargav");
		
		for(Integer key:obj.keySet()){
			String name=obj.get(key);
			System.out.println(key+ " "+name);
		}
		
		obj.remove(5);
		System.out.println("After Deletion");
		for(Integer key:obj.keySet()){
			String name=obj.get(key);
			System.out.println(key+ " "+name);
		}
		
		System.out.println("is the map contains anything " +obj.isEmpty());
		System.out.println("is the map contains 2 "+obj.containsKey(2));
		System.out.println("is the map contains shreya "+obj.containsValue("Shreya"));
		
	}
	
	

}
