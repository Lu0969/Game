package com.company;
import java.util.Random;

public class RandomNumber {
    public int[] random() {
        int i, j;
        Random rand = new Random();
        int[] array = new int[4];

        for (i = 0; i < array.length; ) {
            int randomNumber = rand.nextInt(9);
            for (j = 0; j < i; j++) {
                if (array[j] == randomNumber) {
                    break;
                }
            }
            if (j == i) {
                array[i] = randomNumber;
                i++;
            }
        }
        return array;
    }
}
