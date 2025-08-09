//Name of source file:NegativeZeroException.java
//Name: Yeung Wang Sang 
//Class: IT114105-1A
//Student ID: 240021235
/*Description: 
This exception when the user input the 0 or negative number than will throw this excerption. 
For example, Conter and simulation minutes should not be input 0 and negative number. 
However, Servings times should not be input negative number. 
*/
public class NegativeZeroException extends RuntimeException {
    public NegativeZeroException(String message) {
        super(message);
    }
}