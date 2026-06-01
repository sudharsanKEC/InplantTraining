package List;
/*
 * LinkedList has an inbuilt form in java,here the inbuilt LinkedList is Doubly Linked List
 * Data structure used : Doubly Linked List
 * It is like same as implementing linked list manually
 * But using in built linked list we can reduce the program work for manually doing linked list
 * It is also accepts heterogenous data types
 * Advantages:
 * Adding or removing element is easier
 * Disadvantage:
 * Retrieving data is slower
 * 
 * 
 * Syntax:
 * With data type:
 *          LinkedList<Type> list = new LinkedList<Type>();
 * Without data type:
 *          LinkedList list = new LinkedList();
 * 
 * 
 * LinkedList specific types:
 * 1)addFirst(),addLast()
 * 2)getFirst(),getLast()
 * 3)pollFirst(),pollLast()
 * 4)removeFirst(),removeLast()
 * 5)offer(),offerFirst(),offerLast()
 * 
 */

 import java.util.LinkedList;

 public class LinkedListDemo1 {
     public static void main(String[] args) {
         // Creating a LinkedList of String type
         LinkedList<String> list = new LinkedList<>();
 
         // 1. add() - Adds elements to the end of the list
         list.add("Apple");
         list.add("Banana");
         list.add("Cherry");
         System.out.println("After adding elements: " + list);
 
         // 2. addFirst() - Adds element at the beginning of the list
         list.addFirst("Mango");
         System.out.println("After adding 'Mango' at the beginning: " + list);
 
         // 3. addLast() - Adds element at the end of the list (same as add())
         list.addLast("Grapes");
         System.out.println("After adding 'Grapes' at the end: " + list);
 
         // 4. get() - Retrieves element at a specific index
         System.out.println("Element at index 2: " + list.get(2));
 
         // 5. remove() - Removes the first occurrence of a specified element
         list.remove("Banana");
         System.out.println("After removing 'Banana': " + list);
 
         // 6. removeFirst() - Removes the first element of the list
         list.removeFirst();
         System.out.println("After removing the first element: " + list);
 
         // 7. removeLast() - Removes the last element of the list
         list.removeLast();
         System.out.println("After removing the last element: " + list);
 
         // 8. peek() - Retrieves, but does not remove, the first element
         System.out.println("First element (peek): " + list.peek());
 
         // 9. poll() - Retrieves and removes the first element, or returns null if the list is empty
         System.out.println("First element (poll): " + list.poll());
         System.out.println("After poll operation: " + list);
 
         // 10. size() - Returns the number of elements in the list
         System.out.println("Size of the list: " + list.size());
 
         // 11. contains() - Checks if the list contains a specified element
         System.out.println("Does the list contain 'Apple'? " + list.contains("Apple"));
 
         list.add("Apple");
         //12. getFirst() - gives the first element
         System.out.println("The first element:" + list.getFirst());

         //13. getLast() - gives the last element
         System.out.println("The last element:" + list.getLast());

         // 14. clear() - Removes all elements from the list
         list.clear();
         System.out.println("After clearing the list: " + list);
 
         // 15. isEmpty() - Checks if the list is empty
         System.out.println("Is the list empty? " + list.isEmpty());


         // Creating a LinkedList
        LinkedList<String> list2 = new LinkedList<>();

        // Using offer() to add an element at the end
        list2.offer("Java");

        // Using offerLast() to add an element at the end (same as offer() for LinkedList)
        list2.offerLast("Python");

        // Using offerFirst() to add an element at the front
        list2.offerFirst("C++");

        // The list now contains: ["C++", "Java", "Python"]

         
     }
 }
 