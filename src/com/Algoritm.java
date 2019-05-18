package com.company;

public class Algoritm {

    public int[] convert(String s){         //конфертер введенного числа
        int arr = Integer.parseInt(s);      //в массив интовчких чисел
        int[] arr1 = new int[4];            //используется в классе Game
        for(int i = 3; i>-1; i--){
            arr1[i] = arr%10;
            arr = (int) Math.floor(arr/10);
        }
        return arr1;
    }

    public char[] convert1(String s){      //конвертер введенного числа
        char[] m = s.toCharArray();        //в массив символов
        return m;                          //используется для проверки ошибок
    }

    public boolean mistake(String s) {   //проверка числа на ошибки
        boolean k;
        String k2 = "Вы ввели не 4 цифры";
        String k3 = "Вы играете не честно, цифры не должны повторяться";
        String k4 = "Буквы это не цифры";

        k = true;
        char[] l = convert1(s);    //конвертируем число в массив символов
        if (l.length != 4) {       //проверяем введенное число на количество символов
            System.out.println(k2);  // если количество !=4, то k=false
            k = false;
            return k;
        }

        for (int i = 0; i < 4; i++) {      //проверка числа на повторения символов в нем
            for (int j = 0; j < 4; j++) {   //если какие-то символы повторяется
                if (i != j && l[i] == l[j]) {  //то k=false
                    System.out.println(k3);
                    k = false;
                    return k;
                }
            }
        }

        for (int i = 0; i < 4; i++) {            //проверка числа на наличие букв
            if (Character.isDigit(l[i]) == false) {   //если есть буквы в введенном числе
                System.out.println(k4);                    // то k=false
                k = false;
                return k;
            }
        }
        return k; //если введнное число прошло все проверки, то k=true
    }

    public int cow(int[] a, int[] rand){          //считаем количество коров в введенном числе
        int cows = 0;
        for (int i =0; i<a.length; i++){
            for(int j =0; j<rand.length; j++){
                if(a[i]==rand[j] && i!=j)
                    cows+=1;
            }
        }
        return cows;
    }

    public int bull(int[] a, int[] rand){        //считает количество быков в веденном числе
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
