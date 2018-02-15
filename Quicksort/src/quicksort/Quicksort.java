package quicksort;

import java.util.ArrayList;

public class Quicksort implements Comparable<Address>{

    ArrayList<Address> sortArray = new ArrayList<>();
    Address add;
    
    public void addArrayData() {
        sortArray.add(new Address("dd"));
        sortArray.add(new Address("de"));
        sortArray.add(new Address("dr"));
        sortArray.add(new Address("dt"));
        sortArray.add(new Address("dy"));
        sortArray.add(new Address("du"));
        sortArray.add(new Address("di"));        
    }
    
    public void sorter() {
        
    }

    public ArrayList<Address> add(ArrayList<Address> list) {
        if (list.size() <= 1) {
            return list;
        }
        
        ArrayList<Address> sorted = new ArrayList<>();
        ArrayList<Address> small = new ArrayList<>();
        ArrayList<Address> big = new ArrayList<>();
        Address pivot = list.get(list.size()-1);
        
        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(i).compareTo(pivot) < 0) {
                small.add(list.get(i));
            } else
                big.add(list.get(i));
        }
        small = add(small);
        big = add(big);
        
        small.add(pivot);
        small.addAll(big);
        sorted = small;
        
        return sorted;
    }
    

}
