public class Imovel {
    
    private int codImovel;
    private Cidadao proprietario;
    private double largura;
    private double comprimento;
    private double valorVenal;
    private int tipo;

    public int getCodImovel() {
        return codImovel;
    }

    public void setCodImovel(int codImovel) {
        this.codImovel = codImovel;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getValorVenal() {
        return valorVenal;
    }

    public void setValorVenal(double valorVenal) {
        this.valorVenal = valorVenal;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Cidadao getProprietario() {
        return proprietario;
    }

    public void setProprietario(Cidadao proprietario) {
        this.proprietario = proprietario;
    }

    public Imovel(int codImovel, Cidadao proprietario, double largura, double comprimento, double valorVenal, int tipo) {
        this.codImovel = codImovel;
        this.proprietario = proprietario;
        this.largura = largura;
        this.comprimento = comprimento;
        this.valorVenal = valorVenal;
        this.tipo = tipo;
    }
    
    public double valorIPTU() {
        
        double alq = 0;
        double imposto = 0;
        
        switch(tipo) {
            case 1:
                alq = 0.5;
            break;
            case 2:
                alq = 4;
            break;
            case 3:
                alq = 12;
            break;
            case 4:
                alq = 18;
            break;
            case 5:
                alq = 22;
            break;
        }
        
        if(proprietario.isento() == true) {
            imposto = 0;
        } else {
            imposto =  (valorVenal * alq) / 100;
        }
        return imposto;
    }    
}