package by.training.array.service;

import by.training.array.entity.CustomArray;
import by.training.array.exception.CustomUniversalException;

public interface ElementSort {
    void bubbleSort(CustomArray customArray);

    void quickSort(CustomArray customArray, int start, int end) throws CustomUniversalException;

    void mergerSort(CustomArray customArray);
}
