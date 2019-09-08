package week7;

public class DemoHorses {
    public static void main(String[] args) {
        Horse horse1 = new Horse();
        horse1.setName("Jeff");
        horse1.setColour("Brown");
        horse1.setBirthYear(2010);
        RaceHorse horse2 = new RaceHorse();
        horse2.setName("Bill");
        horse2.setColour("Black");
        horse2.setBirthYear(2014);
        horse2.setNumberRaces(19);
        System.out.println("The first horse is " + horse1.name + ", he is " + horse1.colour + " and was born in " +
                horse1.birthYear);
        System.out.println("The second horse is a racehorse named " + horse2.name + ", he is " + horse2.colour +
                " with " + horse2.getNumberRaces() + " races under his belt and was born in " + horse2.birthYear);
    }
}
