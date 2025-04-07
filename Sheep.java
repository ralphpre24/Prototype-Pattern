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

     // Getters and setters (optional)
    public int getLegs() { return legs; }
    public String getSound() { return sound; }
    public String getFood() { return food; }
    public String getName() { return name; }

    public void setLegs(int legs) { this.legs = legs; }
    public void setSound(String sound) { this.sound = sound; }
    public void setFood(String food) { this.food = food; }
    public void setName(String name) { this.name = name; }
}
