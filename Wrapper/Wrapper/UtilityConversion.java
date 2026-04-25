package Wrapper;

import java.util.Scanner;

public class UtilityConversion {
    public static int safeParseInt(String st) {
        try {
            System.out.println(Integer.parseInt(st));
        } catch (NumberFormatException e) {
            System.out.println(e);
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        safeParseInt("123");
        safeParseInt("abc");
        safeParseInt("76.5");

    }
}