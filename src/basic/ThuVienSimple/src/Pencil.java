package basic.ThuVienSimple.src;


public class Pencil extends EducationalItem{
    static int soLuong = 0;
    private String doCung;
    public static int getSoLuong() {
        return soLuong;
    }
    public String getDoCung() {
        return doCung;
    }
    public Pencil(String name, int price, String brand, String color, String chatLieu, String doCung) {
        super(name, price, brand, color, chatLieu);
        this.doCung = doCung;
        soLuong++;
    }

    @Override
    public void show() {
        super.show();
        System.out.printf("Độ cứng: %s\n", this.getDoCung());
    }
}
