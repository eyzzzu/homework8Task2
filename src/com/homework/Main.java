package com.homework;

public class Main {
    /*
    2) Электронные часы показывают время в формате от 00:00 до 23:59.
       Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация для той,
       что справа от двоеточия (например, 02:20, 11:11 или 15:51).
     */

    public static void main(String[] args) {
        int count = 0;
        String format = "%02d";
        StringBuilder strBuild1 = new StringBuilder();
        StringBuilder strBuild2 = new StringBuilder();
        for (int i = 0; i < 24; i++) {

            strBuild1.append(String.format(format, i));
            for (int j = 0; j < 60; j++) {

                strBuild2.append(String.format(format, j)).reverse();

                if (strBuild1.toString().equals(strBuild2.toString())) {
                    count++;
                    System.out.printf("%s:%s\n", strBuild1, strBuild2.reverse());
                }

                strBuild2.delete(0, strBuild2.length());
            }

            strBuild1.delete(0, strBuild1.length());
        }
        System.out.println("Всего симметричных совпадений: " + count);
    }
}

