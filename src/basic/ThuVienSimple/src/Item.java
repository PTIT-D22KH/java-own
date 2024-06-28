package basic.ThuVienSimple.src;


public abstract class Item {
    protected String name, brand;
    protected int price;

    public void show() {

    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }


    public Item(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        this.brand = brand;
    }
}
