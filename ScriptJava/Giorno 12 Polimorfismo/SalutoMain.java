public class SalutoMain {
    public static void main(String[] args) {
        Persona francesco=new Persona("Francesco");
        Pirata pirataAkab= new Pirata("Akab");
        francesco.saluta();
        Persona pers;
        if(pirataAkab instanceof Persona){
            pers= (Persona) pirataAkab;
            pers.saluta();

        }

        
    }
}
