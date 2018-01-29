import javax.swing.JOptionPane;

public class ContaPoupanca extends Conta {
    private double reajusteMensal;
    
    public ContaPoupanca() {
        super(0);
        this.reajusteMensal = 0;       
    }
    
    public ContaPoupanca(double reajusteMensal, double saldo) {
        super(saldo);
        this.reajusteMensal = reajusteMensal;
    }

    public double getLimiteEspecial() {
        return reajusteMensal;
    }

    public void setLimiteEspecial(double reajusteMensal) {
        this.reajusteMensal = reajusteMensal;
    }

   public  void atualizarSaldos() {
        
    }
    
    public void atualizarSaldos(double reajuste) {
        this.reajusteMensal = reajuste;
        
        JOptionPane.showMessageDialog(null, "O Saldo anterior é: " + this.getSaldo()
            + "\nO Saldo reajustado é: " + (this.getSaldo() + this.getSaldo() * this.reajusteMensal));
        
        this.setSaldo(this.getSaldo() + this.getSaldo() * this.reajusteMensal);
    }
}