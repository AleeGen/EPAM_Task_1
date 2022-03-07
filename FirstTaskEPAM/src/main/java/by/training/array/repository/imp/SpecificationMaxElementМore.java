package by.training.array.repository.imp;

import by.training.array.entity.CustomArray;
import by.training.array.repository.Specification;


public class SpecificationMaxElementМore implements Specification {

    private int maxElement;

    public SpecificationMaxElementМore(int maxElement) {
        this.maxElement = maxElement;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        if (customArray.getArray().length < 1) {
            return false;
        }
        int[] array = customArray.getArray();
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        boolean result = (max > maxElement);
        return result;
    }

}
