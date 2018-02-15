package quicksort;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.street);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Address other = (Address) obj;
        if (!Objects.equals(this.street, other.street)) {
            return false;
        }
        return true;
    }
    
    
}
