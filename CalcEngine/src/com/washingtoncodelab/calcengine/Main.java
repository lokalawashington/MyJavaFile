package com.washingtoncodelab.calcengine;

public class Main {

    public static void main(String[] args) {


        //second calcengine program
       Double[] leftval  = {100.0d,25.0d,22.0d,34.0d};
       Double[] rightval = {10.0d,17.0d,70.0d,40.0d};
       char[] opcode = {'a','s','d','m'};
       double[] result = new double[opcode.length];

       for(int i=0;i\
        \\opcode.length;i++) {
           if (opcode[i] == 'a'){
               result[1] = leftval[i] + rightval[i];}
           else if (opcode[i] == 's')
               result[1] = leftval[i] - rightval[i];
           else if (opcode[i] == 'm')
               result[1] = leftval[i] * rightval[i];
           else if (opcode[i] == 'd') {
               result[1] = leftval[i] != 0.0d ? leftval[i] / rightval[i] : 0.0d;
           } else {
               System.out.println("Error - invalid opcode");
               result[1] = 0.0d;
           }
       }
           for (double theresult :result) {
               System.out.println(theresult);
           }
       }






        //first calcengine program
       /* double val1 = 100.0d;
        double val2 = 50.0d;
        double result;
        char opCode = 's';

        if (opCode  == 'a')
            result = val1 + val2;
         else if (opCode == 's')
             result = val1 - val2;
         else if(opCode == 'm')
             result = val1 * val2;
         else if (opCode == 'd') {
            result = val2 != 0.0d ? val1 / val2 : 0.0d;
            *//* if (val2 != 0.0d)
                 result = val1 / val2;
             else
                 result = 0.0d;*//*
        }
         else {
            System.out.println("Error - invalid opcode");
            result = 0.0d;
        }

         System.out.println(result);*/
    }
