class Sheep implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String name;

    public Sheep(int legs, String sound, String food, String name) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
        this.name = name;
    }

    public Animal clone() {
        return new Sheep(this.legs, this.sound, this.food, this.name);
    }

    public void makeSound() {
        System.out.println(this.sound);
    }

    public String getType() {
        return "Sheep";
    }
