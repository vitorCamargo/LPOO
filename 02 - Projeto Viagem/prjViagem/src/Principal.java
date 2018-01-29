import javax.swing.JOptionPane;

public class Principal {
    
    static Percurso[] lista;
    static Custos viagem;
    static int pos = 0;
    
    public static void main(String[] args) {
        
        lista = new Percurso[10];
        viagem = new Custos(0);
        
        int op;
        
        do {
            op = menu();
            
            switch(op){
                case 1:
                    cadastrar();
                break;
                case 2:
                    exibir();
                break;
                case 3:
                    calcular();
                break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Programa feito por:\n"
                                                        + "[ Vitor Bueno | n° 37]\n"
                                                        + "[ Isadora d'Angelo | n° 20]");
                break;
            }
        } while(op != 0);
    }
    
    private static int menu() {
        return Integer.parseInt(JOptionPane.showInputDialog("Menu:\n"
                                    + "\n1 - Cadastrar Percurso"
                                    + "\n2 - Exibir Percurso"
                                    + "\n3 - Calcular Viagem"
                                    + "\n0 - Sair"
                                ));
    }
    
    private static void cadastrar() {
        if(pos == 11) {
            JOptionPane.showMessageDialog(null, "Lista está cheia!");
        } else {
            Percurso pe = new Percurso(0, 0, 0);
            pe.cadastrarPercurso();
            viagem.calcularViagem(pe);
            lista[pos] = pe;
            pos++;
        }
    }
    
    private static void exibir() {
        int i = Integer.parseInt(JOptionPane.showInputDialog("Posição: "));
              
        Percurso pe = lista[i];
        pe.listarPercurso();   
    }
    
    private static void calcular(){
        JOptionPane.showMessageDialog(null, "O valor total da viagem é: " +
                viagem.getTotalPercurso()
        );
    }       
}