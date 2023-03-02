import java.util.ArrayList;
import java.util.Scanner;

public class MenuPiattoSpeciale {

    public static Scanner stringhe = new Scanner(System.in);
    public static Scanner interi = new Scanner(System.in);
    public static ArrayList<PiattoSpeciale> listaPiatti = new ArrayList<PiattoSpeciale>();

    public static void main(String[] args) {

        ingresso(listaPiatti);

    }

    public static void ingresso(ArrayList<PiattoSpeciale> listaPiatti) {

        System.out.println("Vuoi ordinare?");
        int scelta = interi.nextInt();
        if (scelta == 1) {
            PiattoSpeciale c= new PiattoSpeciale();
            listaPiatti.add(c);
            menuPrincipale(c);
        } else {
            stampaPrezzoTotale(listaPiatti);
        }

    }

    public static void menuPrincipale(PiattoSpeciale piatto) {

        // MENU TIPO PANE
        System.out.println("Scegli tipo di pane 1: Classico 2: Sesamo 3: Annulla Ordide");
        int sceltaPane = interi.nextInt();
        if (sceltaPane == 1) {
            piatto.setTipoPane("Pane Classico");
            menuIngrediente(piatto);
        } else if (sceltaPane == 2) {
            piatto.setIngredienti("Pane Di Sesamo");
            menuIngrediente(piatto);
        } else
            ingresso(null);

    }

    public static void menuIngredienteSpeciale(PiattoSpeciale piatto) { // MENU INGREDIENTI SCELTA UTENTE

        System.out.println("Inserisci Ingrediente personale");
        piatto.setIngredienti(stringhe.nextLine());
        piatto.setPrezzo(piatto.getPrezzo() + 1);
        System.out.println("Vuoi inserire un altro ingrediente 1:Si 2:No vai a recap ordine");
        int scelta1 = interi.nextInt();
        if (scelta1 == 2)
            confermaOrdina(piatto);
        else
            menuIngredienteSpeciale(piatto);

    }

    public static void menuIngrediente(PiattoSpeciale piatto) {

        System.out.println("Scegli ingrediente 1: Carne 2:Pesce 3:Annulla Ordine"); // MENU INGREDIENTI FISSI
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
                main(null);
                break;
        }
        menuIngredienteSpeciale(piatto);

    }

    public static void confermaOrdina(PiattoSpeciale piatto) { // *******CONFERMA ORDINE**********

        System.out.println("Riassunto ordine");
        System.out.println(piatto.getTipoPane());
        System.out.println("Ingredienti");
        for (int i = 0; i < piatto.ingredienti.size(); i++) {
            System.out.print(piatto.ingredienti.get(i) + " ");
        }
        System.out.println("Prezzo: " + piatto.getPrezzo());
        System.out.println("Confermare? 1 Si 2 No torna al menu principale");
        int scelta = interi.nextInt();
        if (scelta == 1){
            
            System.out.println("ORDINE CONFERMATO PAGARE " + piatto.getPrezzo() + "EURO \nGrazie e arrivederci");
            main(null);
        }
        else

            main(null);

    }
    public static void stampaPrezzoTotale(ArrayList<PiattoSpeciale> c){
        int prezzTotale=0;
        for(int i=0;i<c.size();i++){
            PiattoSpeciale a= c.get(i-1);
            prezzTotale=prezzTotale+a.getPrezzo();
        }
        System.out.println("Incasso di oggi: "+prezzTotale);

    }

}
