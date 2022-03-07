package by.training.array.repository.imp;

import by.training.array.entity.CustomArray;
import by.training.array.repository.Specification;


public class SpecificationMinElementМore implements Specification {

    private int minElement;

    public SpecificationMinElementМore(int maxElement) {
        this.minElement = maxElement;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        if (customArray.getArray().length < 1) {
            return false;
        }
        int[] array = customArray.getArray();
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > min) {
                min = array[i];
            }
        }
        boolean result = (min > minElement);
        return result;
    }
}
