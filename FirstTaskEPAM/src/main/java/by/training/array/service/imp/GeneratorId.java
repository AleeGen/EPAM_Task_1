package by.training.array.service.imp;

import by.training.array.service.IdGenerator;


public class GeneratorId implements IdGenerator {
    private static int id = 0;

    public GeneratorId() {

    }

    @Override
    public int generation() {
        return id++;
    }
}
