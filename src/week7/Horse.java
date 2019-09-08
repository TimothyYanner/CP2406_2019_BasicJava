package week7;

public class Horse {
    protected String name;
    protected String colour;
    protected int birthYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    Horse(String name, String colour, int birthYear) {
        this.name = name;
        this.colour = colour;
        this.birthYear = birthYear;
    }
}
