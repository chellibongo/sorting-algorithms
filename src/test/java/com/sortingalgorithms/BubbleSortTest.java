package com.sortingalgorithms;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Unit test for simple App.
 */
public class BubbleSortTest 
{
    BubbleSort bubbleSort;


    @DisplayName("Test sorting when given array of integers")
    @Test
    void testSort() {
        bubbleSort = new BubbleSort();
        int[] testArray = {2,1};
        int[] expectedArray = {1,2};
        bubbleSort.sort(testArray);
        assertArrayEquals(testArray,expectedArray);
    }

    @DisplayName("Test sorting empty array")
    @Test
    void testSortEmptyArray() {
        bubbleSort = new BubbleSort();
        int[] testArray = {};
        int[] expectedArray = {};
        bubbleSort.sort(testArray);
        assertArrayEquals(expectedArray, testArray);
    }

    @DisplayName("Test sorting array of 100 elements")
    @Test
    void testSortLargeArray() {
        bubbleSort = new BubbleSort();
        Random random = new Random();
        int[] testArray = random.ints(100, 0, 100).toArray();

        bubbleSort.sort(testArray);
        
        assertTrue(ArrayUtils.isSorted(testArray));
    }


}
