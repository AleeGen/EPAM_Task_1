package by.training.array.repository;

import by.training.array.entity.CustomArray;
import by.training.array.exception.CustomUniversalException;

public interface Specification {
    boolean specify(CustomArray customArray);
}
