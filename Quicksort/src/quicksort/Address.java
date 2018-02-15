package quicksort;

/**
 * The purpose of Address is to...
 * @author kasper
 */
public class Address implements Comparable<Address>{
  String street;
  Address(String st){
    street = st;
  }
  
    @Override
    public int compareTo(Address o) 
    {
        return this.street.compareToIgnoreCase(o.street);
    }

    @Override
    public String toString() {
        return street;
    }
    
    
}
