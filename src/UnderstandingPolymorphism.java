public class UnderstandingPolymorphism {
}
class Bird {}
class Fish extends  Bird {
    public static void main(String[] args) {
        Fish fish = new Fish();
         Bird bird = (Bird)fish; // DOES NOT COMPILE }
    }
}
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