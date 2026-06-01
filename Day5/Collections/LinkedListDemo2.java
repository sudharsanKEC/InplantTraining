package List;
import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        // Creating a raw LinkedList to allow any data type
        LinkedList list = new LinkedList();

        // Adding mixed data types to the list
        list.add("Java");
        list.add(3.14);           // Double type
        list.add(42);             // Integer type
        list.add(true);           // Boolean type

        // Display the LinkedList
        System.out.println("LinkedList with mixed data types: " + list);

        // Using get() method to access elements
        System.out.println("Element at index 2: " + list.get(2)); // Integer 42

        // Using set() to modify an element at a specific index
        list.set(1, 2.71); // Replacing the element at index 1 (Double type)
        System.out.println("After changing element at index 1: " + list);

        // Using peekFirst() - Retrieves the first element without removing it
        System.out.println("First element using peekFirst(): " + list.peekFirst());

        // Using peekLast() - Retrieves the last element without removing it
        System.out.println("Last element using peekLast(): " + list.peekLast());

        // Using pollFirst() - Retrieves and removes the first element
        System.out.println("First element removed using pollFirst(): " + list.pollFirst());
        System.out.println("List after pollFirst: " + list);

        // Using pollLast() - Retrieves and removes the last element
        System.out.println("Last element removed using pollLast(): " + list.pollLast());
        System.out.println("List after pollLast: " + list);

        // Cloning the LinkedList
        LinkedList clonedList = (LinkedList) list.clone();
        System.out.println("\nCloned LinkedList: " + clonedList);

        // Modifying the original list to check if the cloned list is affected
        list.add("New Element");
        System.out.println("\nOriginal LinkedList after adding a new element: " + list);
        System.out.println("Cloned LinkedList after modifying the original: " + clonedList);
    }
}
