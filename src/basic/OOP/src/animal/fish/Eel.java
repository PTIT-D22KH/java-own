package animal.fish;

public class Eel extends Fish{
    private String special;

    public Eel() {
        super();
        this.special = "Releases electric stock";
    }

    // @Override
    public String showInfo() {
        return "Eel {heightInFeet=" + heightInFeet + ", special=" + special + ", weightInKilos=" + weightInKilos
                + ", waterBone=" + waterBone + ", animalType=" + animalType + ", gills=" + gills + ", bloodType="
                + bloodType + "}";
    }
    
}
