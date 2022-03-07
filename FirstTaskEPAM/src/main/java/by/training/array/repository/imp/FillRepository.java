package by.training.array.repository.imp;

import by.training.array.entity.CustomArray;
import by.training.array.repository.RepositoryFill;
import by.training.array.repository.Repository;
import by.training.array.service.imp.TakeString;
import by.training.array.util.imp.ParserString;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.List;

public class FillRepository implements RepositoryFill {
    final static Logger logger = LogManager.getLogger();

    public FillRepository() {

    }

    @Override
    public void fillRepository(String path) throws IOException {
        TakeString takeString = new TakeString();
        ParserString parserString = new ParserString();
        List<int[]> readyArray;
        try {
            List<String> notParserList = takeString.FileRead(path);
            readyArray = parserString.arrayStringToArrayNumber(notParserList);
        } catch (IOException e) {
            logger.log(Level.ERROR, path + " - file not found");
            throw e;
        }
        for (var array : readyArray) {
            CustomArray customArray = new CustomArray(array);
            Repository.getInstance().add(customArray);
        }
    }
}
