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
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.street.compareToIgnoreCase(o.street);
    }
}
