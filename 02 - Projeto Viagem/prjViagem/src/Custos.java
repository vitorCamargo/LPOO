public class Custos {
    
    private double totalPercurso;

    public double getTotalPercurso() {
        return totalPercurso;
    }

    public void setTotalPercurso(double totalPercurso) {
        this.totalPercurso = totalPercurso;
    }

    public Custos(double totalPercurso) {
        this.totalPercurso = totalPercurso;
    }
    
    public void calcularViagem(Percurso p) {
        this.totalPercurso += (p.getKmPercorrido() / p.getValorCombustivel()) + p.getPedagio();
    }
}