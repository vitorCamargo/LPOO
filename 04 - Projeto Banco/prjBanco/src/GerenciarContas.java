public class GerenciarContas {
    
    private double saldoTotal;

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public GerenciarContas(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }
    
    public void totalizarSaldos(Conta conta) {
        this.saldoTotal += conta.getSaldo();
    }
}