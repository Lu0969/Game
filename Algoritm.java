package com.company;

public class Algoritm {

    public int[] convert(String s){
        int arr = Integer.parseInt(s);
        int[] arr1 = new int[4];
        for(int i = 3; i>-1; i--){
            arr1[i] = arr%10;
            arr = (int) Math.floor(arr/10);
        }
        return arr1;
    }

    public char[] convert1(String s){
        char[] m = s.toCharArray();
        return m;
    }

    public boolean mistake(String s) {
        boolean k = true;
        String k2 = "вы ввели не 4 цифры";
        String k3 = "вы играете не честно, цифры не должны повторяться";
        String k4 = "буквы это не цифры";

        k = true;
        char[] l = convert1(s);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i != j && l[i] == l[j]) {
                    System.out.println(k3);
                    k = false;
                    return k;
                }
            }
        }
        k = true;
        for (int i = 0; i < 4; i++) {
            if (Character.isDigit(l[i]) == false) {
                System.out.println(k4);
                k = false;
                return k;
            }
        }

        if (s.length() != 4) {
            System.out.println(k2);
            k = false;
            return k;
        }
        return k;
    }

    public int cow(int[] a, int[] rand){
        int cows = 0;
        for (int i =0; i<a.length; i++){
            for(int j =0; j<rand.length; j++){
                if(a[i]==rand[j] && i!=j)
                    cows+=1;
            }
        }
        return cows;
    }

    public int bull(int[] a, int[] rand){
        int bulls = 0;
        for (int i =0; i<a.length; i++){
            for(int j =0; j<rand.length; j++){
                if(a[i]==rand[j] && i==j)
                    bulls+=1;
            }
        }
        return bulls;
    }
}
