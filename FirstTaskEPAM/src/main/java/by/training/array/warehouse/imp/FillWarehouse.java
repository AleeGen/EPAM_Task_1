package by.training.array.warehouse.imp;

import by.training.array.entity.CustomArray;
import by.training.array.observer.imp.CustomArrayObserverImpl;
import by.training.array.repository.Repository;
import by.training.array.warehouse.WarehouseFill;

import java.util.List;

public class FillWarehouse implements WarehouseFill {

    public FillWarehouse() {

    }

    @Override
    public void fillWarehouse() {
        List<CustomArray> listCustomArray = Repository.getInstance().getAll();
        for (var customArray : listCustomArray) {
            CustomArrayObserverImpl observer = new CustomArrayObserverImpl();
            customArray.attach(observer);
            customArray.notifyObservers();
        }
    }
}