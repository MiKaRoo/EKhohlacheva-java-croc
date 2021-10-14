package ru.croc.task1;

import java.util.Scanner;

public class Main {

    static class Point {
        double x;
        double y;
    }

    public static void main(String[] args) {

        double s;

        Point a = new Point();
        a.x = 0.0;
        a.y = 0.0;

        Point b = new Point();
        b.x = 0.0;
        b.y = 0.0;

        Point c = new Point();
        c.x = 0.0;
        c.y = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координату х вершины №1:");
        a.x = scanner.nextDouble();
        System.out.println("Введите координату y вершины №1:");
        a.y = scanner.nextDouble();
        System.out.println("Введите координату х вершины №2:");
        b.x = scanner.nextDouble();
        System.out.println("Введите координату y вершины №2:");
        b.y = scanner.nextDouble();
        System.out.println("Введите координату х вершины №3:");
        c.x = scanner.nextDouble();
        System.out.println("Введите координату y вершины №3:");
        c.y = scanner.nextDouble();

        s = 0.5*Math.abs(a.x*(b.y - c.y) + b.x*(c.y-a.y) + c.x*(a.y-b.y));
        System.out.println("Площадь треугольника "+s);


    }
}
