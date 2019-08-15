public class Item {
    
    private int cod;
    private String descricao;
    private double preco;
    private double total;
    private int qtd;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Item(int cod, String descricao, double preco) {
        this.cod = cod;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    public void consumo(int qtd) {
        this.setTotal(this.getPreco() * qtd);
        this.setQtd(qtd); 
        this.setCod(this.cod);
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}