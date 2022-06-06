package com.decathlon.fileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {

    public static List<String> identifyFile(String filename) throws IOException {

        String[] arrayOfStr = filename.split("\\.", 2);

        if (arrayOfStr[1].matches("txt")){
            return readCsv(filename);
        } else{
            return null;
        }
    }

    private static List<String> readCsv(String filename) throws IOException {

        return Files.readAllLines(new File(filename).toPath(), Charset.defaultCharset() );
    }
}
