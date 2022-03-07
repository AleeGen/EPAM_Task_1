package by.training.array.warehouse;

import by.training.array.entity.CustomArrayParameters;
import by.training.array.exception.CustomUniversalException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    final static Logger logger = LogManager.getLogger();
    private Map<Integer, CustomArrayParameters> customArrayParametersMap = new HashMap<>();

    private Warehouse() {
    }

    private static class WarehouseSingleton {
        private static final Warehouse INSTANCE = new Warehouse();
    }

    public static Warehouse getInstance() {
        return WarehouseSingleton.INSTANCE;
    }

    public CustomArrayParameters put(Integer id, CustomArrayParameters parameters) {
        CustomArrayParameters lastParameters = customArrayParametersMap.get(id);
        customArrayParametersMap.put(id, parameters);
        return lastParameters;
    }

    public CustomArrayParameters remove(Integer id) {
        CustomArrayParameters removeParameters = customArrayParametersMap.remove(id);
        return removeParameters;
    }

    public CustomArrayParameters get(Integer id) throws CustomUniversalException {
        CustomArrayParameters result = customArrayParametersMap.get(id);
        if (result == null) {
            logger.log(Level.ERROR, "{} element not found", id);
            throw new CustomUniversalException(id + " element not found");
        }
        return result;
    }

    public Map<Integer, CustomArrayParameters> getAll() {
        return Map.copyOf(customArrayParametersMap);
    }

}
