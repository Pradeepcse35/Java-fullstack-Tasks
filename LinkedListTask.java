package JavaArray_Tasks;
import java.util.LinkedList;
import java.util.Iterator;


public class LinkedListTask {
	public static void main(String [] args) {
		LinkedList<String> li=new LinkedList<String>();
		li.add("Java");
		li.add("Core Java");
		li.add("Avance Java");
		li.add("Python");
		
		System.out.println("Programming Languages:"+li);
		
		LinkedList<String> li1=new LinkedList<String>();
		li1.add("Dot Net");
		li1.add("C programming");
		li1.add("C++");
		
		li.addAll(li1);
		Iterator<String> t=li.iterator();
		while(t.hasNext()) {
			System.out.println(t.next());
		}
		//Remove the Specify Element from the list
		li.remove(2);
		li.remove(3);
		System.out.println("After Removing the specify elements : "+li);
		
		//to append the last element from the list
		li.set(5,"Java Scipt");
		System.out.println("After Appending the last :"+li);
		
		//to insert the Specify element from the last
		li.addLast("CSS");
		System.out.println("After insert the last Element from the list: "+li);
		
	}
}
