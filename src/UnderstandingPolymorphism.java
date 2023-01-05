public class UnderstandingPolymorphism {
}


 class Primate { public boolean hasHair() {
    return true;
} }
 interface HasTail {
    public boolean isTailStriped();
}
 class Lemur extends Primate implements HasTail {
    public boolean isTailStriped() {
    return false; }
    public int age = 10;
    public static void main(String[] args) {
        Lemur lemur = new Lemur(); System.out.println(lemur.age);
        HasTail hasTail = lemur; System.out.println(hasTail.isTailStriped());
      //  Primate primate = lemur; System.out.println(primate.hasHair());
        Primate primate = lemur;
       // Lemur lemur2 = primate; // DOES NOT COMPILE
        Lemur lemur3 = (Lemur)primate; System.out.println(lemur3.age);
    }
}
//class Bird {}
//class Fish extends  Bird {
//    public static void main(String[] args) {
//        Fish fish = new Fish();
//         Bird bird = (Bird)fish; // DOES NOT COMPILE }
//    }
//}






/* Virtual methods
* public class Bird {
public String getName() {
return "Unknown"; }
public void displayInformation() { System.out.println("The bird name is: "+getName());
} }
public class Peacock extends Bird { public String getName() {
return "Peacock"; }
public static void main(String[] args) { Bird bird = new Peacock(); bird.displayInformation();
} }
This code compiles and executes without issue and outputs the following:
The bird name is: Peacock
* */