package by.training.array.service.imp;


import by.training.array.entity.CustomArray;
import by.training.array.service.ElementCalculator;
import by.training.array.service.ElementFind;
import by.training.array.service.ElementReplace;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.OptionalDouble;
import java.util.OptionalInt;


public class FindElement implements ElementCalculator, ElementFind, ElementReplace {
    final static Logger logger = LogManager.getLogger();

    public FindElement() {
    }

    public OptionalInt takeMaxElement(CustomArray customArray) {
        if (customArray.getArray().length < 1) {
            logger.log(Level.ERROR, "Length array{} <1", customArray);
            return OptionalInt.empty();
        }
        int[] array = customArray.getArray();
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return OptionalInt.of(max);
    }

    public OptionalInt takeMinElement(CustomArray customArray) {
        if (customArray.getArray().length < 1) {
            logger.log(Level.ERROR, "Length array{} <1", customArray);
            return OptionalInt.empty();
        }
        int[] array = customArray.getArray();
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return OptionalInt.of(min);
    }

    public OptionalInt takeSumElements(CustomArray customArray) {
        if (customArray.getArray().length < 1) {
            logger.log(Level.ERROR, "Length array{} <1", customArray);
            return OptionalInt.empty();
        }
        int[] array = customArray.getArray();
        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
            sum += array[i];
        }
        return OptionalInt.of(sum);
    }

    public OptionalDouble takeAverageElement(CustomArray customArray) {
        if (customArray.getArray().length < 1) {
            logger.log(Level.ERROR, "Length array{} <1", customArray);
            return OptionalDouble.empty();
        }
        double sum = takeSumElements(customArray).getAsInt();
        double average = sum / customArray.getArray().length;
        return OptionalDouble.of(average);
    }

    public int takePositiveElements(CustomArray customArray) {
        if (customArray.getArray().length < 1) {
            logger.log(Level.ERROR, "Length array{} <1", customArray);
            return 0;
        }
        int[] array = customArray.getArray();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public int takeNegativeElements(CustomArray customArray) {
        if (customArray.getArray().length < 1) {
            logger.log(Level.ERROR, "Length array{} <1", customArray);
            return 0;
        }
        int[] array = customArray.getArray();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
        }
        return count;
    }

    public void replaceElement(CustomArray customArray, int replaceElement) {
        if (customArray.getArray().length < 1) {
            logger.log(Level.ERROR, "Length array{} <1", customArray);
            return;
        }
        int[] array = customArray.getArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < replaceElement) {
                array[i] = replaceElement;
            }
        }
        customArray.setArray(array);
    }

}
