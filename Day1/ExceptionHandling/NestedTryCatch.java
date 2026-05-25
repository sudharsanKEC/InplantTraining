package MultipleTryCatch;

public class NestedTryCatch {
    public static void main(String[] args) {

        try {

            int[] arr = new int[3];

            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: divide by zero");
            }

            System.out.println(arr[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Outer catch: array index error");

        }

    }
}


//OP:
// Inner catch: divide by zero
// Outer catch: array index error