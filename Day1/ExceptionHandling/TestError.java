package CriticalUnhandableErrors;
class TestError {

    public static void main(String[] args) {

        int[] arr = new int[Integer.MAX_VALUE]; // Out of memory error by JVM.

        System.out.println("Array created");
    }
}