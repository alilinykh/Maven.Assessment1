package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase() ;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String result = "";
        StringBuilder stringBuilder = new StringBuilder(str);
        result = stringBuilder.reverse().toString();
        result = result.substring(0,1).toUpperCase() + result.substring(1).toLowerCase();

        return result;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1, str.length()-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String [] arrStr = str.split("");
        String temp;
        String result;
        for (int i = 0; i < arrStr.length ; i++) {
            if (arrStr[i].equals(arrStr[i].toLowerCase())) {
                temp = arrStr[i].toUpperCase();
                arrStr[i] = temp;
            }
            else {
                temp = arrStr[i].toLowerCase();
                arrStr[i] = temp;
            }
        }
        result = String.join("",arrStr);
        return result;
    }
}
