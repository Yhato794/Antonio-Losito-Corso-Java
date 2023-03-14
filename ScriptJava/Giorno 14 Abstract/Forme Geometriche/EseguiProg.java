import java.util.Scanner;

public class EseguiProg {
    public static Scanner interi = new Scanner(System.in);

    public static void main(String[] args) {
        ShapeManager listaForme = new ShapeManager();
        menuPrincipale(listaForme);
    }

    public static int insNum() {

        boolean errore = true;
        int i = 0;
        do {
            try {
                i = interi.nextInt();
                errore = false;
                break;
            } catch (Exception e) {
                System.out.println("ERRORE");
                interi.nextLine();
                errore = true;
            } finally {
                if (errore)
                    System.out.println("Hai sbagliato");
                else
                    System.out.println("Input corretto");
            }
        } while (errore);
        return i;
    }

    public static void menuPrincipale(ShapeManager listaForme) {
        boolean uscita = true;
        while (uscita) {
            System.out
                    .println(
                            "Quale oggetto vuoi creare 1:Cerchio 2:Quadrato 3:Rettangolo 4: vai a menu operazione 5:esci");
            int scelta = insNum();
            switch (scelta) {
                case 1:
                    listaForme.addListaForme(creaCerchio());
                    break;
                case 2:
                    listaForme.addListaForme(creaSquare());
                    break;
                case 3:
                    listaForme.addListaForme(creaRectangle());
                    break;
                case 4:
                    menuCalcolo(listaForme);
                case 5:
                    uscita = false;
                    break;
                default:
                    System.out.println("Scelta non valida");
                    break;
            }

        }
    }

    public static Shape creaRectangle() {
        int lato1 = (int) (Math.random() * 10);
        int lato2 = (int) (Math.random() * 10);
        Shape rectangle = new Rectangle(lato1, lato2);
        System.out
                .println("Rettangolo creato Area: " + rectangle.getArea() + " Perimetro: " + rectangle.getPerimeter());
        return rectangle;
    }

    public static Shape creaSquare() {
        int lato = (int) (Math.random() * 10);
        Shape square = new Square(lato);
        System.out.println("Quadrato creato Area: " + square.getArea() + " Perimetro: " + square.getPerimeter());
        return square;
    }

    public static Shape creaCerchio() {
        int raggio = (int) (Math.random() * 10);
        Shape cerchio = new Circle(raggio);
        System.out.println("Cerchio creato Area: " + cerchio.getArea() + " Perimetro: " + cerchio.getPerimeter());
        return cerchio;
    }

    public static void menuCalcolo(ShapeManager listaForme) {
        System.out.println(
                "Cosa vuoi calcolare 1 Area totale di tutti le forme in memoria o 2:perimetro totale 3: torna al menu precedente");
        int scelta1 = insNum();
        switch (scelta1) {
            case 1:
                System.out.println("Area totale: " + listaForme.getTotalArea());
                break;
            case 2:
                System.out.println("Perimetro totale: " + listaForme.getTotalPerimeter());
                break;
            case 3:
                menuPrincipale(listaForme);
                break;

        }
        menuPrincipale(listaForme);
    }
}
