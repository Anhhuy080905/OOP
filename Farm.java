import java.util.ArrayList;
import java.util.List;

public class Farm {
    List<Animal> animals;

    public Farm() {
        animals = new ArrayList<Animal>();
    }

    public void addAnimal(Animal a) {
        animals.add(a);
    }

    public void canSwim() {
        for (Animal a : animals) {
            if (a.swim()) {
                System.out.println(a.getName() + " can swim");
            }
        }
    }

    public void canWalk() {
        for (Animal a : animals) {
            if (a.walk()) {
                System.out.println(a.getName() + " can walk");
            }
        }
    }

    public static void main(String[] args) {
        Farm farm = new Farm();
        Animal pig = new Pig("Pig");
        Animal duck = new Duck("Duck");
        Animal fish = new Fish("Fish");
        farm.addAnimal(pig);
        farm.addAnimal(duck);
        farm.addAnimal(fish);
        farm.canSwim();
        farm.canWalk();
    }
}
