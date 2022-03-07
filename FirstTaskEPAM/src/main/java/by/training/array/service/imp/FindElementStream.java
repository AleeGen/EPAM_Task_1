package by.training.array.service.imp;

import by.training.array.entity.CustomArray;
import by.training.array.exception.CustomUniversalException;
import by.training.array.service.ElementCalculator;
import by.training.array.service.ElementFind;
import by.training.array.service.ElementReplace;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

import by.training.array.entity.CustomArray;
import by.training.array.exception.CustomUniversalException;
import by.training.array.service.ElementCalculator;
import by.training.array.service.ElementFind;
import by.training.array.service.ElementReplace;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindElementStream implements ElementCalculator, ElementFind, ElementReplace {
    final static Logger logger = LogManager.getLogger();

    public FindElementStream() {
    }

    public OptionalInt takeMaxElement(CustomArray customArray) {
        if (customArray.getArray().length < 1) {
            logger.log(Level.ERROR, "Length array{} <1", customArray);
            return OptionalInt.empty();
        }
        int max = Arrays.stream(customArray.getArray())
                .reduce(0, (a, b) -> (a > b ? a : b));
        return OptionalInt.of(max);
    }

    public OptionalInt takeMinElement(CustomArray customArray) {
        if (customArray.getArray().length < 1) {
            logger.log(Level.ERROR, "Length array{} <1", customArray);
            return OptionalInt.empty();
        }
        int min = Arrays.stream(customArray.getArray())
                .reduce(0, (a, b) -> (a > b ? b : a));
        return OptionalInt.of(min);
    }

    public OptionalInt takeSumElements(CustomArray customArray) {
        if (customArray.getArray().length < 1) {
            logger.log(Level.ERROR, "Length array{} <1", customArray);
            return OptionalInt.empty();
        }

        int sum = Arrays.stream(customArray.getArray())
                .reduce(0, (a, b) -> a + b);
        return OptionalInt.of(sum);
    }

    public OptionalDouble takeAverageElement(CustomArray customArray) {
        if (customArray.getArray().length < 1) {
            logger.log(Level.ERROR, "Length array{} <1", customArray);
            return OptionalDouble.empty();
        }
        double sum = takeSumElements(customArray).getAsInt();
        double average = sum / (double) customArray.getArray().length;
        return OptionalDouble.of(average);
    }

    public int takePositiveElements(CustomArray customArray) {
        if (customArray.getArray().length < 1) {
            logger.log(Level.ERROR, "Length array{} <1", customArray);
            return 0;
        }

        int count = (int) Arrays.stream(customArray.getArray())
                .filter(a -> a > 0)
                .count();
        return count;
    }

    public int takeNegativeElements(CustomArray customArray) {
        if (customArray.getArray().length < 1) {
            logger.log(Level.ERROR, "Length array{} <1", customArray);
            return 0;
        }
        int count = (int) Arrays.stream(customArray.getArray())
                .filter(a -> a < 0)
                .count();
        return count;
    }

    public void replaceElement(CustomArray customArray, int replaceElement) {
        if (customArray.getArray().length < 1) {
            logger.log(Level.ERROR, "Length array{} <1", customArray);
            return;
        }
        int[] result = Arrays.stream(customArray.getArray())
                .map(o -> o < replaceElement ? (o = replaceElement) : o)
                .toArray();
        customArray.setArray(result);

    }

}
