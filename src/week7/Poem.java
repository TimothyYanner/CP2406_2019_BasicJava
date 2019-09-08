package week7;

public class Poem {
    protected String name;
    protected int numberLines;

    Poem(String name, int numberLines) {
        this.name = name;
        this.numberLines = numberLines;
    }

    public String getName() {
        return name;
    }

    public int getNumberLines() {
        return numberLines;
    }
}
