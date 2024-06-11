package inheritance_ex.animal.reptile;

public class Crocodile extends Reptile{
    public Crocodile() {
        super();
        egg = "Hard-shelled";
    }
    

    public String showInfo() {
        return "Crocodile {heightInFeet=" + heightInFeet + ", weightInKilos=" + weightInKilos + ", skin=" + skin
                + ", egg=" + egg + ", animalType=" + animalType + ", backbone=" + backbone + ", bloodType=" + bloodType
                + "}";
    }
    
}
