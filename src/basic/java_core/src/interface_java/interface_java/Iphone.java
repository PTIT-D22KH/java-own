package interface_java;
public class Iphone implements Phone{
    public String processor() {
        return "A15";
    }

    @Override
    public int spaceInGb() {
        return 256;
    }
}
