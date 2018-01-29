import java.util.Calendar;

public class Aluno {

    private int cod;
    private String nome;
    private Calendar nascimento;
    private String telefone;
    private String cidade;
    private String email;
    private String situacao;

    public Aluno(int cod, String nome, Calendar nascimento, String telefone, String cidade, String email, String situacao) {
        this.cod = cod;
        this.nome = nome;
        this.nascimento = nascimento;
        this.telefone = telefone;
        this.cidade = cidade;
        this.email = email;
        this.situacao = situacao;
    }

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

    public Calendar getNascimento() {
        return nascimento;
    }

    public void setNascimento(Calendar nascimento) {
        this.nascimento = nascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    public void status(String tipo) {
        if(tipo.equals("")) {
            this.setSituacao(tipo);
        }
    }
    
    public int idade() {
        Calendar c = Calendar.getInstance();
        
        int hoje = c.get(Calendar.YEAR);
        int anoNascimento = this.getNascimento().get(Calendar.YEAR);
        int idade = hoje - anoNascimento;
        
        return idade;
    }
}