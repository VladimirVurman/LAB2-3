package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Keeping quadrangleList = new Keeping();
        System.out.print("Enter count quadrangles(N): ");
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.print("Enter point1X: ");
            int point1X = in.nextInt();
            System.out.print("Enter point1Y: ");
            int point1Y = in.nextInt();
            System.out.print("Enter point2X: ");
            int point2X = in.nextInt();
            System.out.print("Enter point2Y: ");
            int point2Y = in.nextInt();
            System.out.print("Enter point3X: ");
            int point3X = in.nextInt();
            System.out.print("Enter point3Y: ");
            int point3Y = in.nextInt();
            System.out.print("Enter point4X: ");
            int point4X = in.nextInt();
            System.out.print("Enter point4Y: ");
            int point4Y = in.nextInt();
            Quadrangle quadrangleTest= new Quadrangle(point1X, point1Y, point2X, point2Y, point3X, point3Y, point4X, point4Y);
            quadrangleList.addQuadrangle(quadrangleTest);

        }
        quadrangleList.getQuadrangleMinArea();


        Keeping trapezoidList = new Keeping();
        System.out.print("Enter count trapezoid(M): ");
        int M = in.nextInt();
        for (int i = 0; i < M; i++) {
            System.out.print("Enter point1X: ");
            int point1X = in.nextInt();
            System.out.print("Enter point1Y: ");
            int point1Y = in.nextInt();
            System.out.print("Enter point2X: ");
            int point2X = in.nextInt();
            System.out.print("Enter point2Y: ");
            int point2Y = in.nextInt();
            System.out.print("Enter point3X: ");
            int point3X = in.nextInt();
            System.out.print("Enter point3Y: ");
            int point3Y = in.nextInt();
            System.out.print("Enter point4X: ");
            int point4X = in.nextInt();
            System.out.print("Enter point4Y: ");
            int point4Y = in.nextInt();
            Trapezoid trapezoidTest= new Trapezoid(point1X, point1Y, point2X, point2Y, point3X, point3Y, point4X, point4Y);
            trapezoidList.addQuadrangle(trapezoidTest);
        }
        trapezoidList.getTrapezoidMaxLine();

    }
}

