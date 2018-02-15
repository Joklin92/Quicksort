package quicksort;

import java.util.ArrayList;

public class Quicksort 
{
    
    public ArrayList<Address> quickSort(ArrayList<Address> list) 
    {
        if(list.size() <= 1) 
        {
            return list; // start with recursion base case
        } 
        
        ArrayList<Address> sorted;  // this shall be the sorted list to return, no needd to initialise
        ArrayList<Address> smaller = new ArrayList<>(); // Address' smaller than pivot
        ArrayList<Address> greater = new ArrayList<>(); // Address' greater than pivot
        //Address pivot = list.get(0);  // first Address in list, used as pivot
        Address pivot = list.get(list.size() / 2); //middle value
        int i;
        Address j;  // Variable used for Address' in the loop
        for(i = 0; i < list.size(); i++) 
        {
            j = list.get(i);
            if(j.compareTo(pivot) < 0) //make sure Address has proper compareTo method 
            {
                smaller.add(j);
            } 
            else if (j.compareTo(pivot) > 0) 
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
}
