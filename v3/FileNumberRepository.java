package com.company.v3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileNumberRepository implements NumberRepository {
    public List<Double> inputDouble=new ArrayList<>();

    @Override
    public List<Double> read() {
        try {
            List<String> inputString = Files.readAllLines(Paths.get("C:\\Users\\Udith Shalinda\\IdeaProjects\\Calculater\\src\\com\\company\\v2\\numbers.txt"));
            for (String str : inputString) {
                inputDouble.add(Double.parseDouble(str));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

       return inputDouble;
    }
}
