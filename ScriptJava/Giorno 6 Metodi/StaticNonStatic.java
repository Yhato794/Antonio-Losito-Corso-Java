public class StaticNonStatic {
    public static int x=0;
    public int y=0;
    
    public static void main(String[] args) {
        StaticNonStatic a = new StaticNonStatic();
        a.stampaNonStatic();
        StampaStatic();
        System.out.println("Variabile non static "+a.y);
        System.out.println("Variabile static "+x);

    }

    static public void StampaStatic() {
        System.out.println("Questo è un metodo statico "+x);
    }

    void stampaNonStatic() {
        System.out.println("Questo è un metodo statico "+x);

    }
}
