import javax.swing.JOptionPane;

public abstract class Produto {
    
    private String descricao;
    private String genero;
    private int estoqueDisponivel;
    private double precoCusto;
    private double precoVenda;

    public Produto() {
        this("", "", 0, 0, 0);
    }

    public Produto(String descricao, String genero, int estoqueDisponivel, double precoCusto, double precoVenda) {
        this.descricao = descricao;
        this.genero = genero;
        this.estoqueDisponivel = estoqueDisponivel;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEstoqueDisponivel() {
        return estoqueDisponivel;
    }

    public void setEstoqueDisponivel(int estoqueDisponivel) {
        this.estoqueDisponivel = estoqueDisponivel;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }
    
    public double getPrecoVenda() {
        return precoVenda;
    }
    
    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
    
    void comprar(int qtd) {
       JOptionPane.showMessageDialog(null, "Estoque antigo: " + this.getEstoqueDisponivel());
       this.setEstoqueDisponivel(this.getEstoqueDisponivel() + qtd);
       JOptionPane.showMessageDialog(null, "Estoque novo: " + this.getEstoqueDisponivel());
    }
   
    void vender(int qtd) {
       JOptionPane.showMessageDialog(null, "Estoque antigo: " + this.getEstoqueDisponivel());
       this.setEstoqueDisponivel(this.getEstoqueDisponivel() - qtd);
       JOptionPane.showMessageDialog(null, "Estoque novo: " + this.getEstoqueDisponivel());
    }
   
    public abstract void listarProduto();
    public abstract void calcularPrecoVenda();
}