package inheritance_ex;


import inheritance_ex.animal.Animal;
import inheritance_ex.animal.bird.*;
import inheritance_ex.animal.fish.*;
import inheritance_ex.animal.reptile.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        
        // Reptile reptile = new Reptile();
        // System.out.println(reptile.showInfo());
        // Fish fish = new Fish();
        // System.out.println(fish.showInfo());
        // Animal animal = new Animal();
        // System.out.println(animal.showInfo());
        // Bird bird = new Bird();
        // System.out.println(bird.showInfo());
        List<Animal> animals = new ArrayList<>();
        Animal animal = new Animal();
        Reptile reptile = new Reptile();
        Animal croc = new Crocodile();
        Animal eel = new Eel();
        Bird eagle = new Eagle();

        animals.add(animal);
        animals.add(reptile);
        animals.add(croc);
        animals.add(eel);
        animals.add(eagle);

        listAnimals(animals);

       
    }
    private static void listAnimals(List<Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.showInfo());
        }
    }
}
