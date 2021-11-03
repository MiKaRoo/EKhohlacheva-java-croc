
package ru.croc.task8;

import java.io.*;
import java.util.Scanner;

/**
 * путь файла вводить в консоль
 */
public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader N = new BufferedReader(new InputStreamReader(System.in));
        FileReader file = new FileReader (N.readLine());
        Scanner scanner = new Scanner(file);
        int n=0;
        while (scanner.hasNext()) {
            scanner.next();
            n++;
        }
        System.out.println(n);
        scanner.close();
        N.close();
    }
}
