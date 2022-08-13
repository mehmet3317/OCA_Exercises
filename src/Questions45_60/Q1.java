package Questions45_60;

public class Q1 {
    private int myValue = 0;
    public void showOne(int myValue){ myValue = myValue;
    }
    public void showTwo(int myValue){ this.myValue = myValue;
    }
    public static void main(String[] args) {
        Q1 ct = new Q1(); ct.showTwo(200); System.out.println(ct.myValue); ct.showOne(100); System.out.println(ct.myValue);
    } }

//when you do : myValue = myValue; you are actually assigning the value contained i
// n method parameter myValue to itself. You are not changing the member field myValue.
// Hence, when you do System.out.println(ct.myValue); in the next line, it still prints 200.