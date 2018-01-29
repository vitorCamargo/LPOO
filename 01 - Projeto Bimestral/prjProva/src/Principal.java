import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        int op = 0;
        Triangulo t = new Triangulo(0, 0, 0);
        
        do {
            op = menu();
            switch(op){
                case 1:
                    t.setA(Double.parseDouble(JOptionPane.showInputDialog("Digite o lado A: ")));
                    t.setB(Double.parseDouble(JOptionPane.showInputDialog("Digite a Base: ")));
                    t.setC(Double.parseDouble(JOptionPane.showInputDialog("Digite o lado C: ")));
                break;
                case 2:
                    double alt = Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura do triângulo: "));
                    JOptionPane.showMessageDialog(null, "A area do triângulo é: " + t.area(alt));
                break;
                case 3:
                    JOptionPane.showMessageDialog( null, "O Perímetro deste triângulo é: " + t.perimetro());
                break;
                case 4:
                    JOptionPane.showMessageDialog(null, "O tipo deste triângulo é: " + t.tipo());
                break;    
                case 5:
                    t.sair();
                break;
                default:
                    menu();
                break;    
            }
        } while (op != 5);
        JOptionPane.showMessageDialog(null, "Programa desenvolvido por"
            +"\n[ Isadora D'Angelo,  n°20 ]"
            +"\n[ Vitor Bueno, n°37 ]");    
    }
    
    private static int menu() {
        return Integer.parseInt(JOptionPane.showInputDialog(
                        "\n Tabela de Calculos(Triângulos):"
                        + "\n1- Preencher lados a,b e c"
                        + "\n2- Calcular Área"
                        + "\n3- Calcular Perímetro"
                        + "\n4- Tipo do Triângulo"
                        + "\n5- Sair"
        ));
    }
}