package animal.reptile;
import animal.Animal;
public class Reptile extends Animal{
    protected String skin, egg;
    protected boolean backbone;

    public Reptile() {
        heightInFeet = 5;
        weightInKilos = 20;
        animalType = "Reptile";
        bloodType = "Cold";
        this.skin = "Dry skin";
        this.backbone = true;
        this.egg = "soft shelled";
    }

    // @Override
    public String showInfo() {
        return "Reptile {heightInFeet=" + heightInFeet + ", weightInKilos=" + weightInKilos + ", skin=" + skin
                + ", egg=" + egg + ", animalType=" + animalType + ", backbone=" + backbone + ", bloodType=" + bloodType
                + "}";
    }
    
}
