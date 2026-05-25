package CriticalUnhandableErrors;
class TestErrorHandling {

    static void recursiveMethod() {
        recursiveMethod(); // infinite recursion
    }

    public static void main(String[] args) {

        try {
            recursiveMethod();
        } catch (StackOverflowError e) {
            System.out.println("Stack overflow occurred!");
        }

        System.out.println("Program continues...");
    }
}