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
    public void testAddArrayData() {
    }

    @Test
    public void testAdd() {
    }

    @Test
    public void testQuickSort() 
    {
        System.out.println("quick");
        ArrayList<Address> list = new ArrayList<>();
        Quicksort qs = new Quicksort();
        list.add(new Address("A"));
        list = qs.quickSort(list);
        assertTrue(list.size() == 1);
        System.out.println("Size is: " + list.size());
        assertEquals("A", list);
    }
}
