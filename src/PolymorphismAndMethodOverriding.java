 class PolymorphismAndMethodOverriding {
}
   class Animal {
    protected String getName() {
    return "Animal"; }
}
 class Gorilla extends Animal {
     protected String getName() { // DOES NOT COMPILE
        return "Gorilla"; }
}
 class ZooKeeper {
    public static void main(String[] args) {
        Animal animal = new Gorilla();
        System.out.println(animal.getName()); }
}