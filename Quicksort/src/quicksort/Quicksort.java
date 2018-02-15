package quicksort;

import java.util.ArrayList;

public class Quicksort implements Comparable<Address> {

    private ArrayList<Address> sortArray = new ArrayList<>();
    private Address add;

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
        Address pivot = list.get(list.size() - 1);

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).compareTo(pivot) < 0) {
                small.add(list.get(i));
            } else {
                big.add(list.get(i));
            }
        }
        small = add(small);
        big = add(big);

        small.add(pivot);
        small.addAll(big);
        sorted = small;

        return sorted;
    }

    public ArrayList<Address> quickSort(ArrayList<Address> list) 
    {
        if (list.size() <= 1) 
        {
            return list; // start with recursion base case
        }
        ArrayList<Address> sorted;  // this shall be the sorted list to return, no needd to initialise
        ArrayList<Address> smaller = new ArrayList<>(); // Address' smaller than pivot
        ArrayList<Address> greater = new ArrayList<>(); // Address' greater than pivot
        //Address pivot = list.get(0);  // first Address in list, used as pivot
        Address pivot = list.get(list.size() / 2);
        int i;
        Address j;  // Variable used for Address' in the loop
        for(i = 1; i < list.size(); i++) 
        {
            j = list.get(i);
            if (j.compareTo(pivot) < 0) //make sure Address has proper compareTo method 
            {
                smaller.add(j);
            } 
            else 
            {
                greater.add(j);
            }
        }
        smaller = quickSort(smaller);  //capitalise 's'
        greater = quickSort(greater);  //sort both halfs recursively
        smaller.add(pivot);          //add initial pivot to the end of the (now sorted) smaller Address
        smaller.addAll(greater);     //add the (now sorted) greater Address to the smaller ones (now smaller is essentially your sorted list)
        sorted = smaller;            //assign it to sorted; one could just as well do: return smaller

        return sorted;
    }

    @Override
    public int compareTo(Address o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
