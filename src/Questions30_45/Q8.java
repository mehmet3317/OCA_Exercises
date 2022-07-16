package Questions30_45;

public class Q8 {
    public static void main(String[] args) {
      //  System.out.println("Output is: " + 10 != 5);
    }
}

//Binary plus (+) has got higher precedence than != operator. Let us group the expression.
//
//"Output is: " + 10 != 5
//
//= ("Output is: " + 10) != 5
//
//[!= is binary operator, so we have to evaluate the left side first. + operator behaves as concatenation operator.]
//
//= "Output is: 10" != 5
//
//Left side of above expression is String, and right side is int. But String can't be compared to int, hence compilation error.