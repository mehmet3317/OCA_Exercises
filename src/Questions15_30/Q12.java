package Questions15_30;

public class Q12{
    public static void main(String[] args) {
        String fruit = "mango";
        switch (fruit) {
            default:
                System.out.println("ANY FRUIT WILL DO");
            case "Apple":
                System.out.println("APPLE");
            case "Mango":
                System.out.println("MANGO");
            case "Banana":
                System.out.println("BANANA");
                break;
        }
    }
}
//"mango" is different from "Mango", so there is no matching case available. default block is executed, "ANY FRUIT WILL DO" is printed on to the screen.
//
//No break statement inside default, hence control enters in fall-through and executes remaining blocks until the break; is found or switch block ends.
//
//So in this case, it prints APPLE, MANGO, BANANA one after another and break; statement takes control out of switch block. main method ends and program terminates successfully.