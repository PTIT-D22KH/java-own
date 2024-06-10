package basic.string_test1;
public class Sample {
    public static void main(String[] args) {
        String var1 = "Study";
        String var2 = "Easy";
        int var3 = 10;
        String var4 = "100";
        String var5 = "10";
        String var6 = "Duongvct \u00f1";
        System.out.println(var6);
        System.out.println(var1 + var2 + var3);
        System.out.println(Integer.parseInt(var4) + 10);
        System.out.println(var4 + var5);
        System.out.println(var3 + var4);
        System.out.println(Integer.parseInt(var4) + var5);
    }
}
