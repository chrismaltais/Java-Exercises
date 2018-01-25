// Given a time in -hour AM/PM format, convert it to military (-hour) time.


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static String timeConversion(String s) {
        // Complete this function
        String conversion = s.substring(0, 8);          // 00:00:00 
        String suffix = s.substring(8);                 // AM or PM
        String hoursString = conversion.substring(0,2); // 00 (:00:00)
        String remainder = conversion.substring(2);     // :00:00
        int hours = Integer.parseInt(hoursString);      // (int)00 (:00:00)
        if (suffix.equals("AM")) {
            if (hoursString.equals("12")){
                String zeroHours = "00";
                return zeroHours + remainder;
            } else {
                return conversion;
            }
        } else {
            if (hoursString.equals("12")) {
                return conversion;
            } else {
                hours += 12;
                hoursString = Integer.toString(hours);
                return hoursString + remainder;
            } 
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
