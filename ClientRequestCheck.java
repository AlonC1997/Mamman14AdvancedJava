import java.util.ArrayList;

public class ClientRequestCheck {
	public static void main (String[]args) {
		
		ClientRequest req1 = new ClientRequest("Alon", 12345 , "Good Product" ) ;
		ClientRequest req2 = new ClientRequest("Guy", 12346 , "Good Product" ) ;
		ClientRequest req3 = new ClientRequest("Eadan", 12347 , "Good Product" ) ;
		ClientRequest req4 = new ClientRequest("Michal", 12348 , "Good Product" ) ;
		ClientRequest req5 = new ClientRequest("Uriel", 12349 , "Good Product" ) ;
		ClientRequest req6 = new ClientRequest("Uriel", 12349 , "Good Product" ) ;
		ClientRequest req7 = new ClientRequest("Alon", 12345 , "Good Product" ) ; // To show that its same request as 1.
		ClientRequest req8 = new ClientRequest("Michal", 12348 , "Not Good Product" ) ; //To show that contains with req4 == false.

		PriorityQueue <ClientRequest> queue1 = new PriorityQueue <ClientRequest>(10) ;

		queue1.add(req1, 1);
		queue1.add(req2, 1);
		queue1.add(req3 , 2);
		queue1.add(req4, 5);
		queue1.add(req5, 5);
		queue1.add(req6, 7);
		queue1.add(req7, 9);
		queue1.add(req8, 9);

		ArrayList<ClientRequest> iterator = queue1.getIterator();
		for (int i = 0; i < iterator.size() ; i++) {
			System.out.println(iterator.get(i)) ;
			System.out.println("Details are: " + "\n" + "Name: " + iterator.get(i).getName() + "\n" +
			"ID: " + iterator.get(i).getID() + "\n" + "Request:" + iterator.get(i).getReq()) ;
			System.out.println("") ;
		}
		
		System.out.println("The size of the queue is: " + iterator.size()) ; //To show that i can check size both on the iterator and on the queue.
		System.out.println("") ;
		System.out.println("Poll Function On: " + queue1.poll());
		System.out.println("") ;
		System.out.println("The size of the queue is: " + queue1.getSize()) ;
		System.out.println("") ;
		
		queue1.remove(req6) ;
		queue1.add(req2 ,7);
		queue1.remove(req1) ; //Doing nothing cause already removed by poll function.
		
		ClientRequest req9 = new ClientRequest("Ron", 12316 , "Good Product" ) ;
		ClientRequest req10 = new ClientRequest("Guy", 12317 , "Good Product" ) ;
		ClientRequest req11 = new ClientRequest("Uriel", 12349 , "Not Good Product" ) ;
		
		System.out.println("") ;
		queue1.add(req9,11); //Changing priority to 10.
		queue1.add(req10 ,0); //Changing priority to 10.
		queue1.add(req11 ,8); 
		System.out.println("Added: " + req9 +" "+ req10 +" " + req11) ;
		System.out.println("") ;
		
		
		System.out.println("Contains Function- 'req5' with 'req6': " + req5.contains(req6)) ; // true - same id and same request.
		System.out.println("Contains Function- 'req9' with 'req11': " + req9.contains(req11)) ; // false cause the requests are different.
		
		System.out.println("") ;
				
		System.out.println("The size of the queue is: " + queue1.getSize()) ;
		System.out.println("") ;
		
		ArrayList<ClientRequest> iterator2 = queue1.getIterator();
		for (int i = 0; i < iterator2.size(); i++) {
			System.out.println(iterator2.get(i)) ;
			System.out.println("Details are: " + "\n" + "Name: " + iterator2.get(i).getName() + "\n" +
			"ID: " + iterator2.get(i).getID() + "\n" + "Request:" + iterator2.get(i).getReq()) ;
			System.out.println("") ;
		}
	}
}
