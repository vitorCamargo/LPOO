import javax.swing.JOptionPane;

public class Percurso {
    
    private double kmPercorrido;
    private double valorCombustivel;
    private double pedagio;

    public double getKmPercorrido() {
        return kmPercorrido;
    }

    public void setKmPercorrido(double kmPercorrido) {
        this.kmPercorrido = kmPercorrido;
    }

    public double getValorCombustivel() {
        return valorCombustivel;
    }

    public void setValorCombustivel(double valorCombustivel) {
        this.valorCombustivel = valorCombustivel;
    }

    public double getPedagio() {
        return pedagio;
    }

    public void setPedagio(double pedagio) {
        this.pedagio = pedagio;
    }

    public Percurso(double kmPercorrido, double valorCombustivel, double pedagio) {
        this.kmPercorrido = kmPercorrido;
        this.valorCombustivel = valorCombustivel;
        this.pedagio = pedagio;
    }
    
    public void cadastrarPercurso() { 
        setKmPercorrido(Double.parseDouble(JOptionPane.showInputDialog("Digite  Kilomêtros Percorridos:")));
        setValorCombustivel(Double.parseDouble(JOptionPane.showInputDialog("Digite  Valor do Combustível:")));
        setPedagio(Double.parseDouble(JOptionPane.showInputDialog("Digite  o valor total dos pedágios:")));
        JOptionPane.showMessageDialog(null, "Percurso cadastrado com sucesso...");
    }
    
    public void listarPercurso() {
        Principal prin = new Principal();
        for(Percurso per: prin.lista) {
            if(per != null) {
                JOptionPane.showMessageDialog(null, "Percurso\n"
                                                + "\nKM percorridos: " + getKmPercorrido()
                                                + "\nValor do combustível: " + getValorCombustivel()
                                                + "\nValor pedágio: " + getPedagio()
                );
            }
        }
    }
}