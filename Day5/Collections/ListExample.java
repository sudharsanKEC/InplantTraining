package List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Using List as a reference type allows abstraction
        // We are not tied to a specific implementation like ArrayList or LinkedList

        // Step 1: Create a List using ArrayList implementation
        List<String> list = new ArrayList<>();

        // Adding elements to the ArrayList
        list.add("A");
        list.add("B");
        System.out.println("ArrayList: " + list); // Output: [A, B]

        // Step 2: Switch to LinkedList implementation
        // By using List as the reference type, we can change the implementation easily
        list = new LinkedList<>(list); // Create a LinkedList with existing elements from ArrayList

        // Adding an element to the LinkedList
        list.add("C");
        System.out.println("LinkedList: " + list); // Output: [A, B, C]

        // Key Takeaway:
        // Declaring as 'List' provides flexibility to switch between implementations (ArrayList, LinkedList, etc.)
        // This is a good practice for abstraction and code maintainability.
    }
}
