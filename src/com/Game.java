package com.company;
import java.util.Scanner;

public class Game {
    public void rule(){ //правила игры
        System.out.print("Добро пожаловать в игру 'Быки и коровы' или '4 быка'!"+"\n" +
                "Правила очень просты:" +"\n" +
                "Компьютер загадал четырехзначное число без повторяющихся цифр." +"\n" +
                "Ваша задача: угадать это число за минимальное количество ходов." +"\n" +
                "Когда вы делаеете ход, компьютер говорит вам сколько 'быков' и 'коров' в вашем варианте." +"\n" +
                "Цифры вашего числа не должны повторятся, потому что это не честно." + "\n" +
                "Количество коров указывает число цифр присутствующих в загадонном числе, но стаящих на других местах," +"\n" +
                "а количество быков указывает на число угаданных цифр стоящих на своих местах" +"\n" +
                "Если все понятно, тогда начинаем(введите число и нажмите Enter). " +"\n\n");
    }

    public void game() {                         //основная часть
        Scanner in = new Scanner(System.in);      //метод всей игры
        Algoritm alg = new Algoritm();
        RandomNumber rand = new RandomNumber();
        int[] arr = rand.random();
        int i = 1;
        while(true) {
            System.out.print("| "+i+" | ");
            String s = in.nextLine();
            boolean k = alg.mistake(s);
            if(k) {
                int[] arr1 = alg.convert(s);
                int cow = alg.cow(arr1, arr);
                int bull = alg.bull(arr1, arr);
                System.out.println(cow + " cow and " + bull + " bull");
                if (bull == 4)
                    break;
                i += 1;
            }
        }
        System.out.println("Поздравляем, вы угадали!!!\nВы потратили "+ i + " ходов");
    }
}
