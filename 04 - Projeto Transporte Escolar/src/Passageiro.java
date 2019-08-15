//author Vitu
public abstract class Passageiro {
    
    private int id;
    private String nome;
    private String email;
    private boolean presenca;
    
    public Passageiro(int id, String nome, String email, boolean presenca) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.presenca = presenca;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isPresenca() {
        return presenca;
    }

    public void setPresenca(boolean presenca) {
        this.presenca = presenca;
    }
    
    abstract public boolean validarPassageiro();
}