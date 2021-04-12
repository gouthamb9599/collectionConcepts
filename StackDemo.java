package demo.List;

import java.util.Stack;

import demo.user.object.Employee;

public class StackDemo {
		public void stackOperations() {
			Stack<Object> stack = new Stack<>() ;
			//heterogenous object
			Stack<Object> stack2 = new Stack<>() ;
			
			System.out.println("Inital default capacity: "+stack.capacity());
			System.out.println("Size before pushing "+stack.size());
			
			stack.push("java");//string object
			stack.push(100);//int object
			stack.push(1231.12f);//float object
			//creating user defined object
			Employee emp1 = new Employee(10, "goutham");
			//pushing it to its inital max capacity
			stack.push(emp1);
			stack.push(emp1);
			stack.push("javas");
			System.out.println("Size after pushing "+stack.size());
			System.out.println("after pushing more than 6 objects capacity: "+stack.capacity());
			
			
			stack.push(1002);//int object
			stack.push(123121.12f);
			stack.push("javak");//string object
			stack.push(1003);//int object
			stack.push(123133.12f);
			System.out.println(emp1.toString());
			System.out.println("Size after pushing "+stack.size());
			System.out.println("after pushing more than 10 objects capacity: "+stack.capacity());
			
			stack.push(123121.12f);
			stack.push("javak");//string object
			stack.push(1003);//int object
			stack.push(123133.12f);
			System.out.println("Size after pushing "+stack.size());
			System.out.println("after pushing more than 13 objects capacity: "+stack.capacity());
			
			
			stack.trimToSize();
			System.out.println("after trim to size: "+stack.capacity());
			
			System.out.println("first element:"+stack.firstElement());
			System.out.println("Last element:"+stack.lastElement());
			System.out.println(" element at Index "+stack.get(3));
			System.out.println("index of element "+stack.indexOf("javas"));
			System.out.println("last index of element "+stack.lastIndexOf(emp1));
			Object obj []= stack.toArray();
			for (Object object:obj) {
				System.out.println(object);
			}
			
			//stack 2 elements
			stack2.push(123121.12f);
			stack2.push("javak");//string object
			stack2.push(1003);//int object
			stack2.push(123133.12f);
			
			
			System.out.println(stack2);
			stack2.pop();
			System.out.println("after pop: "+stack2);
			stack.retainAll(stack2);
			
			
			System.out.println("after retain: "+stack2);
			
			System.out.println("sublist"+stack.subList(2, 5));
			
			System.out.println("contains"+stack.contains(emp1));
			
			

			
			
			stack.clear();
//			stack.popAll();//same as clear
			System.out.println("Size after clear:  "+stack.size());
			
		}
		public static void main(String[] args) {
			StackDemo demo = new StackDemo();
			demo.stackOperations();
		}
	}

