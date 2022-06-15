package com.company;

class Message {
    String msg = "Happy New Year!";

    public void print() {
        System.out.println(msg);
    }
}

public class Q13 {
    public static void change(Message m) { //Line n5
        m = new Message(); //Line n6
        m.msg = "Happy Holidays!"; //Line n7
    }

    public static void main(String[] args) {
        Message obj = new Message(); //Line n1
        obj.print(); //Line n2
        change(obj); //Line n3
        obj.print(); //Line n4
    }
}
  /*  It is pass-by-reference scheme.

        Initially, msg = "Happy New Year!"

        Call to method change(Message) doesn't modify the msg property of passed object

        rather it creates another Message object and modifies the msg property of new object to "Happy Holidays!"

        So, the instance of Message referred by obj remains unchanged.

        Hence in the output, you get:

        Happy New Year!

        Happy New Year!*/