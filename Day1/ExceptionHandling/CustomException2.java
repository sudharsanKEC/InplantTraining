package CustomExceptions;

// This is example for creating a custom unchecked exception
// If you extend RuntimeException, you don't need throws or try-catch.
class InvalidAmountException extends RuntimeException {

    public InvalidAmountException(String message) {
        super(message);
    }

}

public class CustomException2 {
    static void withdraw(int amount)  // throws Exception is optional here
    {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be greater than zero");
        }
        System.out.println("Withdrawal successful");
    }

    public static void main(String[] args) {
        withdraw(-100);
    }
}
// OP: Exception in thread "main" InvalidAmountException: Amount must be greater than zero

/*
| Type      | Extend             | Must handle? |
| --------- | ------------------ | ------------ |
| Checked   | `Exception`        | Yes          |
| Unchecked | `RuntimeException` | No           |




*/