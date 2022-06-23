package com.sortingalgorithms;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;;

/**
 * Unit test for simple App.
 */
public class BubbleSortTest 
{
    BubbleSort bubbleSort;


    @Test
    @DisplayName("Test sorting when given array of integers")
    void testSort() {
        bubbleSort = new BubbleSort();
        int[] testArray = {2,1};
        int[] expectedArray = {1,2};
        bubbleSort.sort(testArray);
        assertArrayEquals(testArray,expectedArray);
    }
}
