package basic.ThuVienSimple.src;


public class Notebook extends EducationalItem{
    static int soLuong = 0;
    int soTrang;
    String kichThuoc, loaiVo;
    public static int getSoLuong() {
        return soLuong;
    }
    public int getSoTrang() {
        return soTrang;
    }
    public String getKichThuoc() {
        return kichThuoc;
    }
    public String getLoaiVo() {
        return loaiVo;
    }
    public Notebook(String name, int price, String brand, String color, String chatLieu, int soTrang, String kichThuoc,
            String loaiVo) {
        super(name, price, brand, color, chatLieu);
        this.soTrang = soTrang;
        this.kichThuoc = kichThuoc;
        this.loaiVo = loaiVo;
        soLuong++;
    }

    @Override
    public void show() {
        super.show();
        System.out.printf("Số trang: %s\n", this.getSoTrang());
        System.out.printf("Loại vở: %s\n", this.getLoaiVo());
        System.out.printf("Kích thước: %s\n", this.getKichThuoc());
    }
    
    
}
