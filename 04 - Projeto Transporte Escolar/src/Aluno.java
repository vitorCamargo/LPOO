//author Vitu
public class Aluno extends Passageiro {
 
    private String curso;
    private int idade;

    public Aluno(int id, String nome, String email, boolean presenca,String curso,int idade) {
        super(id, nome, email, presenca);
        this.curso = curso;
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public boolean validarPassageiro() {
        if(this.getIdade() >= 18) {
            return true;
        } else {
            return false;
        }
    }
}