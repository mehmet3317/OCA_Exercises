package Questions30_45;

public class Q1 {
    char var1;
    double var2;
    float var3;

    public static void main(String[] args) {
        Q1 obj = new Q1();
        System.out.println(">" + obj.var1);
        System.out.println(">" + obj.var2);
        System.out.println(">" + obj.var3);
    }
}

//Primitive type instance variables are initialized to respective zeros (byte: 0, short: 0, int: 0, long: 0L, float: 0.0f, double: 0.0, boolean: false, char: \u0000).
//
//When printed on the console; byte, short, int & long prints 0, float & double print 0.0, boolean prints false and char prints nothing or non-printable character (whitespace).
//
//Reference type instance variables are initialized to null.