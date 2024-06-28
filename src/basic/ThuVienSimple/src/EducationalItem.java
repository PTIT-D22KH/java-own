package basic.ThuVienSimple.src;


public abstract class EducationalItem extends Item{
    protected String color, chatLieu;

    public String getColor() {
        return color;
    }

    public String getChatLieu() {
        return chatLieu;
    }
    
    EducationalItem(String name, int price, String brand, String color, String chatLieu) {
        super(name, price, brand);
        this.color = color;
        this.chatLieu = chatLieu;
    }
}
