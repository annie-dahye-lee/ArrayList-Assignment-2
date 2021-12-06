import java.util.*;
import java.util.ArrayList;

public class Question1{
    //private static 
    public static ArrayList<Integer> sieveOfEratosthenes(Integer n) {
        ArrayList<Integer> list = new ArrayList<Integer>(20);
        Integer p = new Integer(2);
      
        
        /*
        // remove every composite number
        for (int i = 0; i < 8; i++) {
            if (list.get(i) % p == 0 ) {
                list.remove(i);
            }
        }
        
        
        /*
        while(p < n) {
            Integer current = list.get(i);
            if (current % p == 0 && current > p) {
                list.remove(i);
            }
            
            if (current > p && current <= n) {
                p = i;
            }
            
            i++;
        }
        
        */
        System.out.println("original list: " + list);
        
        return list;
    }
    
    public static void main(String[] args) {
        System.out.println('\u000C');
        Integer max = new Integer(20);
        sieveOfEratosthenes(max);
        System.out.println("updated list: " + sieveOfEratosthenes(max));
    }
}
