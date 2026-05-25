package CustomExceptions;
/*
    In Java, custom exceptions are user-defined exception classes that you create when the built-in exceptions (like NullPointerException, IOException, etc.) do not clearly represent your program’s problem.
    They help you make more meaningful and readable error handling in your application.

    1. Why Custom Exceptions Are Needed
        Imagine you are writing a banking application.
        If a user tries to withdraw more money than available, Java has no built-in exception called:
            InsufficientBalanceException
        But that error is meaningful in your application.
        So you create your own exception class.
        Example real-world situations:
            InvalidAgeException
            InsufficientBalanceException
            ProductOutOfStockException
            InvalidPasswordException
        These make your program clear and professional.

    2. How to Create a Custom Exception
        To create a custom exception, you extend an existing exception class.
        Usually one of these:
            Exception → checked exception
            RuntimeException → unchecked exception
        Basic structure:
        class MyException extends Exception {
            public MyException(String message) {
                super(message);
            }
        }
        super(message) sends the message to the parent Exception class.
*/


// Custom Checked Exception
// Step 1: Create Exception Class
class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }

}

public class CustomExceptions1 {
    static void checkAge(int age) throws InvalidAgeException {
        if(age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Access granted");
    }
    public static void main(String[] args) {
        try {
            checkAge(15);
        }
        catch(InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
//OP: Age must be 18 or above