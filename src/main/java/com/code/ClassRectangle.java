package com.code;

public class ClassRectangle {
    double width, height;
    //creat contructors
    public ClassRectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    //method
    public double getArea(){
        return this.width * this.height;
    }

    public double getPerimeter(){
        return (this.width + this.height) * 2;
    }

    public String display(){
        return "Rectangle has width is: "+ this.width + ", height is: "+ this.height;
    }

}
