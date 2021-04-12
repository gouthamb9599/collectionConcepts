package demo.List;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

import demo.user.object.Employee;
//legacy class and method 
//not in use
//because of this increasing capacity of 10,on reaching current max. capacity initially
// updations:this increasing capacity can be modified
public class VectorDemo {
	public void vectorOperations() {
		Vector<Object> vector = new Vector<>(5,3) ;
		//Heterogeneous object
		Vector<Object> vector2 = new Vector<>(5,3) ;
		Collections.synchronizedList(vector);//adding this to synchronize the collection object
		System.out.println("Inital default capacity: "+vector.capacity());
		System.out.println("Size before adding "+vector.size());
		
		vector.add("java");//string object
		vector.add(100);//int object
		vector.add(1231.12f);//float object
		//creating user defined object
		Employee emp1 = new Employee(10, "goutham");
		//pushing it to its initial max capacity
		vector.add(emp1);
		vector.add(emp1);
		vector.add("javas");
		System.out.println("Size after adding "+vector.size());
		System.out.println("after adding more than 6 objects capacity: "+vector.capacity());
		
		
		vector.add(1002);//int object
		vector.add(123121.12f);
		vector.add("javak");//string object
		vector.add(1003);//int object
		vector.add(123133.12f);
		System.out.println(emp1.toString());
		System.out.println("Size after adding "+vector.size());
		System.out.println("after adding more than 10 objects capacity: "+vector.capacity());
		
		vector.add(123121.12f);
		vector.add("javak");//string object
		vector.add(1003);//int object
		vector.add(123133.12f);
		System.out.println("Size after adding "+vector.size());
		System.out.println("after adding more than 13 objects capacity: "+vector.capacity());
		
		
		vector.trimToSize();
		
		//traversing using enumeration interface
		System.out.println("Traversing using enumerations");
		Enumeration<Object> e=vector.elements();
		while(e.hasMoreElements()) {
			Object objects = e.nextElement();
			System.out.println("Class name: "+objects.getClass().getSimpleName());

			if(objects instanceof String) {
				System.out.println("String: "+objects);
			}
			else if(objects instanceof Integer) {
				System.out.println("int: "+objects);
			}
			else if(objects.getClass().getSimpleName().equals("Float")) {
				System.out.println("Float: "+objects);
			}
			else if(objects instanceof Double) {
				System.out.println("Double: "+objects);
			}
			else if(objects instanceof Employee) {
				Employee es =(Employee)objects;
//				((Employee) objects).display();
				es.display();
//				System.out.println(es);
			}
		}
		
		System.out.println("after trim to size: "+vector.capacity());
		
		System.out.println("first element:"+vector.firstElement());
		System.out.println("Last element:"+vector.lastElement());
		System.out.println(" element at Index "+vector.get(3));
		System.out.println("index of element "+vector.indexOf("javas"));
		System.out.println("last index of element "+vector.lastIndexOf(emp1));
		Object obj []= vector.toArray();
		for (Object object:obj) {
			System.out.println(object);
		}
		
		//vector 2 elements
		vector2.add(123121.12f);
		vector2.add("javak");//string object
		vector2.add(1003);//int object
		vector2.add(123133.12f);
		
		
		System.out.println(vector2);
		vector2.remove(1);
		System.out.println("after remove: "+vector2);
		vector.retainAll(vector2);
		
		
		System.out.println("after retain: "+vector2);
		
		System.out.println("sublist"+vector.subList(2, 5));
		
		System.out.println("contains"+vector.contains(emp1));
		
		

		
		
		vector.clear();
//		vector.removeAll(vector);//same as clear
		System.out.println("Size after clear:  "+vector.size());
		
	}
	public static void main(String[] args) {
		VectorDemo demo = new VectorDemo();
		demo.vectorOperations();
	}
}
