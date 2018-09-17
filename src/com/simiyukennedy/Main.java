package com.simiyukennedy;

public class Main {

    public static void main(String[] args) {
        // declare calc variable
        double input1 = 20.0d;
        double input2 = 30.0d;
        double result;
        char opCode = 'a';

        if (opCode == 'a')
            result = input1 + input2;
        else if (opCode == 's')
            result = input1 - input2;
        else if (opCode == 'm')
            result = input1 * input2;
        else if (opCode == 'd') {
            result = input1 != 0.0d ? input1 / input2 : 0.0d;
        } else {
            System.out.println("Error - invalid opCode");
            result = 0.0d;

        }
        System.out.println(result);
    }
}
