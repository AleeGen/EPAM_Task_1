package by.training.array.service;

import by.training.array.entity.CustomArray;
import by.training.array.exception.CustomUniversalException;
import by.training.array.service.imp.SortElement;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SortElementTest {

    static final int[] actual = {-5, -4, -2, 0, 0, 3, 3, 4, 5, 12};
    static final int[] testArray = {5, 3, -4, 0, 12, 4, 3, -5, -2, 0};

    @Test
    public void testBubbleSort() {
        CustomArray customArray = new CustomArray(testArray);
        new SortElement().bubbleSort(customArray);
        assertEquals(actual, customArray.getArray(), "Fail!");
    }

    @Test
    public void testQuickSort() throws CustomUniversalException {
        CustomArray customArray = new CustomArray(testArray);
        new SortElement().quickSort(customArray, 0, 9);
        assertEquals(actual, customArray.getArray(), "Fail!");
    }

    @Test
    public void testMergerSort() {
        CustomArray customArray = new CustomArray(testArray);
        new SortElement().mergerSort(customArray);
        assertEquals(actual, customArray.getArray(), "Fail!");
    }

    @Test
    public void streamSort() {
        CustomArray customArray = new CustomArray(testArray);
        new SortElement().streamSort(customArray);
        assertEquals(actual, customArray.getArray(), "Fail!");
    }
}