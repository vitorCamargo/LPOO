public class Curso {

    private int cod;
    private String descricao;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Curso(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public Curso() {
        this(0, "");
    }   
}