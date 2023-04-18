package com.ncc.JavaCore.TryCatchvsThrowException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Throws {
    public void readFromFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
