package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int result = 0;
        int counter = 0;
        int ending = 0;

        if (k == j) {
            result = k/j;
        }
        else if (k < j) {
            result = k;
        }
        else {
            while (k > 0) {
                k -=j;
                counter++;
            }
        }

        return result;
    }
}
