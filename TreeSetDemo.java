package demo.Set;



import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.TreeSet;

import demo.user.object.Employee;
//import demo.user.object.EmployeeNameComparator;

public class TreeSetDemo {
	public void concepts() {
		//implement either this or(1)
//		 TreeSet<Employee> hs1 = new TreeSet<Employee>(new EmployeeNameComparator());
//	        hs1.add(new Employee(1,"yash1"));
//	        hs1.add(new Employee(2,"guru "));
//	        Iterator<Employee> i1=hs1.iterator();
//	        while(i1.hasNext())
//	        {
//	        System.out.println(i1.next());
//	        }
		//or this(2)
		//to make this work object class should implement comparable and compareTo function must be used
		TreeSet<Employee> tree= new TreeSet<Employee>();
		tree.add(new Employee(12, "rahuk"));
		tree.add(new Employee(13, "rahukDSF"));
		tree.add(new Employee(14, "rSDFDSahuk"));
		tree.add(new Employee(15, "rahukDD"));
		tree.add(new Employee(16, "rahukDDds"));
		Employee e=new Employee(18, "ladfsst");
		tree.add(e);
		Employee ss = new Employee(12, "rahuk");
		System.out.println("Contains:  "+tree.contains(e));
		System.out.println("Contains all : "+tree.containsAll(tree));
		System.out.println("Size:  "+tree.size());
		System.out.println("is Empty: "+tree.isEmpty());
		
		//iterator
		Iterator<Employee> emps = tree.iterator();
		while(emps.hasNext()) {
			Employee es = emps.next();
			es.display();
		}
		//spliterator 
		Spliterator<Employee> itr = tree.spliterator();
		
        System.out.println("list of Employees:");
        
        itr.forEachRemaining((treees) -> System.out.println(treees));
        
        //headset(part of data from front)
        
        Set<Employee> headset = tree.headSet(e);
        System.out.println("Headset contains: " + headset);
        
        
        //headset with false (remaining data after the data we have given)
        Set<Employee> not_of_headset = tree.headSet(e,false);
        System.out.println("not of headset contains: " +  not_of_headset);
        
        
        //subset(part of data inbetween)
        Set<Employee> subset =tree.subSet(ss,e);
        System.out.println("Subset contains: " + subset);
        
        
        //subset with false (remaining data after the data we have given)
        Set<Employee> subsets =tree.subSet(ss,false, e,false);
        System.out.println("Subset contains: " + subsets);
        
        
        //tailset(part of data from end)
        Set<Employee> tailset = tree.tailSet(e);
        System.out.println("Tailset contains: " + tailset);
        
        
        //tailset with false (remaining data after the data we have given)
        Set<Employee> not_of_tailset = tree.tailSet(e,false);
        System.out.println("not of Tailset contains: " +  not_of_tailset);

		System.out.println("Remove object"+tree.remove(e));
		tree.clear();
	}
	public static void main(String[] args) {
		 new TreeSetDemo().concepts();
	
		//this will work because it compares with string object (already existing and primitive)
		 System.out.println("String tree set:");
		 TreeSet<String> al=new TreeSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  //Traversing elements  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
	}

}
