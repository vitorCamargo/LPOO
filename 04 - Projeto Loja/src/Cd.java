import javax.swing.JOptionPane;

public class Cd extends Produto {
    
    private String artista;
    private String gravadora;
    private String paisOrigem;
    
    public Cd() {
        super("", "", 0, 0, 0);
        this.artista = "";
        this.gravadora = "";
        this.paisOrigem = "";        
    }
    
    public Cd(String artista, String gravadora, String paisOrigem, String descricao, 
            String genero, int estoqueDisponivel, double precoCusto, double precoVenda) {
        super(descricao, genero, estoqueDisponivel, precoCusto, precoVenda);
        this.artista = artista;
        this.gravadora = gravadora;
        this.paisOrigem = paisOrigem;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }
    
    @Override
    public void listarProduto() {
        JOptionPane.showMessageDialog(null, "Descrição: " + this.getDescricao() +
                    "\nGênero: " + this.getGenero() +
                    "\nEstoque: " + this.getEstoqueDisponivel() +
                    "\nPreço Pago: " + this.getPrecoCusto() +
                    "\nPreço Vendido: " + this.getPrecoVenda()+
                    "\nArtista: " + this.getArtista() +
                    "\nGravadora: " + this.getGravadora() +
                    "\nPaís de Origem: " + this.getPaisOrigem());
    }
    
    public void calcularPrecoVenda(double pcLucro) {
        this.setPrecoVenda(this.getPrecoCusto() + this.getPrecoCusto() * pcLucro / 100);
        JOptionPane.showMessageDialog(null, "Preço da venda é de " + this.getPrecoVenda());
   }    

    @Override
    public void calcularPrecoVenda() {
    }
}