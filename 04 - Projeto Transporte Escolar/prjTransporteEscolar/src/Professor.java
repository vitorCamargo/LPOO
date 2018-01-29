//author Vitu
public class Professor extends Passageiro {
    
    private boolean determinado;
    private boolean responsavel;

    public Professor(int id, String nome, String email, boolean presenca, boolean determinado, boolean responsavel) {
        super(id, nome, email, presenca);
        this.determinado = determinado;
        this.responsavel = responsavel;
    }

    public boolean isDeterminado() {
        return determinado;
    }

    public void setDeterminado(boolean determinado) {
        this.determinado = determinado;
    }

    public boolean isResponsavel() {
        return responsavel;
    }

    public void setResponsavel(boolean responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public boolean validarPassageiro() {
        if(this.isResponsavel()) {
            return true;
        } else{
            return false;
        }
    }  
}