package by.training.array.repository.imp;

import by.training.array.entity.CustomArray;
import by.training.array.repository.Specification;

public class SpecificationIdBetween implements Specification {
    private int from;
    private int before;

    public SpecificationIdBetween(int from, int before) {
        this.from = from;
        this.before = before;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        boolean result = (customArray.getId() > from && customArray.getId() < before);
        return result;
    }
}
