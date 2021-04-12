package demo.Queue;

import java.util.PriorityQueue;
import java.util.Queue;




class Product implements Comparable<Product>{
	
	private int pId;
	private String pName;
	public Product(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + "]";
	}
	@Override
	public int compareTo(Product o) {
		if(this.pId>o.pId) {
			return 1;
		}
		else if(this.pId<o.pId) {
			return -1;
		}
		else
			return 0;
	}
	
}

public class PriorityQueueDemo {
	
	public void pQueue() {
		Queue<Product> obj = new PriorityQueue<Product>();
		obj.add(new Product(123, "Camera"));
		obj.add(new Product(10, "Laptop"));
		obj.add(new Product(20,"Mobile"));
		obj.add(new Product(100,"Speaker"));
		obj.add(new Product(40, "Desktop"));
		obj.add(new Product(50,"Chair"));
		Product p = new Product(40,"Desktop");
		obj.add(p);
//		Iterator itr= (Iterator)obj.iterator();
//		while(itr)) {
//			
//		}
		System.out.println("Size: "+obj.size());
		System.out.println("Element:  "+obj.element());
		System.out.println("Peek:"+obj.peek());
		System.out.println("Poll: "+obj.poll());
		System.out.println("Remove:"+obj.remove());
		System.out.println("Remove All:"+obj.removeAll(obj));
//		System.out.println("Exceptions remove "+obj.remove());
		System.out.println("Exceptions element"+obj.element());
		System.out.println(obj);
	}
	public static void main(String[] args) {
		new PriorityQueueDemo().pQueue();
	}

}
