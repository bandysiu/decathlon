package com.decathlon;

import com.decathlon.fileReader.ReadFile;
import com.decathlon.sports.Decathlon;

import java.io.IOException;
import java.util.List;
import java.util.Objects;


public class SportApplication {
    public static void main(String[] args) throws IOException {

        List<Decathlon> decathlons = StringToList.stringToDecathlon(ReadFile.identifyFile("123.txt"));

        for (Decathlon d : decathlons) {
            d.calculatePoints();
        }


    }
}
