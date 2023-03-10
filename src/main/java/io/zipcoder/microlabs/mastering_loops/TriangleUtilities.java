package io.zipcoder.microlabs.mastering_loops;

import org.codehaus.plexus.util.StringUtils;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String star = "";
        for (int i = 1; i < numberOfRows; i++){
            for (int j = 0; j <i ; j++){
                star+= "*";
            }
            star += "\n";
        }
        return star;
    }

    public static String getRow(int numberOfStars) {
       String star = "";
       for (int i = 0; i < numberOfStars; i++){
           star += "*";
       }
       return star;
    }

    public static String getSmallTriangle() {
       return TriangleUtilities.getTriangle(5);
    }

    public static String getLargeTriangle() {
        return TriangleUtilities.getTriangle(10);
    }

}
