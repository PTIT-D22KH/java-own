package basic.return_in_methods;

public class Sample {
    public static void main(String[] args) {
        int area = areaOfRectangle(10, 15);
        System.out.println("Area of the shape: " + area);
        System.out.println("Area of the shape: " + areaOfRectangle(10, 15));
        areaOfRectangle(10, 15);
    }
    public static int areaOfRectangle(int height, int width) {
        return height * width;
    }
}
