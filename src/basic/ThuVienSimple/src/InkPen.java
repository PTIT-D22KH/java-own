package basic.ThuVienSimple.src;


public class InkPen extends EducationalItem{
    static int soLuong = 0;
    private String loaiMuc, doMin;
    public static int getSoLuong() {
        return soLuong;
    }
    public String getLoaiMuc() {
        return loaiMuc;
    }
    public String getDoMin() {
        return doMin;
    }
    public InkPen(String name, int price, String brand, String color, String chatLieu, String loaiMuc, String doMin) {
        super(name, price, brand, color, chatLieu);
        this.loaiMuc = loaiMuc;
        this.doMin = doMin;
        soLuong++;
    }
    
    @Override
    public void show() {
        super.show();
        System.out.printf("Loại mực: %s\n", this.getLoaiMuc());
        System.out.printf("Độ mịn: %s\n", this.getDoMin());
    }

    

}
