package com.decathlon;

import com.decathlon.sports.Decathlon;

import java.util.ArrayList;
import java.util.List;

public class StringToList {

    public static List<Decathlon> stringToDecathlon(List<String> data) {

        List<Decathlon> list = new ArrayList<>();

        for (String datum : data) {
            String[] attributes = datum.split(";", 11);

            Decathlon decathlon = Decathlon.createDecathlon(attributes);

            list.add(decathlon);
        }

        return list;
    }
}
