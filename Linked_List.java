import java.util.*;
public class Linked_List
{
	public static void main(String[] args) {
		LinkedList<String> ll= new LinkedList<String>();
		ll.add("Rajveer");
		ll.add("Deepak");
		ll.add("Ranjeet");
		ll.add("Kalpna");
		ll.add("Sapna");
		// System.out.println("Linked List item is:"+ll);
		// ll.addFirst("ranu mandal");
		// System.out.println("**************************");
		// System.out.println("Linked List item is:"+ll);
		// ll.addLast("Arjit singh");
		// System.out.println("**************************");
		// System.out.println("Linked List item is:"+ll);
		// ll.removeFirst();
		// System.out.println("Linked List item is:"+ll);
		// ll.remove(2);
		// System.out.println("Linked List item is:"+ll);
		// ll.set(3,"Prince");
		// System.out.println("Linked List item is:"+ll);
		// System.out.println("Linked List item is:"+ll.get(3));
		// by iterator
		// Iterator<String> r=ll.iterator();
		// while(r.hasNext()){
		// 	System.out.println(r.next());
		// }
		// by advance for loop
		for (String i:ll) {
			System.out.println(i);
		}


	}
}