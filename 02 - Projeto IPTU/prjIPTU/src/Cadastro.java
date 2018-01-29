import java.util.ArrayList;

public class Cadastro {
    
    private ArrayList<Imovel> imoveis;
    private Cidadao proprietario;
    private double arrecadacao;

    public ArrayList<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(ArrayList<Imovel> imoveis) {
        this.imoveis = imoveis;
    }

    public Cidadao getProprietario() {
        return proprietario;
    }

    public void setProprietario(Cidadao proprietario) {
        this.proprietario = proprietario;
    }

    public double getArrecadacao() {
        return arrecadacao;
    }

    public void setArrecadacao(double arrecadacao) {
        this.arrecadacao = arrecadacao;
    }

    public Cadastro(ArrayList<Imovel> imoveis, double arrecadacao) {
        this.imoveis = imoveis;
         this.arrecadacao = arrecadacao;
    }
    
    public void adicionar(Imovel i) {
        if(i != null) {
            imoveis.add(i);
        }
    }
    
    public void remover(Imovel i) {
        imoveis.remove(i);
    }
}