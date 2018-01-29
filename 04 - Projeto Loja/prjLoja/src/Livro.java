import javax.swing.JOptionPane;

public class Livro extends Produto {
    
    private String autor;
    private String editora;
    private String edicao;

    Livro() {
        super("", "", 0, 0, 0);
        this.autor = "";
        this.editora = "";
        this.edicao = "";        
    }
    
    public Livro(String autor, String editora, String edicao, String descricao, String genero, int estoqueDisponivel, double precoCusto, double precoVenda) {
        super(descricao, genero, estoqueDisponivel, precoCusto, precoVenda);
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
    }
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
    
    public void listarProduto() {
        JOptionPane.showMessageDialog(null, "Descrição: " + this.getDescricao() +
                    "\nGênero: " + this.getGenero() +
                    "\nEstoque: " + this.getEstoqueDisponivel() +
                    "\nPreço Pago: " + this.getPrecoCusto() +
                    "\nPreço Vendido: " + this.getPrecoVenda()+
                    "\nAutor: " + this.getAutor() +
                    "\nEditora: " + this.getEditora() +
                    "\nEdição: " + this.getEdicao());
    }

    public void calcularPrecoVenda() {
        this.setPrecoVenda(this.getPrecoCusto() + this.getPrecoCusto() * 0.15);
        
        JOptionPane.showMessageDialog(null, "Preço da venda é de " + this.getPrecoVenda());
    }
}