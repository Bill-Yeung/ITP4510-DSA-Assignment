//Name of source file:QueueEmptyException.java
//Name: Yeung Wang Sang 
//Class: IT114105-1A
//Student ID: 240021235
/*Description: When the queue is empty, it will throw this exception.
*/
public class QueueEmptyException extends RuntimeException {
    public QueueEmptyException() {
        super("Queun is Empty");
    }
}
