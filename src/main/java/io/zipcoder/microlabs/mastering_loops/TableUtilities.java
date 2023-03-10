package io.zipcoder.microlabs.mastering_loops;

import static java.lang.String.format;

public class TableUtilities {


    public static String getSmallMultiplicationTable() {
        return TableUtilities.getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
//        String table = "";
//        for (int i = 1; i <=10; i++){
//            for (int j = 1; j <= 10; i++){
//                table += format("%5d", i * j +"|");
//            } table += "\n";
//        }
//        return table;
        return TableUtilities.getMultiplicationTable(10);

    }

    public static String getMultiplicationTable(int tableSize) {
//        String table = "";
//        for (int i = 1; i <= tableSize; i++) {
//            for (int j = 1; j <= tableSize; i++) {
//                table = table + String.format("%5d", i * j);
//            }table = table + "\n";
//
//        }
//        return table;
//    }
        String str = "";
        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j<= tableSize; j++) {
                str = str + String.format("%5s", i * j + " |");
            }
            str = str + "\n";
        }
        return str;
    }
}