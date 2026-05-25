package MultipleTryCatch;
public class ExceptionHandling3 {
    public static void main(String[] args) {

        int i = 1; 
        int j = 18; 
        int nums[] = new int[5];
        // java tries to execute the below code in the try block, if it succeeds just shows the output, if runtime error occurs then it was catched by the respective catch exception block.
        try{
            j = j / i;
            System.out.println(j);
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e){
            System.out.println("Got run time error: "+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Got run time error: "+e);
        }
        // here even though a run time error has been faced by the java runtime environment it just shows the exception message and goes to the next line and continue its execution from there.
        System.out.println("Bye");
    }
}
