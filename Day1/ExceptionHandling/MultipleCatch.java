package MultipleTryCatch;

public class MultipleCatch {
    public static void main(String[] args) {
        // One try block can have multiple catch blocks.
        // The exception arised will be catched by the respective block
        // Java checks catch blocks top to bottom.
        try {

            int[] arr = new int[3];
            arr[5] = 10; // error

        } catch (ArithmeticException e) {

            System.out.println("Arithmetic problem");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Array index problem");

        }

    }
}
//OP: Array index problem

// Java checks catch blocks top to bottom.