package MethodsOfThrowable;
/*
This method prints the complete stack trace, showing:
    exception type
    error message
    exact line numbers where the error occurred
    method call chain



*/
public class PrintStackTrace {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

/*


Exception type
↓
java.lang.ArithmeticException

Message
↓
/ by zero

Location
↓
MethodsOfThrowable.PrintStackTrace.main(PrintStackTrace.java:15)

This is the most detailed debugging information.
*/