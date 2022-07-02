package Questions15_30;

public class Q13 {
}
//package com.udayan.oca;
//
//public class A {
//     public void print() {
//         System.out.println("A");
//     }
//}
//
//
////B.java
//package com.udayan.oca;
//
//public class B extends A {
//     public void print() {
//         System.out.println("B");
//     }
//}
//
//
////Test.java
//package com.udayan.oca.test;
//
//import com.udayan.oca.*;
//
//public class Test {
//     public static void main(String[] args) {
//         A obj1 = new A();
//         B obj2 = (B)obj1;
//         obj2.print();
//     }
//}


//A obj1 = new A(); => obj1 refers to an instance of class A.
//
//B obj2 = (B)obj1; => obj1 is of type A and it is assigned to obj2 (B type),
// hence explicit casting is necessary. obj1 refers to an instance of class A,
// so at runtime obj2 will also refer to an instance of class A. sub type can't refer to an object of super type
// so at runtime B obj2 = (B)obj1; will throw ClassCastException.