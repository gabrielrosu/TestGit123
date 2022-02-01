package curs10;

import org.json.simple.parser.ParseException;

public class TestJsonProcessor {

    public static void main(String[] args) throws ParseException, java.text.ParseException {

        JsonPRocessor jsonPorcessor = new JsonPRocessor();

        //	jsonPorcessor.writeJsonFile();

        jsonPorcessor.readJsonFile();

    }

}