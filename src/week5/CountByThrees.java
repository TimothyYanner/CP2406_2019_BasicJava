package week5;

public class CountByThrees {
    public static void main(String[] args) {
        int i;
        for (i = 3; i < 301; i += 3) {
            if (i % 30 == 0) {
                System.out.println(i);
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
