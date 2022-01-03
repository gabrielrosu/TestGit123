package curs6;

import java.sql.SQLOutput;

public class StringComparison {
    public static void main(String[] args) {
        String firstString  = "Java";
        String secondString = "automation";
        String thirdString = "Java";
        String forthString = new String();

        System.out.println("Case ; ==");
        System.out.println(firstString == secondString);
        System.out.println("Case : equals ");
        System.out.println(firstString.equals(secondString));
        System.out.println("------------------------------");
        System.out.println("Case : ==");
        System.out.println(firstString == thirdString);
        System.out.println("Case : equals ");
        System.out.println(firstString.equals(thirdString));
        System.out.println("------------------------------");
        System.out.println("Case :==");
        System.out.println(firstString);
        System.out.println(forthString);
    }
}
