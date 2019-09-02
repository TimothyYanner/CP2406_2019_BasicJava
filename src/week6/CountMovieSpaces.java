package week6;

public class CountMovieSpaces {
    public static void main(String[] args) {
        String movieQuote = "I am your father";
        int i;
        int spaceCount = 0;
        for (i = 0; i < movieQuote.length(); ++i) {
            if (movieQuote.charAt(i) == ' ') {
                spaceCount += 1;
            }
        }
        System.out.print(spaceCount);
    }
}
