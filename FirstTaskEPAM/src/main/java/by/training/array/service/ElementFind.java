package by.training.array.service;

import by.training.array.entity.CustomArray;
import by.training.array.exception.CustomUniversalException;

import java.util.OptionalInt;

public interface ElementFind {
    OptionalInt takeMaxElement(CustomArray customArray);

    OptionalInt takeMinElement(CustomArray customArray);

    int takePositiveElements(CustomArray customArray);

    int takeNegativeElements(CustomArray customArray);
}
