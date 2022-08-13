package Questions45_60;

public class Q3{
    public static void main(String[] args){
        for (int i = 0; i < args.length; i++)
            System.out.print(i == 0 ? args[i] :" " + args[i]);
    } }

//Here, we are passing 3 arguments. Therefore, args.length is 3 and the for
// loop will run 3 times. For the first iteration, i is 0 and so the first operand of the ternary operator
// (?) will be returned, which is args[i]. For the next two iterations, " "+
// args[i] will be returned. Hence, the program will print three strings: "good", " bye", and " friend!" on the same line.