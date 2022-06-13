package com.company;

class Point {
    int x;
    int y;
    void assign(int x, int y) {
        x = this.x;
        this.y = y;
    }

    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}

public class Q7 {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 10;
        p1.y = 20;
        Point p2 = new Point();
        p2.assign(p1.x, p1.y);
        System.out.println(p1.toString() + ";" + p2.toString());
    }
}
/*

p1.x = 10; means replace 0 with 10 in p1.x,

        p1.y = 20; means replace 0 with 20 in p1.y,



        Point p2 = new Point(); means p2.x = 0 and p2.y = 0 as instance variable are initialized to respective zeros.

        p2.assign(p1.x, p1.y); invokes the assign method, parameter variable x = 10 and y = 20.*/
