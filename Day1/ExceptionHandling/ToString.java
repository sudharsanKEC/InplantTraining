package MethodsOfThrowable;
/*
toString()
    This method prints:
        Exception class name + message

*/
public class ToString {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
/*
java.lang.ArithmeticException: / by zero

What it shows
    Exception type
    Message
But no line numbers.

*/
