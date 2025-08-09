//Name of source file:QueueFullException.java
//Name: Yeung Wang Sang 
//Class: IT114105-1A
//Student ID: 240021235
/*Description: When the queue is full, it will throw this exception.
*/
public class QueueFullException extends RuntimeException {
    public QueueFullException() {
        super("Queun is full");
    }
}



