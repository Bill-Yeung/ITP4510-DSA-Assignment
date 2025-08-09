//Name of source file:LinkedQueue.java
//Name: Yeung Wang Sang 
//Class: IT114105-1A
//Student ID: 240021235
/*Description: This file have the Queue interface.  
*/
public interface Queue {
	public abstract boolean isEmpty();
	public abstract int size();
	public abstract Object front() throws QueueEmptyException;
	public abstract void enqueue(Object item) throws QueueFullException;
	public abstract Object dequeue() throws QueueEmptyException;
}