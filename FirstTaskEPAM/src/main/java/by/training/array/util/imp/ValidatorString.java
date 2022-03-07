package by.training.array.util.imp;

import by.training.array.util.StringValidator;

import java.util.regex.Pattern;

public class ValidatorString implements StringValidator {
    final static String REGEX_VALIDATION_STRING = "(\\s*(\\d*)|([-]?\\d+)[,;]?\\s*[-]?)*";

    @Override
    public boolean stringValidation(String str) {
        if (str == null) {
            return false;
        }
        if (str.length() == 0) {
            return true;
        }
        boolean valid = true;
        Pattern patternString = Pattern.compile(REGEX_VALIDATION_STRING);
        if (!patternString.matcher(str).matches()) {
            valid = false;
        }
        return valid;
    }
}
