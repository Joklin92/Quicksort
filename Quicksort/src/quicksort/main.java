
package quicksort;

public class main {
    
    public static void main(String[] args) {
        Sem2HashMap hm = new Sem2HashMap();
        
        hm.put("herp", new Address("derp"));
        
        hm.put("SURP", new Address("LERP"));
        
        System.out.println(hm.get("herp").toString());
    }
    
}
