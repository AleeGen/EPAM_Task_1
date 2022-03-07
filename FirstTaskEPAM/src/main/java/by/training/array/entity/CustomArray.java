package by.training.array.entity;


import by.training.array.observer.CustomArrayEvent;
import by.training.array.observer.CustomArrayObservable;
import by.training.array.observer.imp.CustomArrayObserverImpl;
import by.training.array.service.imp.GeneratorId;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomArray implements CustomArrayObservable<CustomArrayObserverImpl> {

    private int id;
    private int[] array;
    private List<CustomArrayObserverImpl> observerList = new ArrayList<>();

    public CustomArray() {
        array = new int[]{};
        id = new GeneratorId().generation();
    }

    public CustomArray(int... array) {
        this.array = array;
        id = new GeneratorId().generation();
    }

    public void setArray(int... array) {
        this.array = array;
        notifyObservers();
    }

    public int[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }
        if (!(obj instanceof CustomArray)) {
            return false;
        }

        CustomArray customArray = (CustomArray) obj;
        if (customArray.getArray() == null) {
            return array == null;
        }
        return Arrays.equals(array, customArray.getArray());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return Arrays.toString(this.array);
    }

    @Override
    public void attach(CustomArrayObserverImpl observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(CustomArrayObserverImpl observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        CustomArrayEvent event = new CustomArrayEvent(this);
        if (!observerList.isEmpty()) {
            for (var obs : observerList) {
                obs.parametersChanged(event);
            }
        }
    }
}
