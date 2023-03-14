public class Circle extends Shape {
    private int raggio;

    public Circle(int raggio) {
        this.raggio = raggio;
    }

    public int getRaggio() {
        return raggio;
    }

    public void setRaggio(int raggio) {
        this.raggio = raggio;
    }

    public double getArea(){
        return (raggio*raggio)*3.14;
    }

    public double getPerimeter(){
        return (raggio*2)*3.14;
    }

}