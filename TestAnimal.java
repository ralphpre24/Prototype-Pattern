public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Animal sheep1 = registry.createSheep();
        Animal sheep2 = registry.createSheep("Dolly");
        Animal cow = registry.createCow();
        Animal horse = registry.createHorse();

        sheep1.makeSound(); // Output: Baa
        sheep2.makeSound(); // Output: Baa
        cow.makeSound(); // Output: Moo
        horse.makeSound(); // Output: Neigh

        System.out.println(sheep1.getType()); // Output: Sheep
        System.out.println(sheep2.getType()); // Output: Sheep
        System.out.println(cow.getType()); // Output: Cow
        System.out.println(horse.getType()); // Output: Horse

        System.out.println(sheep1.getName()); // Output: Default Sheep
        System.out.println(sheep2.getName()); // Output: Dolly
    }
}
