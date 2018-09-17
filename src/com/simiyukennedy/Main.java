package com.simiyukennedy;

public class Main {

    public static void main(String[] args) {
        // declare calc variable
        // an array of variables refactoring
        double [] leftVals = {100.0d, 200.0d, 240.0d, 456.0d};
        double [] rightVals = {238.0d, 365.0d, 173.0d, 296.0d};

        char [] opCodes = { 'a', 's', 'm', 'd'};
        double [] results = new double[opCodes.length];

        //double input1 = 20.0d;
        //double input2 = 30.0d;
        //double result;
        //char opCode = 'a';
        for(int i = 0; i < opCodes.length; i++) {
            switch (opCodes[i]) {
                case 'a':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case 's':
                    results[i] = leftVals[i] - rightVals[i];
                    break;
                case 'm':
                    results[i] = leftVals[i] * rightVals[i];
                    break;
                case 'd':
                    results[i] = leftVals[i] != 0.0d ? leftVals[i] / rightVals[i] : 0.0d;
                    break;
                default:
                    System.out.println("Error - invalid opCode");
                    results[i] = 0.0d;
                    break;
            }
        }
        for(double theResult: results){
            System.out.println("result =");
            System.out.println(theResult);
        }

    }
}
