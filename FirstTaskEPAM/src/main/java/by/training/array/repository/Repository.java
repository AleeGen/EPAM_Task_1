package by.training.array.repository;

import by.training.array.entity.CustomArray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Repository {
    private List<CustomArray> customArrays = new ArrayList<>();

    private Repository() {
    }

    private static class RepositorySingleton {
        private static final Repository INSTANCE = new Repository();
    }

    public static Repository getInstance() {
        return RepositorySingleton.INSTANCE;
    }

    public boolean add(CustomArray customArray) {
        return this.customArrays.add(customArray);
    }

    public boolean remove(CustomArray customArray) {
        return this.customArrays.remove(customArray);
    }

    public boolean addAll(Collection<? extends CustomArray> customArraysList) {
        return this.customArrays.addAll(customArraysList);
    }

    public boolean removeAll(Collection<?> customArraysList) {
        return this.customArrays.removeAll(customArraysList);
    }

    public CustomArray get(int index) {
        return customArrays.get(index);
    }

    public List<CustomArray> getAll() {
        return customArrays.stream().toList();
    }

    public CustomArray set(int index, CustomArray customArray) {
        return customArrays.set(index, customArray);
    }

    public List<CustomArray> query(Specification specification) {
        List<CustomArray> result = customArrays.stream().filter(specification::specify).toList();
        return result;
    }

    public void sort(Comparator<CustomArray> comparator) {
        customArrays.sort(comparator);
    }
}
