import javax.swing.JOptionPane;

public class Principal {
    static Atleta[] lista;
    static int pos = 0;
    
public static void main(String[] args) {
    
    lista = new Atleta[10];
    int op;
           
    do{
        op = menu();
            
        switch(op){
            case 1:
                cadastrar();
            break;
            case 2:
                pesquisar();
            break;
            case 3:
                excluir();
            break;
            case 4:
                relatorio();
            break;
            case 5:
                JOptionPane.showMessageDialog(null, "Obrigado por usar o programa"); 
            break;
        }
    } while(op!=5);
}
    
    private static int menu() {
        return Integer.parseInt(JOptionPane.showInputDialog("Menu:\n"
                                    + "\n1 - Cadastrar Atleta"
                                    + "\n2 - Pesquisar Atleta"
                                    + "\n3 - Excluir Atleta"
                                    + "\n4 - Relatório"
                                    + "\n5 - Sair"
                                ));
    }
    
    private static void excluir() {
        int p = Integer.parseInt(JOptionPane.showInputDialog("Número Registro"));
        
        if(p < 10) {
            lista[p] = null;
            JOptionPane.showMessageDialog(null, "Registro Excluído");
        }
    }
    
    private static void relatorio() {
        for(Atleta a:lista) {
            if(a != null) {
                JOptionPane.showMessageDialog(null, "Atleta\n"
                                                + "\nNome: " + a.getNome()
                                                + "\nPeso: " + a.getPeso()
                                                + "\nAltura: " + a.getAltura()
                                                + "\nIMC: " + a.imc()
                                            );
            }
        }
    }
    
    private static void cadastrar() {
        if(pos == 10) {
            JOptionPane.showMessageDialog(null, "lista está cheia!");
            return;
        }
        
        Atleta novo = new Atleta("", 0.0, 0.0 );
        
        novo.setNome(JOptionPane.showInputDialog("Digite o Nome: "));
        novo.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite Peso: ")));
        novo.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite Altura: ")));
        
        lista[pos] = novo;
        pos++;
        
        JOptionPane.showMessageDialog(null, "Atleta cadastrado com sucesso...");
    }
    private static void pesquisar() {
        int p = Integer.parseInt(JOptionPane.showInputDialog("Posição: "));
        
        if(lista[p] != null && p >= 0 && p < 10) {
            Atleta a = lista[p];
            JOptionPane.showMessageDialog(null, "Atleta\n"
                                            + "\nNome: " + a.getNome()
                                            + "\nPeso: " + a.getPeso()
                                            + "\nAltura: " + a.getAltura()
                                            + "\nIMC: " + a.imc());
        }   
    }
}
