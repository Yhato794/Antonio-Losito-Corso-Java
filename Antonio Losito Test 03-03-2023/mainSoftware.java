public class mainSoftware {
    public static void main(String[] args) {
       
        Biblioteca.libriBib.add(new Libro("Harry Potter 1", 7, 0));
        Biblioteca.libriBib.add(new Libro("Harry Potter 2", 0, 10));
        Biblioteca.libriBib.add(new Libro("Harry Potter 3", 10, 0));
        Biblioteca.libriBib.add(new Libro("Harry Potter 4", 0, 15));
        Biblioteca.libriBib.add(new Libro("Harry Potter 5", 3, 0));
        Biblioteca.libriBib.add(new Libro("Harry Potter 6", 0, 22));
        Biblioteca.menuPrincipale();
    }
}
