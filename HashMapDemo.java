package demo.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import demo.user.object.Employee;

public class HashMapDemo {

	public void concepts () {
		HashMap<Integer,Employee> hmap= new HashMap<Integer,Employee>();
		hmap.put(120,new Employee(10,"BG") );
		hmap.put(10,new Employee(111,"BR") );
		hmap.put(90,new Employee(10,"axfa") );
		
		
		//traversing
		   Set<Entry<Integer, Employee>> entrySet = hmap.entrySet();
		   
		    // Obtaining an iterator for the entry set
		    Iterator<Entry<Integer, Employee>> it = entrySet.iterator();
		 
		    // Iterate through HashMap entries(Key-Value pairs)
		    System.out.println("HashMap Key-Value Pairs : ");
		    while(it.hasNext()){
		       Map.Entry<Integer, Employee> me = (Entry<Integer, Employee>)it.next();
		       System.out.println("Key is: "+me.getKey() + 
		       " & " + 
		       " value is: "+me.getValue());
		    }

	}
	public static void main(String[] args) {
		new HashMapDemo().concepts();
	}
}
