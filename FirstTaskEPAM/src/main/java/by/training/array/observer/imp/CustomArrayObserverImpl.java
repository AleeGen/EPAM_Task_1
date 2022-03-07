package by.training.array.observer.imp;

import by.training.array.entity.CustomArray;
import by.training.array.entity.CustomArrayParameters;
import by.training.array.warehouse.Warehouse;
import by.training.array.observer.CustomArrayEvent;
import by.training.array.observer.CustomArrayObserver;
import by.training.array.service.imp.FindElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public class CustomArrayObserverImpl implements CustomArrayObserver {

    @Override
    public void parametersChanged(CustomArrayEvent event) {
        CustomArray customArrayChanged = event.getSource();
        Integer id = customArrayChanged.getId();
        CustomArrayParameters parameters = new CustomArrayParameters();
        OptionalInt max = new FindElement().takeMaxElement(customArrayChanged);
        OptionalInt min = new FindElement().takeMinElement(customArrayChanged);
        OptionalInt sum = new FindElement().takeSumElements(customArrayChanged);
        OptionalDouble average = new FindElement().takeAverageElement(customArrayChanged);
        parameters.setMaxElement(max);
        parameters.setMinElement(min);
        parameters.setSumElement(sum);
        parameters.setAverageElement(average);
        Warehouse.getInstance().put(id, parameters);
    }
}
