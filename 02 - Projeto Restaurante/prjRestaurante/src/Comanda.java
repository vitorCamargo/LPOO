import java.util.ArrayList;

public class Comanda {
    
    private ArrayList<Item> pedidos;
    private double total;
    private double result = 0;

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public ArrayList<Item> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Item> pedidos) {
        this.pedidos = pedidos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Comanda(ArrayList<Item> pedidos, double total) {
        this.pedidos = pedidos;
        this.total = total;
    }
    
     public void adicionar (Item i) {
        if(i != null) {
            pedidos.add(i);
        } 
     }
     
    public void remover (Item i) {
        pedidos.remove(i);
    }
    
    public void fechar() {
        for(Item p: pedidos) {
            this.result += p.getTotal();
        }
        this.total = (this.result * 0.1) + this.result;
    }
}