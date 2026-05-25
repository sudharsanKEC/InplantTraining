package MethodsOfThrowable;

public class GetMessage {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

/*
Output:
        / by zero
    Only the message part is shown.



*/