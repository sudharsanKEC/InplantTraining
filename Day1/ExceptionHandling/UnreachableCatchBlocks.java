package MultipleTryCatch;

public class UnreachableCatchBlocks {
    public static void main(String[] args) {
        // try {
        //     int a = 10 / 0;
        // } catch (Exception e) {
        //     System.out.println("General exception");
        // } catch (ArithmeticException e)  
        // {
        //     System.out.println("Arithmetic exception");
        // }
        // Output: // Exception ArithmeticException has already been caught
        // Because: The parent exception is already catching everything, so the second catch will never execute. Hence it is unreachable.

        // Correct Order
        // You must catch child exceptions first, then parent.
        // Correct version:
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
        } catch (Exception e) {
            System.out.println("General exception");
        }
   }
}


/*

Throwable
   |
   |-- Exception
         |
         |-- ArithmeticException
         |-- NullPointerException
         |-- IOException

Rule:
    Child exception → first
    Parent exception → later         

| Concept           | Meaning                               |
| ----------------- | ------------------------------------- |
| Multiple try      | Several try blocks in a program       |
| Multiple catch    | One try with several catch blocks     |
| Nested try        | try inside another try                |
| Multi-catch       | One catch handles multiple exceptions |
| Unreachable catch | Catch block that can never execute    |


*/