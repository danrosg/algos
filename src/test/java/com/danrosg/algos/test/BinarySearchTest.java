package com.danrosg.algos.test;

import static  org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.danrosg.algos.*;

public class BinarySearchTest {


    @Test
    public void testbinarysearch(){
        int [] testArray = { 2,3,5,6,8,9,11,11,19};
        assertEquals(23, BinarySearch.binarySearch(testArray,2,0,testArray.length));

    }

}
