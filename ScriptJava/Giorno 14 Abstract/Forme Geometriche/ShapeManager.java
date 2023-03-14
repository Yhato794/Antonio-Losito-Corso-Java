import java.util.ArrayList;

public class ShapeManager {
    ArrayList<Shape> listaForme;

    public ShapeManager() {
        listaForme = new ArrayList<Shape>();
    }

    public ArrayList<Shape> getListaForme() {
        return listaForme;
    }

    public void setListaForme(ArrayList<Shape> listaForme) {
        this.listaForme = listaForme;
    }

    public void addListaForme(Shape shape) {
        listaForme.add(shape);
    }

    public double getTotalArea() {
        double totaleArea = 0;
        for (int i = 0; i < listaForme.size(); i++) {
            totaleArea = totaleArea + listaForme.get(i).getArea();
        }
        return totaleArea;
    }

    public double getTotalPerimeter() {
        double totalePerimetro = 0;
        for (int i = 0; i < listaForme.size(); i++) {
            totalePerimetro = totalePerimetro + listaForme.get(i).getPerimeter();
        }
        return totalePerimetro;
    }
}
