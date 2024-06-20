package interface_java;
public class Iphone implements Phone, IOS{
    public String processor() {
        return "A15";
    }

    @Override
    public int spaceInGb() {
        return 256;
    }

    @Override
    public String airdrop() {
        return "copy and paste anywhere";
    }
}
