package List;
/*
 * ArrayList is a combination od array and list
 * 
 * 
 * 1)ArrayList is resizable(whereas array is fixed)
 * 2)Heterogenous objects are allowed(different types of objects,whereas array only allows same type of elements)
 * 3)Data structure behind this ArrayList : Growable array or dynamic array
 * Advantages:
 *       --->Array list elements is also arranged in contigous memory like arrays, so traversal is faster
 *       --->Data retrieval is faster
 * Disadvantages:
 *       --->Add or removal of an element at first or middle is difficult, we may easily do it with the in built methods but the internal process is complex
 * class - Package,Constructor,Methods,variables
 */

/*
 * Syntax:
 * with datatype:
 * ArrayList<datatype> List_name = new ArrayList<datatype>(Size); Note: Giving the size is an optional one
 *  without datatype:
 * ArrayList List_name = new ArrayList(size);
 */

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
       // @SuppressWarnings("rawtypes")
        
        
       
       ArrayList al=new ArrayList();
        // the index position of array list starts from 0
        //Syntax : al.add(element);
        al.add(10);//add appends the element at the end
        al.add(12);
        al.add(13);
        //The above values 10,12,13 are passed to the list add() method as an Integer class object, not as a primitive data type
        
        System.out.println(al);// it prints the whole element in the array list
        System.out.println(al.add(14));// after adding an element in the ArrayList it returns true if it is successfully added and false if it is not added
        System.out.println(al);
        
        al.add("James Gosling");//any datatypes can be added
        al.add(5.2);//any datatypes can be added
        al.add('c');// any datatypes can be added
        al.add(true);//any datatypes can be added
        al.add(null);

        
        System.out.println("Elements of list: "+al);
        System.out.println("Size of the list: "+al.size());

        // adding element at different position
        //syntax: listName.add(index,element);
        System.out.println("Adding Hitler at fourth position:");
        al.add(4,"Hitler");// makes the current element to be in next position and wont delete or replaces the element at that index position
        System.out.println(al);


        //replacing an element at a specific index position
        //syntax : al.set(index,element);
        System.out.println("replacing stalin at the 4th position : ");
        al.set(4,"stalin");//replaces the element thats in the index position 4
        System.out.println(al);

        // to check an availability of an element in the list
        // Syntax : al.contains(element);
        System.out.println("Checking Hiter is available in that list : "+al.contains("Hitler"));
        System.out.println("Checking 1 is in the list : "+al.contains(1));

        
        //to get an element at specific index position
        //Syntax : al.get(indexPosition);
        System.out.println(al.get(0));
        System.out.println(al.get(5));

        
        //removing an element
        //Syntax : al.remove(index);
        System.out.println(al.remove(6));//prints the removed element 
        System.out.println(al);

        
        //get() prints the element from the index position,but not remove it
        //remove() prints the element as well as removed it from the list


        //to find an index of an element
        //Syntax : al.indexOf(element);
        System.out.println("Index of true in the list:"+al.indexOf(true));

    }
}
