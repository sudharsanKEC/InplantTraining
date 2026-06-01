package List;
/*
 * This is 2D arraylist, which is a list of lists
 */

import java.util.*;
public class TwoDArrayList {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryItems= new ArrayList<>(); //2D arraylist


        ArrayList<String> bakeryList=new ArrayList<>();//1d list
        bakeryList.add("Bun");
        bakeryList.add("cake");
        bakeryList.add("Sweets");


        ArrayList<String> weightsList=new ArrayList<>();//1d list
        weightsList.add("10.5");
        weightsList.add("1.5");
        weightsList.add("50.5");


        ArrayList<String> RateList=new ArrayList<>();//1d list
        RateList.add("200");
        RateList.add("450");
        RateList.add("600");

        //Adding those 1d list in the 2D arraylist
        groceryItems.add(bakeryList);
        groceryItems.add(weightsList);
        groceryItems.add(RateList);
        //Now the 1d list are the elements of the 2d list


        //printing the whole array list
        System.out.println("2D groceryList : "+groceryItems);


        //printing the list according to its index wise
        System.out.println("List at index 0 : "+groceryItems.get(0));
        System.out.println("List at index 1 : "+groceryItems.get(1));
        System.out.println("List at index 2 : "+groceryItems.get(2));


        //printing the elements of the 1d arraylist
        System.out.println("1st list 3rd element : "+groceryItems.get(0).get(2));
        System.out.println("2nd list 2nd element : "+groceryItems.get(1).get(1));
        System.out.println("3rd list 1st element : "+groceryItems.get(2).get(0));
    }
}
