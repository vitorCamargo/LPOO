//author Vitu
public class Transporte {
    
    private String empresa;
    private String tipo;
    private int lugares;
    
    public Transporte(String empresa, String tipo, int lugares) {
        this.empresa = empresa;
        this.tipo = tipo;
        this.lugares = lugares;
    }
    
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLugares() {
        return lugares;
    }

    public void setLugares(int lugares) {
        this.lugares = lugares;
    }
}