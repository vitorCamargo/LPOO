import javax.swing.JOptionPane;

public class GerenciadorEstoques {
    void comprar(Produto produto) {
        produto.comprar(Integer.parseInt(JOptionPane.showInputDialog("Digite quantos quer comprar: ")));
    }
    
    void vender(Produto produto) {
        if(produto.getEstoqueDisponivel() > 0) {
            produto.vender(Integer.parseInt(JOptionPane.showInputDialog("Digite quantos quer vender: ")));   
        } else {
            JOptionPane.showMessageDialog(null, "Você não pode encomendar nada. Estoque Indisponível");
        }
    }
    
    void encomendar(Produto produto) {
        if(produto.getEstoqueDisponivel() > 0) {
            JOptionPane.showMessageDialog(null, "Você pode encomendar até " + produto.getEstoqueDisponivel() + "produtos");
        } else {
            JOptionPane.showMessageDialog(null, "Você não pode encomendar nada. Estoque Indisponível");
        }
    }
}