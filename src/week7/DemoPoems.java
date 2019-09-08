package week7;

public class DemoPoems {
    public static void main(String[] args) {
        Poem poem = new Poem("normal poem", 9);
        Couplet couplet = new Couplet("couplet");
        Haiku haiku = new Haiku("haiku");
        Limerick limerick = new Limerick("limerick");

        System.out.println("The " + poem.getName() + " has " + poem.getNumberLines() + " lines");
        System.out.println("The " + couplet.getName() + " has " + couplet.getNumberLines() + " lines");
        System.out.println("The " + haiku.getName() + " has " + haiku.getNumberLines() + " lines");
        System.out.println("The " + limerick.getName() + " has " + limerick.getNumberLines() + " lines");
    }
}
