public class Cidadao {
    
    private int cod;
    private String nome;
    private double renda;
    private int idade;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Cidadao(int cod, String nome, double renda, int idade) {
        this.cod = cod;
        this.nome = nome;
        this.renda = renda;
        this.idade = idade;
    }
    
    public boolean isento() {
        if(renda <= 1228 || idade >= 60) {
            return true;
        }
        return false;
    }
}