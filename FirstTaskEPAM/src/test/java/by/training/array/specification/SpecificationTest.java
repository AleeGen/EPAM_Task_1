package by.training.array.specification;

import by.training.array.entity.CustomArray;
import by.training.array.repository.imp.*;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SpecificationTest {
    final static CustomArray testArray = new CustomArray(5, 3, -4, 0, 12, 4, 3, -5, -2, 0);

    @Test
    public void specifyAverageElement() {
        SpecificationAverageElementМore averageElement = new SpecificationAverageElementМore(4);
        boolean result = averageElement.specify(testArray);
        assertFalse(result, "Fail!");
    }

    @Test
    public void specifyCountElement() {
        SpecificationCountElementМore countElement = new SpecificationCountElementМore(12);
        boolean result = countElement.specify(testArray);
        assertFalse(result, "Fail!");
    }

    @Test
    public void specifyMaxElement() {
        SpecificationMaxElementМore maxElement = new SpecificationMaxElementМore(11);
        boolean result = maxElement.specify(testArray);
        assertTrue(result, "Fail!");
    }

    @Test
    public void specifyMinElement() {
        SpecificationMinElementМore minElement = new SpecificationMinElementМore(-6);
        boolean result = minElement.specify(testArray);
        assertTrue(result, "Fail!");
    }

    @Test
    public void specifySumElement() {
        SpecificationSumElementМore sumElement = new SpecificationSumElementМore(15);
        boolean result = sumElement.specify(testArray);
        assertTrue(result, "Fail!");
    }
}