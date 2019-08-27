package week5;

public class Factorials {
    public static void main(String[] args) {
        int i;
        int x;
        for (i = 1; i < 10; i += 1) {
            int num = 1;
            for (x = 1; x <= i; x += 1) {
                num *= x;
            }
            System.out.println(num);
        }
    }
}
