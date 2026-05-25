package MultipleTryCatch;

public class MultipleTryCatch {
        public static void main(String[] args) {
            //First try block
            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic exception occurred");
            }

            // Second try block
            try {
                int[] arr = {1,2,3};
                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bounds");
            }

            System.out.println("Program continues...");
        }
}
// Each try block handles different errors separately.