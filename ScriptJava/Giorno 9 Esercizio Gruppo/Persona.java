public class Persona {
    private String nome;

    public Persona(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        Persona pers = new Persona("Antonio");
        System.out.println(pers.getNome());
        pers.setNome("Antonio11");
        System.out.println(pers.getNome());
    }
}
