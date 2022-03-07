package by.training.array.warehouse.imp;

import by.training.array.entity.CustomArray;
import by.training.array.exception.CustomUniversalException;
import by.training.array.observer.CustomArrayEvent;
import by.training.array.observer.imp.CustomArrayObserverImpl;
import by.training.array.repository.Repository;
import by.training.array.warehouse.Warehouse;
import by.training.array.warehouse.WarehouseFill;
import org.apache.logging.log4j.Level;

import java.util.List;

public class FillWarehouse implements WarehouseFill {

    public FillWarehouse() {

    }

    @Override
    public void fillWarehouse() {
        List<CustomArray> listCustomArray = Repository.getInstance().getAll();
        for (var customArray : listCustomArray) {
            CustomArrayEvent event = new CustomArrayEvent(customArray);
            new CustomArrayObserverImpl().parametersChanged(event);
        }

    }
}
