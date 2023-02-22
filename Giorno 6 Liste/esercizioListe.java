import java.util.*;

public class esercizioListe {
    public static void main(String[] args) {
        String nomi[] = { "Antonio", "Nicola", "Paolo" };
        Integer numeri[] = { 22, 25, 33 };
        Scanner scelta1 = new Scanner(System.in);
        Scanner scelta2 = new Scanner(System.in);
        Scanner stringaInput = new Scanner(System.in);
        Scanner numeroInput = new Scanner(System.in);

        ArrayList<String> nomiList = new ArrayList<String>(Arrays.asList(nomi));
        ArrayList<Integer> numeriList = new ArrayList<Integer>(Arrays.asList(numeri));
        boolean a = true;
        boolean b = true;

        while (a) {
            System.out.println("1 Stringhe 2 numeri 3 Esci ");
            int scelta1Input = scelta1.nextInt();
            switch (scelta1Input) {
                case 1:
                    System.out.println("Stringa nomi ");
                    System.out.println(Arrays.toString(nomi));

                    
                    break;
                case 2:
                    System.out.println("Stringa numeri ");
                    System.out.println(Arrays.toString(numeri));

                    break;
                default:
                    a = false;
                    b = false;
            }
            while (b) {

                System.out.println("Aggiungre a 1 Stringhe o 2 Numero 3 Esci");
                int scelta1Input1 = scelta2.nextInt();
                switch (scelta1Input1) {
                    case 1:
                        System.out.println("Inserire Stringa");
                        String nomeUtente = stringaInput.nextLine();
                        nomiList.add(nomeUtente);
                        nomi=nomiList.toArray(nomi);
                        break;
                    case 2:
                        System.out.println("Inserire numero");
                        Integer numeroUtente = numeroInput.nextInt();
                        numeriList.add(numeroUtente);
                        numeri=numeriList.toArray(numeri);
                        break;
                    default:
                        b = false;

                }
            }

        }

    }

}
