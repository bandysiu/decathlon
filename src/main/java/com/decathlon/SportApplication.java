package com.decathlon;

import com.decathlon.fileReader.ReadFile;

import java.io.IOException;


public class SportApplication {
    public static void main(String[] args) throws IOException {

        System.out.println(ReadFile.identifyFile("123.txt"));
    }
}
