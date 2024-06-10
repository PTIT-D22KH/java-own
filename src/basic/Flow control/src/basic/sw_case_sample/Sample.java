package basic.sw_case_sample;

public class Sample {
    public static void main(String[] args) {
        int x = 11;
        switch(x) {
            case 1:
                System.out.println("X is 1");
                break;
            case 2:
                System.out.println("X is 2");
                break;
            case 3:
                System.out.println("X is 3");
                break; 
            default:
                System.out.println("X is other than 1, 2, 3");
                break;
                // break;  //the last one doesn't have to use break
        }


        char y = 'B';
        switch (y) {
            case 'a':
            case 'A':
                System.out.println("Y is a");
                break;
            case 'b':
            case 'B':
                System.out.println("Y is b");
                break;
            case 'c':
            case 'C':
                System.out.println("Y is c");
                break;
            default:
                System.out.println("X is other than a, b, c");
                break;
        }
    }
}
