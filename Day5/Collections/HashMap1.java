package Map;
import java.util.*;
public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String,Integer> hm1=new HashMap<>();
        System.out.println("Initial map:"+hm1);
        System.out.println("==============================================================================================");
        
        //Adding values to the map
        hm1.put("Alice",25);
        hm1.put("Bob",30);
        hm1.put("Charlie",35);
        hm1.put("David",40);
        hm1.put("Ram",25);//Duplicate values are allowed,but keys are unique
        //Printing the map
        System.out.println("hm1="+hm1);
        System.out.println("==============================================================================================");



        //get(key): Retrieves the value associated with the specified key. If the key doesn't exist, it returns null.
        // Retrieve values using get()
        System.out.println("hm1.get(\"Bob\") :" + hm1.get("Bob")); // Should print 30
        System.out.println(" hm1.get(\"Eve\") :" + hm1.get("Eve")); // Should print null
        System.out.println("==============================================================================================");



        //getOrDefault(key, defaultValue): Retrieves the value associated with the specified key, or returns the default value if the key doesn't exist.
        // Retrieve values using getOrDefault()
        System.out.println("hm1.getOrDefault(\"Bob\", 0) : " + hm1.getOrDefault("Bob", 0)); // Should print 30
        System.out.println("hm1.getOrDefault(\"Eve\", 0) : " + hm1.getOrDefault("Eve", 0)); // Should print 0
        System.out.println("==============================================================================================");



        //Check if a particular key exists in the HashMap using containsKey().
        // Check if a key exists using containsKey()
        System.out.println("hm1.containsKey(\"Alice\") : " + hm1.containsKey("Alice")); // Should print true
        System.out.println("hm1.containsKey(\"Eve\") : " + hm1.containsKey("Eve")); // Should print false
        System.out.println("==============================================================================================");



        //Check if a particular value exists in the HashMap using containsValue().
        // Check if a value exists using containsValue()
        System.out.println("hm1.containsValue(30) : " + hm1.containsValue(30)); // Should print true
        System.out.println("hm1.containsValue(40) : " + hm1.containsValue(40)); // Should print false
        System.out.println("==============================================================================================");


        //Using forEach() to iterate the HashMap
        System.out.println("forEach() to iterate the HashMap:");
        hm1.forEach((key,value)->System.out.println(key+" : "+value));
        System.out.println("==============================================================================================");


        System.out.println("Using entrySet to iterate:");
        for(var entry:hm1.entrySet()){
            System.out.println(entry.getKey() + ": "+ entry.getValue());
        }
        System.out.println("==============================================================================================");


        // remove() method
        System.out.println("hm1.remove(\"Bob\"):"+hm1.remove("Bob"));
        System.out.println(hm1);
        System.out.println("hm1.remove(\"Eve\"):"+hm1.remove("Eve"));
        System.out.println("==============================================================================================");

        //size()
        System.out.println(hm1.size());
        System.out.println(hm1);

    }
}
