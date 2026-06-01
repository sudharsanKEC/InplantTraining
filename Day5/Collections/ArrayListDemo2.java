package List;

import java.util.*;//ArrayList is available in java.util.*;
public class ArrayListDemo2 {
    public static void main(String[] args){
        int a[]=new int[5];// fixed size
        ArrayList<Integer> alist=new ArrayList<Integer>();// flexible with size
        //arraylist of integer type
        alist.add(1);
        alist.add(2);
        alist.add(3);
        System.out.println("Elements in alist:"+alist);

        //arraylist of String type
        ArrayList<String> slist=new ArrayList<String>();
        slist.add("Sudharsan");
        System.out.println("Element in string list:"+slist);
        

        //arraylist of anytype
        ArrayList AnyType=new ArrayList();
        
        AnyType.add(1);
        AnyType.add("Sudharsan");
        AnyType.add(5.5);
        AnyType.add(1);
        AnyType.add(1);// we can add same elements many times
        
        System.out.println("Elements in anyType array:"+AnyType);
        
        //cloning an array list
        //cloning is completely creating a new list and copying from the other list
        //Syntax for arraylist with no type : ArrayList clonedList = (ArrayList) originalList.clone();
        //Syntax for arraylist with type    : ArrayList<Type> clonedList = (ArrayList<Type>) originalList.clone();

        ArrayList<Integer> alist2=(ArrayList<Integer>) alist.clone();
        ArrayList AnyType2=(ArrayList) AnyType.clone();


        System.out.println("alist2 after cloning from alist1:"+alist2);
        System.out.println("AnyType2 after cloning from AnyType:"+AnyType2);
        

        //addAll() is used to add the elements of a list to an already existing list at the last
        //Syntax: originalList.addAll(anotherList)
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("A");
        originalList.add("B");
        ArrayList<String> anotherList = new ArrayList<>();
        anotherList.add("C");
        anotherList.add("D");
        System.out.println("Original list before addAll():"+originalList);
        // Add all elements from anotherList to originalList
        originalList.addAll(anotherList);
        System.out.println("Original List after adding another list to it using addAll(): " + originalList); // Output: [A, B, C, D]
        //System.out.println("Another List: " + anotherList);
        //adding a list to another list at specific position
        originalList.addAll(2,anotherList);
        System.out.println("Original list after adding the another list in its specified position:"+originalList);


        //sublist()
        //Syntax: NewList = OldList.sublist(starting index,ending index);
        // Creating an ArrayList and adding some elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Pineapple");
    
        // Using the subList() method to get a sublist from index 1 to 3
        List<String> subFruits = fruits.subList(1, 4);
    
        // Displaying the original list
        System.out.println("Original list: " + fruits);
    
        // Displaying the sublist
        System.out.println("Sublist: " + subFruits);


        //Clearing or deleting the objects in the list
        //Syntax : arraylist.clear();
        alist.clear();// it will clear the list fully
        
        System.out.println("After clearing arraylist alist:"+alist);

        
        // to print the list elements seperately
        System.out.println("Elements in the arraylist printed using for each loop:");
        for(int i:alist2){
            System.out.println(i);
        }
        
        //Using iterator to print seperately
        Iterator<Integer> i= alist2.iterator();
        
        System.out.println("Using iterator:");
        while(i.hasNext()) // Check if there are more elements
        {
            System.out.println(i.next()); // Print the element
        }
    }
}
