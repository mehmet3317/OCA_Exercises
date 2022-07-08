package Questions30_45;

public class Q2{
    public static void main(String[] args) {
        String str = "java";
        StringBuilder sb = new StringBuilder("java");

        System.out.println(str.equals(sb) + ":" + sb.equals(str));
    }
}
//equals method declared in Object class has the declaration: public boolean equals(Object).
// Generally, equals method is used to compare different instances of same class but if you pass any other object,
// there is no compilation error. Parameter type is Object so it can accept any Java object.
//
//
//
//str.equals(sb) => String class overrides equals(Object) method but as "sb" is of StringBuilder type so this returns false.
//
//
//
//StringBuilder class doesn't override equals(Object) method. So Object version is invoked which uses == operator,
// hence sb.equals(str) returns false as well.
//
//
//
//false:false is printed on to the console.