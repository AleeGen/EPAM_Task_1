package by.training.array.repository.imp;

import by.training.array.entity.CustomArray;
import by.training.array.repository.Specification;

public class SpecificationCountElementŠore implements Specification {
    private int countElement;

    public SpecificationCountElementŠore(int countElement) {
        this.countElement = countElement;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        int length = customArray.getArray().length;
        boolean result = length > countElement;
        return result;
    }
}
