/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author malik
 */
public class QuicksortTest {
    
    public QuicksortTest() {
    }
    
    @Before
    public void setUp() {
    }

    @Test
    public void testQuickSort() 
    {
        System.out.println("quick");
        
        Quicksort qs = new Quicksort();
        
        ArrayList<Address> expected = new ArrayList<>();
        expected.add(new Address("A"));
        expected.add(new Address("B"));
        expected.add(new Address("C"));
        expected.add(new Address("D"));
        expected.add(new Address("E"));
        expected.add(new Address("F"));
        expected.add(new Address("G"));
        expected.add(new Address("H"));
        expected.add(new Address("I"));
        expected.add(new Address("J"));

        ArrayList<Address> actual = new ArrayList<>();
        actual.add(new Address("C"));
        actual.add(new Address("A"));
        actual.add(new Address("B"));
        actual.add(new Address("E"));
        actual.add(new Address("D"));
        actual.add(new Address("J"));
        actual.add(new Address("I"));
        actual.add(new Address("H"));
        actual.add(new Address("G"));
        actual.add(new Address("F"));
        

        actual = qs.quickSort(actual);
        
        assertEquals(10, actual.size());
        assertEquals(expected, actual);
    }
}
