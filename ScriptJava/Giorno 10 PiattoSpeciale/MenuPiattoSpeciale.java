import java.util.Scanner;

public class MenuPiattoSpeciale {
    public static Scanner stringhe = new Scanner(System.in);
    public static Scanner interi = new Scanner(System.in);

    public static void main(String[] args) {
        ingresso();
    }

    public static void ingresso() {
        System.out.println("Vuoi ordinare?");
        int scelta = interi.nextInt();
        if (scelta == 1) {
            menuPrincipale();
        }

    }

       
    public static void menuPrincipale() {

        PiattoSpeciale piatto = new PiattoSpeciale();
        System.out.println("Scegli tipo di pane 1: Classico 2: Sesamo 3: Annulla Ordide");
        int sceltaPane = interi.nextInt();
        if (sceltaPane == 1) {
            piatto.setTipoPane("Pane Classico");
            menuIngrediente(piatto);
        } else if (sceltaPane == 2) {
            piatto.setIngredienti("Pane Di Sesamo");
            menuIngrediente(piatto);
        } else
            ingresso();

    }
    public static void menuIngredienteSpeciale(PiattoSpeciale piatto) {
        System.out.println("Inserisci Ingrediente personale");
        piatto.setIngredienti(stringhe.nextLine());
        int prezzo = piatto.getPrezzo();
        prezzo = prezzo + 1;
        piatto.setPrezzo(prezzo);
        System.out.println("Vuoi inserire un altro ingrediente 1:Si 2:No vai a recap ordine");
        int scelta1 = interi.nextInt();
        if (scelta1 == 2) {
            confermaOrdina(piatto);
        } else {
            menuIngredienteSpeciale(piatto);
        }
    }


    public static void menuIngrediente(PiattoSpeciale piatto) {
        System.out.println("Scegli ingrediente 1: Carne 2:Pesce 3:Annulla Ordine");
        int sceltaMenuIngredienti = interi.nextInt();
        int prezzo = 5;
        switch (sceltaMenuIngredienti) {
            case 1:
                piatto.setIngredienti("Carne");
                prezzo = prezzo + 2;
                piatto.setPrezzo(prezzo);
                break;
            case 2:
                piatto.setIngredienti("Pesce");
                prezzo = prezzo + 2;
                piatto.setPrezzo(prezzo);
                break;
            case 3:
                ingresso();
                break;
        }
        menuIngredienteSpeciale(piatto);

    }

    public static void confermaOrdina(PiattoSpeciale piatto) {
        System.out.println("Riassunto ordine");
        System.out.println(piatto.getTipoPane());
        System.out.println("Ingredienti");
        for (int i = 0; i < piatto.ingredienti.size(); i++) {
            System.out.print(piatto.ingredienti.get(i) + " ");
        }
        System.out.println("Prezzo: " + piatto.getPrezzo());
        System.out.println("Confermare? 1 Si 2 No torna al menu principale");
        int scelta = interi.nextInt();
        if (scelta == 1) {
            System.out.println("ORDINE CONFERMATO PAGARE " + piatto.getPrezzo() + "EURO \nGrazie e arrivederci");
        } else {
            menuPrincipale();
        }
    }

}
