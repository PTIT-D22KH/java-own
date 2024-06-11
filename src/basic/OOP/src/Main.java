import animal.Animal;
import animal.bird.*;
import animal.fish.*;
import animal.reptile.*;
public class Main {
    public static void main(String[] args) {
        Reptile reptile = new Reptile();
        System.out.println(reptile.showInfo());
        Fish fish = new Fish();
        System.out.println(fish.showInfo());
        Animal animal = new Animal();
        System.out.println(animal.showInfo());
        Bird bird = new Bird();
        System.out.println(bird.showInfo());
    }
}
