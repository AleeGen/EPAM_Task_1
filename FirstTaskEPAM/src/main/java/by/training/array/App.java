package by.training.array;

import by.training.array.repository.Repository;
import by.training.array.repository.imp.FillRepository;
import by.training.array.warehouse.Warehouse;
import by.training.array.warehouse.imp.FillWarehouse;

import java.io.IOException;


public class App {
    final static String WAY_DATA = "C:\\Users\\user\\IdeaProjects\\EPAM_Courses\\FirstTaskEPAM\\src\\main\\resources\\data\\data.txt";

    public static void main(String[] args) throws IOException {

        new FillRepository().fillRepository(WAY_DATA);
        for (var array : Repository.getInstance().getAll()) {
            System.out.println(array.getId() + " " + array);
        }
        new FillWarehouse().fillWarehouse();
        for (var parameters : Warehouse.getInstance().getAll().entrySet()) {
            System.out.println(parameters);
        }
    }

}
