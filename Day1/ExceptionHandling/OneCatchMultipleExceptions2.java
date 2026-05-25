package MultipleTryCatch;
/*
In this program, when the exception occured in the nested try was catched, it will be handled by the outer try block's catch.
As the exception is occured in the nested try and it was not handled by the nested try's catch it was propagated to the outer try and the remaining code after the nested try will not be executed because of the occured exception.

*/
public class OneCatchMultipleExceptions2 {
    public static void main(String[] args) {
        try { // Outer try
            int[] arr = new int[3];

            try { // Inner try
                int a = 10 / 0;
            } finally {

            }

            System.out.println(arr[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: array index error");
        } catch (ArithmeticException e) {
            System.out.println("Inner catch: divide by zero");
        }
    }
}
