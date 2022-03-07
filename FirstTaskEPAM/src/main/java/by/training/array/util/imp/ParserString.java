package by.training.array.util.imp;


import by.training.array.util.StringParser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParserString implements StringParser {
    final static String REGEX_SPLIT = "[^-?\\d+]";
    final static String REGEX_NUMBER = "^-?\\d+$";

    @Override
    public List<int[]> arrayStringToArrayNumber(List<String> listString) {
        if (listString.isEmpty()) {
            return new ArrayList<>();
        }
        List<int[]> result = new ArrayList<>();

        for (var str : listString) {
            if (new ValidatorString().stringValidation(str)) {
                int[] array = Arrays.stream(stringToArrayNumber(str)).toArray();
                result.add(array);
            }
        }
        return result;
    }

    private int[] stringToArrayNumber(String string) {
        int[] numbers = Arrays.stream(string.split(REGEX_SPLIT, -1))
                .filter(s -> s.matches(REGEX_NUMBER))
                .mapToInt(Integer::parseInt)
                .toArray();
        return numbers;
    }

}