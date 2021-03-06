package by.training.array.repository.imp;

import by.training.array.entity.CustomArray;
import by.training.array.repository.Specification;


public class SpecificationAverageElementŠore implements Specification {
    private int averageElement;

    public SpecificationAverageElementŠore(int averageElement) {
        this.averageElement = averageElement;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        if (customArray.getArray().length < 1) {
            return false;
        }
        int[] array = customArray.getArray();
        double sum = array[0];
        for (int i = 1; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / array.length;
        boolean result = average > averageElement;
        return result;
    }
}
