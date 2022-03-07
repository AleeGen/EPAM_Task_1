package by.training.array.repository.imp;

import by.training.array.entity.CustomArray;
import by.training.array.repository.Specification;

public class SpecificationCountElementМore implements Specification {
    private int countElement;

    public SpecificationCountElementМore(int countElement) {
        this.countElement = countElement;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        int length = customArray.getArray().length;
        boolean result = length > countElement;
        return result;
    }
}
