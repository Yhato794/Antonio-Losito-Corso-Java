public class conversione {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        float c, d;

        c = a / b;
        d = (float) a / b;
        System.out.println(d);
        System.out.println(c);
        System.out.println(arrotonda(d));

    }

    static int arrotonda(float value) {
        return (int) (value + 0.5);
    }
}
