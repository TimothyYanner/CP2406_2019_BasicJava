package week7;

public class DemoHorses {
    public static void main(String[] args) {
        Horse horse1 = new Horse("Jeff", "Brown", 2010);
        RaceHorse horse2 = new RaceHorse("Bill", "Black", 2014, 19);
        System.out.println("The first horse is " + horse1.name + ", he is " + horse1.colour + " and was born in " +
                horse1.birthYear);
        System.out.println("The second horse is a racehorse named " + horse2.name + ", he is " + horse2.colour +
                " and was born in " + horse2.birthYear);
    }
}
