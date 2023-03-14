public class Rectangle extends Shape {

    private int lato1;
    private int lato2;

    public Rectangle(int lato1, int lato2) {
        this.lato1 = lato1;
        this.lato2 = lato2;
    }

    public int getLato1() {
        return lato1;
    }

    public void setLato1(int lato1) {
        this.lato1 = lato1;
    }

    public int getLato2() {
        return lato2;
    }

    public void setLato2(int lato2) {
        this.lato2 = lato2;
    }

    public double getArea() {
        return lato1 * lato2;
    }

    public double getPerimeter() {
        return (2 * lato1) + (2 * lato2);

    }

}
