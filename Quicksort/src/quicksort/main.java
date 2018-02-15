
package quicksort;

import java.util.ArrayList;

public class main {
    
    public static void main(String[] args) {
//        Sem2HashMap hm = new Sem2HashMap();
//        
//        hm.put("herp", new Address("derp"));
//        
//        hm.put("SURP", new Address("LERP"));
//        
//        System.out.println(hm.get("herp").toString());
        Quicksort qs = new Quicksort();
        ArrayList<Address> list = new ArrayList<>();
        list.add(new Address("A")); 
        list.add(new Address("C")); 
        list.add(new Address("B"));
        list.add(new Address("O"));
        list.add(new Address("D"));
        list.add(new Address("Q")); 
        System.out.println(list);
        System.out.println("\nSort");
        list = qs.quickSort(list);
        System.out.println("\n" + list);

    }
    
}
