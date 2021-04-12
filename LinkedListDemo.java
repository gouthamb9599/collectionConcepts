package demo.List;

import java.util.Iterator;
import java.util.LinkedList;

import demo.user.object.Employee;

public class LinkedListDemo {
	public void LinkedListOperations() {
		LinkedList <Employee> llist= new LinkedList<Employee>();
		llist.add(new Employee(12, "rahuk"));
		llist.add(new Employee(13, "rahukDSF"));
		llist.add(new Employee(14, "rSDFDSahuk"));
		llist.add(new Employee(15, "rahukDD"));
		llist.add(new Employee(16, "rahukDDds"));
		
		//adding at first and last
		llist.addFirst(new Employee(11, "first"));
		llist.addLast(new Employee(17, "last"));
		
		//descending iterator
		Iterator<Employee> itr= llist.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("get index based: "+llist.get(5));
		System.out.println("get first: "+llist.getFirst());
		System.out.println("get last: "+llist.getLast());
		//similar to stack head
		System.out.println("element: "+llist.element());
		
		System.out.println(	"Offers first: "+llist.offerFirst(new Employee(11, "first")));
		System.out.println(	"Offers last: "+llist.offerLast(new Employee(17, "last")));
		
		System.out.println("Peek: "+llist.peek());
		System.out.println("Peek First: "+llist.peekFirst());

		System.out.println("Peek Last: "+llist.peekLast());
		System.out.println("removes first element: "+llist.poll());
		System.out.println("removes first(specified) element: "+llist.pollFirst());
		System.out.println("removes Last(specified) element: "+llist.pollLast());
		System.out.println("Pops last like stack: "+llist.pop());
		Employee e=new Employee(18, "ladfsst");
		Employee e1=new Employee(19, "fgladfsst");
		Employee ex= new Employee(15, "rahukDD");
		llist.push(e);
		llist.push(e1);
		System.out.println("get first push: "+llist.getFirst());
		
		System.out.println("remove first "+llist.remove());
		System.out.println("remove object specified: "+llist.remove(e));
		System.out.println("remove first specified: "+llist.removeFirst());
		System.out.println("remove last specified: "+llist.removeLast());
		
		System.out.println("remove first occurance of the object: "+llist.removeFirstOccurrence(e));
		System.out.println("remove first occurance of the object: "+llist.removeLastOccurrence(ex));
		System.out.println("setting a new object: "+llist.set(2,ex));
		
	}
	
	public static void main(String[] args) {
		new LinkedListDemo().LinkedListOperations();
	}
}
