package basic.ThuVienSimple.src;


public class Book extends Item{
    static int soLuong = 0;
    private String genre, author, nhaXuatBan, language;
    private int namXuatBan;

    public Book(String name, int price, String genre, String author, String brand, String nhaXuatBan, int namXuatBan, String language) {
        super(name, price, brand);
        this.genre = genre;
        this.author = author;
        this.nhaXuatBan = nhaXuatBan;
        this.namXuatBan = namXuatBan;
        this.language = language;
        soLuong++;
    }

    

    @Override
    public void show() {
        super.show();
        System.out.printf("Thể loại: %s\n", this.getGenre());
        System.out.printf("Tác giả: %s\n", this.getAuthor());
        System.out.printf("Nhà xuất bản: %s\n", this.getNhaXuatBan());
        System.out.printf("Năm xuất bản: %d\n", this.getNamXuatBan());
        System.out.printf("Ngon ngu: %s\n", this.getLanguage());
    }



    public static int getSoLuong() {
        return soLuong;
    }



    public String getGenre() {
        return genre;
    }



    public String getAuthor() {
        return author;
    }



    public String getNhaXuatBan() {
        return nhaXuatBan;
    }



    public String getLanguage() {
        return language;
    }



    public int getNamXuatBan() {
        return namXuatBan;
    }
}
