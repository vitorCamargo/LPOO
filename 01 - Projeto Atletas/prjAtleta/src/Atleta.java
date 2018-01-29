public class Atleta {
    private String nome; 
    private Double peso;
    private Double altura;        

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Atleta(String nome, Double peso, Double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }
    
   public double imc() {
       return getPeso()/Math.pow(getAltura(), 2);
   }
}
