import java.util.ArrayList;
import java.util.Scanner;

public class Concessionaria {
    public static Scanner interi = new Scanner(System.in);
    public static Scanner stringhe = new Scanner(System.in);

    public static void main(String[] args) {
        boolean uscita = true;
        ArrayList<Auto> auto = new ArrayList<Auto>();
        ArrayList<Moto> moto = new ArrayList<Moto>();

        do {
            System.out.println("Cosa vuoi registrare? 1 Auto 2 Moto 3 esci e stampa archivio");
            int scelta = interi.nextInt();
            switch (scelta) {
                case 1:
                    auto.add(aggiungiAuto());
                    break;
                case 2:
                    moto.add(aggiungiMoto());
                    break;
                case 3:
                    uscita = false;
                    break;
            }
        } while (uscita);

        stampa(auto);
        stampa(moto, 0); // QUESTO E' SUPER SBAGLIATO MA GIUSTO PER USARE UN OVERLOAD :D :D

    }

    public static Auto aggiungiAuto() {

        System.out.println("Inserisci il marca");
        String inputMarca = stringhe.nextLine();
        System.out.println("Inserisci modello");
        String inputModello = stringhe.nextLine();
        System.out.println("Inserisci anno immatricolazione");
        int inputAnnoImm = interi.nextInt();
        System.out.println("Inserisci n porte");
        int inputNPorte = interi.nextInt();
        System.out.println("Inserisci tipo carburante");
        String inputTipoCarb = stringhe.nextLine();
        System.out.println("Inserisci consumo carburante");
        int inputConsCarb = interi.nextInt();
        Auto temp = new Auto(inputMarca, inputModello,inputAnnoImm, inputNPorte, inputTipoCarb, inputConsCarb);
        return temp;

    }

    public static Moto aggiungiMoto() {

        System.out.println("Inserisci il marca");
        String inputMarca = stringhe.nextLine();
        System.out.println("Inserisci modello");
        String inputModello = stringhe.nextLine();
        System.out.println("Inserisci anno immatricolazione");
        int inputAnnoImm = interi.nextInt();
        System.out.println("Inserisci cilindrata");
        int inputCilindrata = interi.nextInt();
        System.out.println("Inserisci tipologia moto");
        String inputTipoMoto = stringhe.nextLine();
        System.out.println("Inserisci potenza");
        int inputPotenza = interi.nextInt();
        Moto temp = new Moto(inputMarca, inputModello,inputAnnoImm, inputCilindrata, inputTipoMoto, inputPotenza);
        return temp;

    }

    public static void stampa(ArrayList<Auto> auto) {

        for (int i = 0; i < auto.size(); i++) {
            System.out.println("Modello auto: " + auto.get(i).getModello());
            System.out.println("Marca auto: " + auto.get(i).getMarca());
            System.out.println("Anno immatrocolazione "+auto.get(i).getAnnoImmatricolazione());
            System.out.println("Numero porte auto: " + auto.get(i).getnPorte());
            System.out.println("Tipo carburante auto: " + auto.get(i).getTipoCarburante());
            System.out.println("Consumo auto: " + auto.get(i).getConsumoCarburante());
            System.out.println("------------------------------------------------");
        }

    }

    public static void stampa(ArrayList<Moto> moto, int a) {

        for (int i = 0; i < moto.size(); i++) {
            System.out.println("Modello moto: " + moto.get(i).getModello());
            System.out.println("Marca moto: " + moto.get(i).getModello());
            System.out.println("Anno immatrocolazione "+moto.get(i).getAnnoImmatricolazione());
            System.out.println("Cilindrata moto: " + moto.get(i).getCilindrata());
            System.out.println("Tipologia moto: " + moto.get(i).getTipologia());
            System.out.println("Potenza moto: " + moto.get(i).getPotenza());
            System.out.println("------------------------------------------------");
        }

    }
}
