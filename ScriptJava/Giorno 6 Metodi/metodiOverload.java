public class metodiOverload {

    public static void main(String[] args) {
        int x = 5;
        String prima = "Prima";
        String seconda = "Seconda";
        metodiOverload456(x);
        metodiOverload456(x, prima);
        metodiOverload456(x, prima, seconda);
        metodiOverload456(prima, seconda);
        metodiOverload456(prima);


    }

    public static void metodiOverload456(int x) {
        System.out.println("Numero " + x);

    }

    public static void metodiOverload456(int x, String s1) {
        System.out.println("Numero " + x + " String n1: " + s1);

    }

    public static void metodiOverload456(int x, String s1, String s2) {
        System.out.println("Numero " + x + " String n1: " + s1 + " String n2 " + s2);

    }

    public static void metodiOverload456(String s1, String s2) {
        System.out.println(" String n1: " + s1 + " String n2 " + s2);

    }

    public static void metodiOverload456(String s2) {
        System.out.println(" String n2 " + s2);

    }

}
