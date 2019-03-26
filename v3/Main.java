package com.company.v3;

import com.company.v3.operations.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String operation = null;
        List<Double> inputDouble = new ArrayList<>();

        Input inputinterface = new CMDinput(args);
        operation = inputinterface.read();

        NumberRepository number = new FileNumberRepository();
        inputDouble = number.read();

        Operations op = null;

        if("ADD".equals(operation)){
             op = new AddOperation(inputDouble.get(0),inputDouble.get(1));
        }else if("SUB".equals(operation)){
            op = new SubOperation(inputDouble.get(0),inputDouble.get(1));
        }else if("DIV".equals(operation)){
            op = new DivOperation(inputDouble.get(0),inputDouble.get(1));
        }else if("MUL".equals(operation)){
            op = new MulOperation(inputDouble.get(0),inputDouble.get(1));
        }else{
            System.out.println("INVALID INPUT");
        }

        Output output = new FinalResult();
        output.printoutput("Result is :"+op.perform());

    }
}
