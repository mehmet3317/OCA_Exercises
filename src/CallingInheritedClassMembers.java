public class CallingInheritedClassMembers {
}
class Fish1 {
    protected int size;
    private int age=7;
    public Fish1(int age) { this.age = age;
        System.out.println("ConstructorFish");

    }
    public int getAge() {
        System.out.println("getAge");
        return age;
    } }
class Shark extends Fish1 {
     private int numberOfFins = 8;

     public Shark(int age) {
         super(age);
         this.size = 4;
         System.out.println("ConstructorShark");
     }
    public void displaySharkDetails() { System.out.print("Shark with age: "+super.getAge());
        System.out.print(" and "+size+" meters long");
        System.out.print(" with "+numberOfFins+" fins"); }
    public static void main(String[] args) {
         Shark shark = new Shark(4);
         shark.displaySharkDetails();
    }

 }