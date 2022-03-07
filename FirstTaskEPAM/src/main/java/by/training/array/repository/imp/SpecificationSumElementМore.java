package by.training.array.repository.imp;

import by.training.array.entity.CustomArray;
import by.training.array.repository.Specification;


public class SpecificationSumElementМore implements Specification {

    private int sumElement;

    public SpecificationSumElementМore(int sumElement) {
        this.sumElement = sumElement;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        if (customArray.getArray().length < 1) {
            return false;
        }
        int[] array = customArray.getArray();
        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
            sum += array[i];
        }
        boolean result = (sum > sumElement);
        return result;
    }
}
