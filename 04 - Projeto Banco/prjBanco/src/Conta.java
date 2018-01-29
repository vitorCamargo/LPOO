import javax.swing.JOptionPane;

public abstract class Conta {
    
    private double saldo;
    
    public Conta() {
        this(0);
    }
    
    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void creditar(double valor) {
        this.saldo += valor;
    }
    
   public  void debitar(double valor) {
        if(valor < this.saldo) {
            this.saldo -= valor;
        } else {
            JOptionPane.showMessageDialog(null, "Saldo Indisponível");
        }
    }
    
    public abstract void atualizarSaldos();
}