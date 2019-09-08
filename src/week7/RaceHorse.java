package week7;

public class RaceHorse extends Horse {
    private int numberRaces;

    public int getNumberRaces() {
        return numberRaces;
    }

    public void setNumberRaces(int numberRaces) {
        this.numberRaces = numberRaces;
    }

    RaceHorse(String name, String colour, int birthYear, int numberRaces) {
        super(name, colour, birthYear);
        this.numberRaces = numberRaces;
    }
}
