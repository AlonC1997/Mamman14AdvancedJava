import java.util.ArrayList;

public class StringCheck {
	public static void main (String[]args) {

		PriorityQueue <String> queue1 = new PriorityQueue<String>(10) ;

		queue1.add("One", 1);
		queue1.add("Two", 1);
		queue1.add("Three", 2);
		queue1.add("Four", 5);
		queue1.add("Five", 5);
		queue1.add("Six", 7);
		queue1.add("Seven", 9);

		ArrayList<String> iterator = queue1.getIterator();
		for (int i = 0; i < iterator.size() ; i++) {
			System.out.println(iterator.get(i)) ;
		}
		System.out.println("") ;
		System.out.println("The size of the queue is: " + iterator.size()) ;
		System.out.println("") ;
		System.out.println("Poll Function On: " + queue1.poll());
		System.out.println("") ;
		
		queue1.remove("Six") ;
		queue1.add("Six2",7);
		queue1.remove("One") ; //Doing nothing cause already removed by poll function.
		queue1.add("Six3",11); //Changing priority to 10.
		queue1.add("Six4",0); //Changing priority to 10.

		System.out.println("Contains Function- 'One' element :" + queue1.contains("One")) ; //false cause already removed
		System.out.println("Contains Function- 'Four' element :"  + queue1.contains("Four")) ; // true cause "Four" is exist.	
		System.out.println("") ;

		
		System.out.println("The size of the queue is: " + queue1.getSize()) ;
		System.out.println("") ;
		
		ArrayList<String> iterator2 = queue1.getIterator();
		for (int i = 0; i < iterator2.size(); i++) {
			System.out.println(iterator2.get(i)) ;
		}
	}
}
