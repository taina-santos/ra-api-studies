package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<String> validUserName = new ArrayList<>();
    private final static String PATTERN_ALPHANUMERIC = "^[a-zA-Z0-9]*$";

    public static boolean duplicates(final int[] zipcode){
        List<Integer> getNonDuplicate = new ArrayList<>();
        for (int i : zipcode) {
            if (!getNonDuplicate.contains(i)) {
                getNonDuplicate.add(i);
            } else {
                return true;
            }
        }
        return false;
    }

    private static void printEvenNumbers(){
        for (int i = 1; i <= 10; i++)
            if (i%2 == 0)
                System.out.println("O número " + i + " é par");

    }

    private static void reverseString (String str){
        StringBuilder reverseStr = new StringBuilder();
        for(int i = str.length()-1; i >= 0; i--)
            reverseStr.append(str.charAt(i));
        System.out.println(reverseStr);
    }

    private static void saveValidUsername(String username){
        if(username.matches(PATTERN_ALPHANUMERIC)) {
            if (!validUserName.contains(username)) {
                validUserName.add(username);
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        } else {
            System.out.println("Invalid");
        }

    }

    private static void countOccurrences(int[] numberList, int num){

    }

    private static int findHighestNumber(final int[] numberList){
        int highestNumber = 0;
        for (int i : numberList){
            if (i > highestNumber)
                highestNumber = i;
        }
        return highestNumber;
    }

    public static void main(String[] args) {
        String strToReverse = "reverse";
        int[] zipcodelist = {1, 2, 4, 10, 14, 9, 14, 18, 15, 5, 8, 7, 6, 3, 2, 9, 1};
        if (duplicates(zipcodelist))
            System.out.println("A lista contém números duplicados");
        else
            System.out.println("A lista não contém duplicados");

        printEvenNumbers();

        reverseString(strToReverse);

        saveValidUsername("username");
        saveValidUsername("username");
        saveValidUsername("us3rn\\@me");
        saveValidUsername("us3rnam3");
        saveValidUsername("second_username");
        saveValidUsername("2username");
        saveValidUsername("segundousername");
        System.out.println(validUserName);

        System.out.println("O maior número desse array é " + findHighestNumber(zipcodelist));
    }

}