import java.util.ArrayList;

public class PriorityQueue<T> {

	private ArrayList<T>[] queue ;
	private int maxPriortity ;
	private int size; 

	public PriorityQueue(int n) {
		this.maxPriortity = n ;
		this.queue = new ArrayList[this.maxPriortity] ;
		for (int i = 0; i < n ; i++) {
			this.queue[i] = new ArrayList<>() ;
		}
		this.size = 0 ;
	}

	public void add(T x, int n) {
		if (n < 1 || n > 10) {
			n = 10 ; 
		}
		this.queue[n-1].add(x) ;
		this.size++;
	}

	public T poll() {
		if (isQueueEmpty()) {
			return null ;
		}
		int x = indexNotEmpty() ;
		T element = this.queue[x].get(0) ;
		this.queue[x].remove(0) ;
		this.size-- ;
		return element ;
	}

	public ArrayList<T> getIterator() {
		ArrayList<T> temp = new ArrayList<>() ;
		for (int i = 0; i < this.queue.length; i++) {
			temp.addAll(this.queue[i]) ;
		}		
		return temp ;
	}

	public boolean contains(T x) {
		for (int i = 0; i < getSize() ; i++) {
			if (getIterator().get(i).equals(x) == true ) {
				return true;
			}
		}
		return false ;
	}

	public boolean remove(T x) {
		for (int i = 0; i < getSize() ; i++) {
			if (getIterator().get(i).equals(x) == true ) {
				removeFromQueue(getIterator().get(i)) ;
				return true ;
			}
		}
		return false ;
	}

	public int getSize() {
		return this.size ;
	}


	private void removeFromQueue(T x){
		for (int i = 0; i < this.queue.length; i++) {
			for (int j = 0; j < this.queue[i].size(); j++) {
				if (this.queue[i].get(j).equals(x) == true) {
					this.queue[i].remove(j) ;
					this.size-- ;
					return;
				}
			}

		}
	}

	private boolean isQueueEmpty() {
		for (int i = 0; i < this.queue.length ; i++) {
			if (this.queue[i].isEmpty() == false) {
				return false;
			}
		}
		return true ;
	}

	private int indexNotEmpty() {
		for (int i = 0; i < this.queue.length; i++) {
			if (this.queue[i].isEmpty() == false) {
				return i ;
			}
		}
		return 0 ;
	}


}
