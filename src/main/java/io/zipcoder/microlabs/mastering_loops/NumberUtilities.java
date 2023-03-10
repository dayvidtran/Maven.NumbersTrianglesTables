package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {



    public static String getEvenNumbers(int start, int stop) {
        String even = "";
        for (int i = start; i < stop ; i++){
            if (i%2 ==0)
                even+=Integer.toString(i);
        }
        return even;

    }

    public static String getOddNumbers(int start, int stop) {
        String odd = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                odd += Integer.toString(i);
            }
            ;
        }return odd;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        return NumberUtilities.getExponentiations(start, stop, step, 2);
    }

    public static String getRange(int stop) {
        return NumberUtilities.getRange(0,stop , 1);

    }

    public static String getRange(int start, int stop) {
        return NumberUtilities.getRange(start, stop, 1);

    }

    public static String getRange(int start, int stop, int step) {
        String s3 = "";
        for ( int i = start; i < stop; i += step){
            s3 += i;
        } return s3;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        int expt;
        String exp = "";
        for (int i = start; i < stop; i+=step){
            expt = (int) Math.pow(i, exponent);
            exp +=Integer.toString(expt);
        }
        return exp;
    }


    }

