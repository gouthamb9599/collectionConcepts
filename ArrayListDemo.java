package demo.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;

import demo.user.object.Employee;
import demo.user.object.EmployeeNameComparator;

public class ArrayListDemo {
	public void ArrayOperations() {
		ArrayList<Employee> al= new ArrayList<Employee>();
		Collections.synchronizedList(al);
		al.size();
		al.add(new Employee(10,"Goutham"));
		al.add(new Employee(20,"dfads"));
		al.add(new Employee(30,"Gouthdfafam"));
		al.add(new Employee(40,"Gdffsfoutham"));
		al.add(new Employee(50,"dasfGoutham"));
		System.out.println("Size of arraylist:  "+al.size());
		
		System.out.println("Reversed the Arraylist");
		Collections.reverse(al);
		System.out.println("Iteration on reverse with Iterator");
		Iterator<Employee> reverse1 = al.iterator();
		while(reverse1.hasNext()) {
			Employee e = reverse1.next();
			e.display();
		}
		Collections.reverseOrder();
		System.out.println("Iteration on reverseOrder with Iterator");
		Iterator<Employee> reverse2 = al.iterator();
		while(reverse2.hasNext()) {
			Employee e = reverse2.next();
			e.display();
		}
		Collections.reverseOrder(new EmployeeNameComparator());
		System.out.println("Iteration on reverseOrder(specific comparator) with Iterator");
		Iterator<Employee> reverse3 = al.iterator();
		while(reverse3.hasNext()) {
			Employee e = reverse3.next();
			e.display();
		}
		Employee max=Collections.max(al);
		System.out.println("Max value: "+max);
		
		Employee min=Collections.min(al);
		System.out.println("Min value: "+min);
		
		Collections.swap(al, 2, 3);
		System.out.println("result after swap");
		Iterator<Employee> swap1 = al.iterator();
		while(swap1.hasNext()) {
			Employee e = swap1.next();
			e.display();
		}
		Collections.sort(al,new EmployeeNameComparator());
		System.out.println("result after sort with comparator");
		Iterator<Employee> swap2 = al.iterator();
		while(swap2.hasNext()) {
			Employee e = swap2.next();
			e.display();
		}
		Collections.shuffle(al);
		System.out.println("result after shuffule");
		Iterator<Employee> shuffule = al.iterator();
		while(shuffule.hasNext()) {
			Employee e = shuffule.next();
			e.display();
		}
		Random rnd = new Random();
		Collections.shuffle(al,rnd);
		System.out.println("result after shuffule with random");
		Iterator<Employee> shuffule1 = al.iterator();
		while(shuffule1.hasNext()) {
			Employee e = shuffule1.next();
			e.display();
		}
		
//		System.out.println("Iteration(arraylist on reverseOrder) with Iterator");
//		Iterator<Employee> ems = rev.iterator();
//		while(ems.hasNext()) {
//			Employee e = ems.next();
//			e.display();
//		}
		//traversing or iterating
		//case 1 with iterator
		System.out.println("Iteration with Iterator");
		Iterator<Employee> emps = al.iterator();
		while(emps.hasNext()) {
			Employee e = emps.next();
			e.display();
		}
		//case 2 with list iterator		
		System.out.println("List Iteration with Iterator");
		ListIterator<Employee> liemps= al.listIterator();
		System.out.println("Traversing forward");
		while(liemps.hasNext()) {
			System.out.println(liemps.next());
		}
		System.out.println("Traversing backward");
		while(liemps.hasPrevious()) {
			System.out.println(liemps.previous());
		}
	}
	public static void main(String[] args) {
		ArrayListDemo demo = new ArrayListDemo();
		demo.ArrayOperations();
	}
		
}
