import javax.swing.JOptionPane;

public class ContaCorrente extends Conta {
    
    private double limiteEspecial;
    
    public ContaCorrente() {
        super(0);
        this.limiteEspecial = 0;       
    }
    
    public ContaCorrente(double limiteEspecial, double saldo) {
        super(saldo);
        this.limiteEspecial = limiteEspecial;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }
    
    public void debitar() {
        double deb = Double.parseDouble(JOptionPane.showInputDialog("Quanto quer sacar: "));
        if(deb <= (getSaldo() + this.limiteEspecial)) {
            setSaldo(getSaldo() - deb); 
        } else {
            JOptionPane.showMessageDialog(null, "Saldo Indisponível");
        }
    }
    
    @Override
    public void atualizarSaldos() {
        if(this.getSaldo() < 0) {
            JOptionPane.showMessageDialog(null, "O Saldo anterior é: " + this.getSaldo()
                + "\nO Saldo reajustado é: " + (getSaldo() + getSaldo() * 0.08));
            this.setSaldo(this.getSaldo() + this.getSaldo() * 0.08);
        }
    }
}