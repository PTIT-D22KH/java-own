package inheritance_ex.animal.bird;

public class Eagle extends Bird{

    public String showInfo() {
        return "Eagle {heightInFeet=" + heightInFeet + ", weightInKilos=" + weightInKilos + ", feather=" + feather
                + ", animalType=" + animalType + ", canFly=" + canFly + ", bloodType=" + bloodType + "}";
    }
    
}
