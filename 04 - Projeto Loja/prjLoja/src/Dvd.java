import javax.swing.JOptionPane;

public class Dvd extends Produto {
    
    private String diretor;
    private String duracao;
    private String censura;
    
    public Dvd() {
        super("", "", 0, 0, 0);
        this.diretor = "";
        this.duracao = "";
        this.censura = "";        
    }

    public Dvd(String diretor, String duracao, String censura, String descricao, String genero, int estoqueDisponivel, double precoCusto, double precoVenda) {
        super(descricao, genero, estoqueDisponivel, precoCusto, precoVenda);
        this.diretor = diretor;
        this.duracao = duracao;
        this.censura = censura;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getCensura() {
        return censura;
    }

    public void setCensura(String censura) {
        this.censura = censura;
    }
    
    public void listarProduto() {
        JOptionPane.showMessageDialog(null, "Descrição: " + this.getDescricao() +
                    "\nGênero: " + this.getGenero() +
                    "\nEstoque: " + this.getEstoqueDisponivel() +
                    "\nPreço Pago: " + this.getPrecoCusto() +
                    "\nPreço Vendido: " + this.getPrecoVenda()+
                    "\nDiretor: " + this.getDiretor() +
                    "\nDuração: " + this.getDuracao() +
                    "\nCensura: " + this.getCensura());
    }
    
    public void calcularPrecoVenda(double pcLucro, double cotacaoDolar) {
        this.setPrecoVenda(this.getPrecoCusto() + (this.getPrecoCusto() * cotacaoDolar) * pcLucro / 100);
        
        JOptionPane.showMessageDialog(null, "Preço da venda é de " + this.getPrecoVenda());
    }
    
    @Override
    public void calcularPrecoVenda() {
        
    }
}