package Set;
/*
 * set-only unique elements
 * Hashset-hashing
 */
import java.util.*;
public class SetInJava {
    public static void main(String[] args){
        HashSet<String> h = new HashSet<String>();
        h.add("Ram");
        h.add("Abi");
        h.add("Priya");
        h.add("Ravi");
        h.add("Abi");
        System.out.println(h);
    }
}
