//author Vitu
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Excursao {
    
    private String descricao;
    private String area;
    private boolean status;
    private int numeroPassageiros;
    private  ArrayList<Passageiro> passageiros;

    public Excursao(String descricao, String area, boolean status, int numeroPassageiros,  ArrayList<Passageiro> passageiros) {
        this.descricao = descricao;
        this.area = area;
        this.status = status;
        this.numeroPassageiros = numeroPassageiros;
        this.passageiros = passageiros;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public ArrayList<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(ArrayList<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }    
    
    public boolean abrirExcursao(Professor responsavel, Transporte transporte,Excursao excursao) {
        if(responsavel.isResponsavel()) {
            excursao.setStatus(true);
            passageiros = new ArrayList<>();
            
            JOptionPane.showMessageDialog(null, "Excursão Aberta");
            return true;
        } else {
            return false;
        }
    }
    
    public void reservar(Passageiro passageiro,Excursao excursao) {
        if(passageiro.validarPassageiro() == true) {
            if(excursao.isStatus() == true) {
                passageiro.setPresenca(true);
                passageiros.add(passageiro);
                JOptionPane.showMessageDialog(null, "Passageiro: " + passageiro.getNome() + " tem sua reserva");
            } else {
                JOptionPane.showMessageDialog(null, "Esta excursão está fechada");
            }
        } else {
            JOptionPane.showMessageDialog(null, "O passageiro" + passageiro.getNome() + " não está autorizado");
        }
    }
    
    public void relacaoPassageiros() {
        String lista = "";
        
        for (Passageiro passageiro : passageiros) {
            lista += "\nNome: " + passageiro.getNome();
        }
        
        JOptionPane.showMessageDialog(null, lista);
    }
}