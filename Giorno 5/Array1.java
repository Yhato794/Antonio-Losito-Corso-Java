public class Array1 {
    public static void main(String[] args) {
        String valore1[] = { "ciao", "ciaooo", "ciaooooo", "ciaooo" };
        int valore2[] = { 1, 2, 3, 5 };

        for (int i = 0; i < valore2.length; i++) {
            System.out.println(valore1[i] + " " + valore2[i]);
        }

        int[][] numeri = { { 1, 2, 3, 4 }, { 5, 6, 7 } };

        for (int j = 0; j < numeri.length; j++) {
            for (int x = 0; x < numeri[j].length; x++) {
                System.out.println(numeri[j][x]);
            }

        }


    }
}
