public class Triangulo {

    private double a;
    private double b;
    private double c;

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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double perimetro() {
        return this.a + this.b + this.c;
        
    }    
    
    public double area(double h) {
        return (this.b * h) / 2;
    }

    public String tipo() {
        if(this.a == this.b && this.b == this.c) {
            return "Equilátero";
        } else if((this.b != this.c) && (this.a != this.b) && (this.a != this.c)) {
             return "Escaleno";
        } else {
            return "Isósceles";
        }
    }
    
    public void sair() {
        
        
    }
}