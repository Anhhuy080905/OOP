abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }
    public abstract boolean swim();
    public abstract boolean walk();
}

class Pig extends Animal {
    public Pig(String name) {
        super(name);
    }
    public boolean swim() {
        return false;
    }
    public boolean walk() {
        return true;
    }
}

class Duck extends Animal {
    public Duck(String name) {
        super(name);
    }
    public boolean swim() {
        return true;
    }
    public boolean walk() {
        return true;
    }
}

class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }
    public boolean swim() {
        return true;
    }
    public boolean walk() {
        return false;
    }
}
