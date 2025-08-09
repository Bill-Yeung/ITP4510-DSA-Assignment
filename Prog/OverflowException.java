//Name of source file:OverflowException.java
//Name: Yeung Wang Sang 
//Class: IT114105-1A
//Student ID: 240021235
/*
When the user input number larges than the integer max value ((2^31)-1). 
For example, when the user input the 2147483648 it will throw this exception. 
*/
public class OverflowException extends Exception {
    public OverflowException(String message) {
        super(message);
    }
}
