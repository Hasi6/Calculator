package com.company.v2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class solution {
    public static void main(String[] args) {
        String operation = args[0];
        try {
            List<String> inputString = Files.readAllLines(Paths.get("C:\\Users\\Udith Shalinda\\IdeaProjects\\Calculater\\src\\com\\company\\v2\\numbers.txt"));
            List<Double> inputDouble = new ArrayList<>();
            for (String str : inputString) {
                inputDouble.add(Double.parseDouble(str));
            }
            calculate cal = new calculate(inputDouble);
            if("ADD".equals(operation)){
                cal.add();
            }else if("SUB".equals(operation)){
                cal.sub();
            }else if("DIV".equals(operation)){
                cal.div();
            }else if("MUL".equals(operation)){
                cal.mul();
            }else{
                System.out.println("INVALID INPUT");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class calculate{
    private List<Double> inputDouble;
    calculate(List<Double> inputDouble){
        this.inputDouble = inputDouble;
    }

    void add(){
        System.out.println(inputDouble.get(0)+inputDouble.get(1));
    }
    void sub(){
        System.out.println(inputDouble.get(0)-inputDouble.get(1));
    }
    void div(){
        System.out.println(inputDouble.get(0)/inputDouble.get(1));
    }
    void mul(){
        System.out.println(inputDouble.get(0)*inputDouble.get(1));
    }
}

