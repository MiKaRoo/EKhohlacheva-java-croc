package ru.croc.task2;

import java.util.Scanner;

public class Main {
    static int i;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        float b = a;
        for (i = 0; b > 1024;) {
            b = b /1024;
            i++;
        }

        switch (i) {
            case 1:
                System.out.println(String.format("%.1f",b)+" KB");
                break;
            case 2:
                System.out.println(String.format("%.1f",b)+" MB");
                break;
            case 3:
                System.out.println(String.format("%.1f",b)+" GB");
                break;
            case 4:
                System.out.println(String.format("%.1f",b)+" TB");
                break;
            case 5:
                System.out.println(String.format("%.1f",b)+" PB");
                break;
            default:
                System.out.println(b + "B");
        }


    }

}