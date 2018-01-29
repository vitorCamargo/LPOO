public class Media {
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Media(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public String calcular(){
        double r = (this.a + this.b)/2;
        return String.valueOf(r);
    }
    public String geometrica(){
        double r = Math.sqrt(this.a * this.b);
        return String.valueOf(r);
    }
    public String harmonica(){
        double r = 2/((1/this.a)+(1/this.b));
        return String.valueOf(r);
    }
}
