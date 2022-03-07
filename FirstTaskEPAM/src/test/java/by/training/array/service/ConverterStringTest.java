package by.training.array.service;

import by.training.array.service.imp.CustomCompareArray;
import by.training.array.util.imp.ParserString;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.testng.Assert.*;

public class ConverterStringTest {
    final static Logger logger = LogManager.getLogger();
    final static String WAY_DATA = "C:\\Users\\user\\IdeaProjects\\EPAM_Courses\\FirstTaskEPAM\\src\\test\\resources\\data\\data.txt";
    final int[][] TRUE_ARRAY = new int[][]{{5, 1, -1, 0, -3}, {4}, {5, 1}, {}, {72, 234}, {}, {}, {8, -123, -2, 5}, {8, 3, 4}, {4, 6, 8}, {4, 5, 254, -5, 25}, {4, 5, 25}};

    @Test
    public void testArrayStringToArrayNumber() throws IOException {
        List<String> collectionData;
        List<int[]> result;
        try {
            collectionData = Files.readAllLines(Path.of(WAY_DATA));
            result = new ParserString().arrayStringToArrayNumber(collectionData);
        } catch (IOException e) {
            logger.log(Level.ERROR, "File not find", e);
            throw e;
        }
        assertTrue(new CustomCompareArray().arrayCompare(TRUE_ARRAY, result), "Fail!");
    }
}
