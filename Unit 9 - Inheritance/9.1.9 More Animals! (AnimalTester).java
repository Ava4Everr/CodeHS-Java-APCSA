public class AnimalTester
{
    public static void main(String[] args)
    {
        // Add code to test your hierarchy
        Animal animal = new Animal();
        animal.setType("Mammal");
        
        Pet pet = new Pet();
        pet.setName("Bosco");
        pet.setSize("Small");
        
        Fish fish = new Fish();
        fish.setWaterType("Fresh Water");
        
        Dog dog = new Dog();
        dog.setTrained(true);
    }
}
