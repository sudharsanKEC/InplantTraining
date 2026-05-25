package MultipleTryCatch;

public class OneCatchMultipleExceptions {
    public static void main(String[] args) {
        
        try {

            int a = Integer.parseInt("abc");
            int b = 10 / 0;

        } catch (NumberFormatException | ArithmeticException e) {

            System.out.println("Number or arithmetic error");

        }

    }
}
