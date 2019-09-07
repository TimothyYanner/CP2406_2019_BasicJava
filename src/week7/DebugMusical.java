package week7;

public class DebugMusical extends DebugPlay {
    private String composer;

    DebugMusical(String title, String author, String comp) {
        super(title, author);
        this.composer = comp;
    }

    public void display() {
        System.out.println("The performance is " + title +
                " by " + author + "\nThe music for " + title +
                " is by " + composer);
    }
}