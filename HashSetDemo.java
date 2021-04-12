package demo.Set;

import java.util.Collections;
import java.util.HashSet;
//import java.util.Iterator;
import java.util.Spliterator;

import demo.user.object.Employee;

public class HashSetDemo {
	public void concepts() {
		HashSet<Employee> hash= new HashSet<Employee>();
		Collections.synchronizedSet(hash);//not ordered in even after adding this line
		hash.add(new Employee(12, "rahuk"));
		hash.add(new Employee(13, "rahukDSF"));
		hash.add(new Employee(14, "rSDFDSahuk"));
		hash.add(new Employee(15, "rahukDD"));
		hash.add(new Employee(16, "rahukDDds"));
		Employee e=new Employee(18, "ladfsst");
		hash.add(e);
		System.out.println("Contains:  "+hash.contains(e));
		System.out.println("Contains all : "+hash.containsAll(hash));
		System.out.println("Size:  "+hash.size());
		System.out.println("is Empty: "+hash.isEmpty());
		
		Spliterator<Employee> itr = hash.spliterator();
		
        System.out.println("list of Employees:");
        
        itr.forEachRemaining((hashes) -> System.out.println(hashes));
        
		System.out.println("Remove object"+hash.remove(e));
		hash.clear();
	}
	public static void main(String[] args) {
		new HashSetDemo().concepts();
	}
}
