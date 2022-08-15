package Questions45_60;

public class Q4 {
    public static void testInts(Integer obj, int var){
        obj = var++;
        obj++; }
    public static void main(String[] args) {
        Integer val1 = new Integer(5);
        int val2 = 9;
        testInts(val1++, ++val2); System.out.println(val1+" "+val2);
    } }

//There are multiple concepts at play here:
//1. All the wrapper objects are immutable. So when you do obj++, what actually happens is something like this:
//obj = new Integer( obj.intValue() + 1);