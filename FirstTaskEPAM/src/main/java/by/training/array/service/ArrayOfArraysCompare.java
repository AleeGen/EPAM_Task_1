package by.training.array.service;


import java.util.ArrayList;
import java.util.List;

public interface ArrayOfArraysCompare {
    boolean arrayCompare(int[][] array1, int[][] array2);

    boolean arrayCompare(int[][] array1, List<int[]> array2);
}
