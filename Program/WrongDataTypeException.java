//Name of source file:WrongDataTypeException.java
//Name: Yeung Wang Sang 
//Class: IT114105-1A
//Student ID: 240021235
/*Description: 
This exception is when the user enters the wrong type of value. It will throw this exception. 
For example, enter the String and double. 
*/
public class WrongDataTypeException extends RuntimeException {
    public WrongDataTypeException(String message) {
        super(message);
    }
}