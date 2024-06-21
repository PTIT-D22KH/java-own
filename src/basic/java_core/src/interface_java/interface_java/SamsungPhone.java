package interface_java;
public class SamsungPhone implements Phone, Android{
    public String processor() {
        return "SD1000";
    }

    @Override
    public int spaceInGb() {
        return 256;
    }

    @Override
    public String whatsapp() {
        return "whatsapp";
    }
}
