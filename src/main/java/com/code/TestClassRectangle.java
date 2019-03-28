package com.code;

import java.util.Scanner;

public class TestClassRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Enter width for rectangle
        System.out.println("Enter width for rectangle: ");
        double width = scanner.nextDouble();
        //Enter height for rectangle
        System.out.println("Enter height for rectangle: ");
        double height = scanner.nextDouble();

        ClassRectangle rectangle = new ClassRectangle(width,height);
        //show rectangle
        System.out.println(rectangle.display());
        System.out.println("Perimeter of Rectangle is: "+ rectangle.getPerimeter());
        System.out.println("Area of Rectangle is: "+ rectangle.getArea());
    }
}
