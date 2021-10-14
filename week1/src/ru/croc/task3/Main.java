package ru.croc.task3;

import java.util.Scanner;

public class Main {
    static int tmp1 =0;
    static int tmp2 =0;
    public static void main(String[] args) {

        int a = 0;
        int min =0;
        int max =0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        a = scanner.nextInt();

        int [] arr = new int[a];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);

        }
        System.out.println();


        System.out.println("MAX = " + getMax(arr));
        System.out.println("MIN = " + getMin(arr));

        int c = getMax(arr);
        int z = getMin(arr);
        arr[tmp2] = arr[0];
        arr[tmp1]= arr[a-1];
        arr[0] = z;
        arr[a-1] = c;


        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }


    public static int getMin(int[] arr){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
                tmp2 = i;
            }
        }
        return min;
    }

    public static int getMax(int[] arr){
        int max = arr[0];
        for(int i=1;i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
                tmp1 = i;
            }
        }
        return max;
    }

}