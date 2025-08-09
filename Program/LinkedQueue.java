//Name of source file:LinkedQueue.java
//Name: Yeung Wang Sang 
//Class: IT114105-1A
//Student ID: 240021235
/*Description: This file include the LinkedQueue, size, isEmpty, enqueue, dequeue, toString and front method. 
*/
public class LinkedQueue implements Queue {
	private LinkedList  qll;
	public LinkedQueue() {
		qll = new LinkedList();
	}
	public int size() {
		return qll.count();
	}
	public boolean isEmpty() {
		return qll.isEmpty();
	}
	public void enqueue(Object item) throws QueueFullException {
		qll.addToTail(item);
	}
	public Object dequeue() throws QueueEmptyException {
		try {
			Object item = qll.removeFromHead();
			return item;
		}
		catch (EmptyListException e) {
			throw new QueueEmptyException();
		}
	}
	
	public String toString() {
		return qll.toString();
	}
	public Object front() throws QueueEmptyException {
		try {
			Object item = qll.removeFromHead();
			qll.addToHead(item);
			return item;
		}
		catch (EmptyListException e) {
			throw new QueueEmptyException();
		}
	}

	
}