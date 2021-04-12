package demo.Map;


import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import demo.user.object.Employee;

public class HashTableDemo {

	public void concepts () {
		Hashtable<Integer,Employee> htable= new Hashtable<Integer,Employee>();
		htable.put(120,new Employee(10,"BG") );
		htable.put(10,new Employee(111,"BR") );
		htable.put(90,new Employee(10,"axfa") );
		
		//traversing 
		   System.out.println("Iterating using keyset");
		   Set<Integer> keyset=htable.keySet();
		   System.out.println(keyset);
		   for(Integer keys:keyset) {
			   
			   System.out.println("Key: "+keys+" value: "+htable.get(keys));
		   }
		   
		   System.out.println("Iterating using enumeration");
		   Enumeration<Employee> elements=htable.elements();
		    while(elements.hasMoreElements()) {
		    	 
	            Employee key = elements.nextElement();
	            System.out.println("Employee : "  + key );
	        }
		    
		    System.out.println("Itreating using entry set");
		    Set<Entry<Integer, Employee>> entrySet = htable.entrySet();
		    Iterator<Entry<Integer, Employee>> it = entrySet.iterator();
		    System.out.println("HashTable Key-Value Pairs : ");
		    while(it.hasNext()){
		       Map.Entry<Integer, Employee> me = (Entry<Integer, Employee>)it.next();
		       System.out.println("Key is: "+me.getKey() + 
		       " & " + 
		       " value is: "+me.getValue());
		    }

	}
	public static void main(String[] args) {
		new HashTableDemo().concepts();
	}
}
