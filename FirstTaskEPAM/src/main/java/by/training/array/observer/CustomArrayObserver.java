package by.training.array.observer;

import by.training.array.entity.CustomArray;
import by.training.array.exception.CustomUniversalException;


public interface CustomArrayObserver {
    void parametersChanged(CustomArrayEvent event);
}
