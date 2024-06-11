import animal.Animal;
import animal.bird.*;
import animal.fish.*;
import animal.reptile.*;
public class Main {
    public static void main(String[] args) {
        Reptile reptile = new Reptile();
        System.out.println(reptile.showInfo());
    }
}
