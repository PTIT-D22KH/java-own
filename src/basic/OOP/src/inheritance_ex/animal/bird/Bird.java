package inheritance_ex.animal.bird;
import inheritance_ex.animal.Animal;
public class Bird extends Animal{
    protected boolean feather = true;
    protected boolean canFly = true;
    public Bird() {
        this.feather = true;
        this.canFly = true;
    }
    // @Override
    public String showInfo() {
        return "Bird {heightInFeet=" + heightInFeet + ", weightInKilos=" + weightInKilos + ", feather=" + feather
                + ", animalType=" + animalType + ", canFly=" + canFly + ", bloodType=" + bloodType + "}";
    }
    
}
