package by.training.array.service.imp;


import by.training.array.service.ArrayOfArraysCompare;

import java.util.ArrayList;
import java.util.List;

public class CustomCompareArray implements ArrayOfArraysCompare {
    @Override
    public boolean arrayCompare(int[][] array1, int[][] array2) {

        if (array1 == null ^ array2 == null) {
            return false;
        }
        if (array1 == array2) {
            return true;
        }
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i].length != array2[i].length) {
                return false;
            }
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j] != array2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean arrayCompare(int[][] array1, List<int[]> array2) {

        if (array1 == null ^ array2 == null) {
            return false;
        }
        if (array1.length != array2.size()) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i].length != array2.get(i).length) {
                return false;
            }
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j] != array2.get(i)[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
