package by.training.array.service;

import by.training.array.entity.CustomArray;


import java.util.OptionalDouble;
import java.util.OptionalInt;

public interface ElementCalculator {

    OptionalInt takeSumElements(CustomArray customArray);

    OptionalDouble takeAverageElement(CustomArray customArray);

}
