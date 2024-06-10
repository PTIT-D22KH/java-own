package basic.methods_overloading1;

public class Sample {
    public static void main(String[] args) {
        System.out.println("Area of the square: " + area(5, 6));
    }
    public static int area(int height, int width) {
        return height * width;
    }
    public static int area(int size) {
        return size * size;
    }
    public static double area(double size_d) {
        return size_d * size_d;
    }
}

