import java.util.ArrayList;

public class Turma {

    private int cod;
    private String decricao;
    private Curso curso;
    private ArrayList<Aluno> chamada;

    public Turma(int cod, String decricao, Curso curso, ArrayList<Aluno> chamada) {
        this.cod = cod;
        this.decricao = decricao;
        this.curso = curso;
        this.chamada = chamada;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDecricao() {
        return decricao;
    }

    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public ArrayList<Aluno> getChamada() {
        return chamada;
    }

    public void setChamada(ArrayList<Aluno> chamada) {
        this.chamada = chamada;
    }
    
    public void matricular(Aluno aluno) {
        this.getChamada().add(aluno);
    }
    
    public void cancelarMatricula(Aluno aluno) {
        this.getChamada().remove(aluno);
    }
    
    public void transferirAluno(Aluno aluno) {
        chamada.stream().forEach((item) -> {
            int num = aluno.getCod();
            
            if(item.getCod() == num) {
                item.setSituacao("Transferido");
            }
        });
    }
}