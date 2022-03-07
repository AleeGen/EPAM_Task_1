package by.training.array.service.imp;

import by.training.array.exception.CustomUniversalException;
import by.training.array.service.StringTake;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TakeString implements StringTake {
    static final Logger logger = LogManager.getLogger();

    @Override
    public List<String> FileRead(String way) throws IOException {
        List<String> collections = new ArrayList<>();
        try (BufferedReader bufferedReader = Files.newBufferedReader(Path.of(way));) {
            while (bufferedReader.ready()) {
                collections.add(bufferedReader.readLine());
            }
        } catch (IOException e) {
            logger.log(Level.ERROR, "File not found", e);
            throw e;
        }
        return collections;
    }
}
