class AnimalRegistry {
    private Animal sheepPrototype;
    private Animal cowPrototype;
    private Animal horsePrototype;

    public AnimalRegistry() {
        // Initialize with default prototypes
        sheepPrototype = new Sheep(4, "Baa", "Grass", "Default Sheep");
        cowPrototype = new Cow(4, "Moo", "Grass", "Default Cow");
        horsePrototype = new Horse(4, "Neigh", "Hay", "Default Horse");
    }

    public Animal createSheep() {
        return sheepPrototype.clone();
    }

    public Animal createCow() {
        return cowPrototype.clone();
    }

    public Animal createHorse() {
        return horsePrototype.clone();
    }

    public Animal createSheep(String name) {
        Sheep sheep = (Sheep) sheepPrototype.clone();
        sheep.setName(name);
        return sheep;
    }

    
}
