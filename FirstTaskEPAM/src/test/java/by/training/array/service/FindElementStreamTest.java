package by.training.array.service;

import by.training.array.entity.CustomArray;
import by.training.array.service.imp.FindElement;
import by.training.array.service.imp.FindElementStream;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FindElementStreamTest {

    static final int[] testArray = {5, 3, -4, 0, 12, 4, 3, -5, -2, 0};

    @Test
    public void testTakeMaxElement() {
        CustomArray customArray = new CustomArray(testArray);
        FindElementStream findElement = new FindElementStream();
        assertEquals(12, findElement.takeMaxElement(customArray).getAsInt(), "Fail!");
    }

    @Test
    public void testTakeMinElement() {
        CustomArray customArray = new CustomArray(testArray);
        FindElementStream findElement = new FindElementStream();
        assertEquals(-5, findElement.takeMinElement(customArray).getAsInt(), "Fail!");
    }

    @Test
    public void testTakeSumElements() {
        CustomArray customArray = new CustomArray(testArray);
        FindElementStream findElement = new FindElementStream();
        assertEquals(16, findElement.takeSumElements(customArray).getAsInt(), "Fail!");
    }

    @Test
    public void testTakeAverageElement() {
        CustomArray customArray = new CustomArray(testArray);
        FindElementStream findElement = new FindElementStream();
        assertEquals(1.6, findElement.takeAverageElement(customArray).getAsDouble(), "Fail!");
    }

    @Test
    public void testTakePositiveElements() {
        CustomArray customArray = new CustomArray(testArray);
        FindElementStream findElement = new FindElementStream();
        assertEquals(5, findElement.takePositiveElements(customArray), "Fail!");
    }

    @Test
    public void testTakeNegativeElements() {
        CustomArray customArray = new CustomArray(testArray);
        FindElementStream findElement = new FindElementStream();
        assertEquals(3, findElement.takeNegativeElements(customArray), "Fail!");
    }

    @Test
    public void testReplaceElement() {
        CustomArray customArray = new CustomArray(testArray);
        CustomArray customArray1 = new CustomArray(5, 3, 1, 1, 12, 4, 3, 1, 1, 1);
        FindElementStream findElement = new FindElementStream();
        findElement.replaceElement(customArray, 1);
        assertEquals(customArray1.getArray(), customArray.getArray(), "Fail!");
    }
}