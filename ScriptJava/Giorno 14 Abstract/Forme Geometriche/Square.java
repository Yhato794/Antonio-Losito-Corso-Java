public class Square extends Shape {
    private double lato;

    public Square(double lato) {
        this.lato = lato;
    }

    public double getLato() {
        return lato;
    }

    public void setLato(double lato) {
        this.lato = lato;
    }

    public double getArea() {
        return lato*lato;
    }

    public double getPerimeter() {
        return lato * 4;
    }

}
