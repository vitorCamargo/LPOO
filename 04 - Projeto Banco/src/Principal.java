import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        int op;
        int opr;
        
        Conta conta[] = new Conta[2];
        conta[0] = new ContaCorrente(1000, 5000);
        conta[1] = new ContaPoupanca(0.01, 5000);
        GerenciarContas gerenciar = new GerenciarContas(0);
        
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Menu: \n1 - Conta Corrente \n2 - Poupança \n3 - Ver Total dos Saldos \n0 - Sair" + "\nDigite uma opção:"));
            
            if(op == 0) {
                break;
            } else {
                switch(op) {
                    case 1:
                        do {
                            opr = Integer.parseInt(JOptionPane.showInputDialog("Menu: \n1 - Depositar \n2 - Sacar \n3 - Consultar Saldo \n4 - Reajustar Saldo \n 5 - Totalizar Saldo \n0 - Sair" + "\nDigite uma opção:"));
                            if(opr == 0) {
                                break;
                            } else {
                                switch(opr) {
                                    case 1:
                                        conta[0].creditar(Double.parseDouble(JOptionPane.showInputDialog("Quanto quer depositar:")));
                                    break;
                                    
                                    case 2:
                                        ((ContaCorrente)conta[0]).debitar();
                                    break;
                                        
                                    case 3:
                                       JOptionPane.showMessageDialog(null, conta[0].getSaldo());
                                    break;
                                        
                                    case 4:
                                       conta[0].atualizarSaldos();
                                    break;
                                    
                                    case 5:
                                        gerenciar.totalizarSaldos(conta[0]);
                                    break;
                                        
                                    default:
                                        JOptionPane.showMessageDialog(null, "Opção Inválida");
                                    break;
                                }
                            }
                        } while(true);
                    break;
                        
                    case 2:
                        do {
                            opr = Integer.parseInt(JOptionPane.showInputDialog("Menu: \n1 - Depositar \n2 - Sacar \n3 - Consultar Saldo \n4 - Reajustar Saldo \n5 - Totalizar Saldo \n0 - Sair" + "\nDigite uma opção:"));
                            
                            if(opr == 0) {
                                break;
                            } else {
                                switch(opr) {
                                    case 1:
                                        conta[1].creditar(Double.parseDouble(JOptionPane.showInputDialog("Quanto quer depositar:")));
                                    break;
                                    
                                    case 2:
                                        conta[1].debitar(Double.parseDouble(JOptionPane.showInputDialog("Quanto quer sacar:")));
                                    break;
                                        
                                    case 3:
                                        JOptionPane.showMessageDialog(null, conta[1].getSaldo());
                                    break; 
                                        
                                    case 4:
                                        if(conta[1] instanceof ContaPoupanca) {
                                           ContaPoupanca c = (ContaPoupanca)conta[1];
                                           c.atualizarSaldos(Double.parseDouble(JOptionPane.showInputDialog("Reajuste:")));
                                        }
                                    break;
                                        
                                    case 5:
                                        gerenciar.totalizarSaldos(conta[1]);
                                    break;
                                        
                                    default:
                                        JOptionPane.showMessageDialog(null, "Opção Inválida");
                                    break;
                                }
                            }
                        } while(true);
                    break;
                        
                    case 3:
                        gerenciar.totalizarSaldos(conta[0]);
                        gerenciar.totalizarSaldos(conta[1]);
                        JOptionPane.showMessageDialog(null, "O Saldo Total é de: " + gerenciar.getSaldoTotal());
                    break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Opção Inválida");
                    break;   
                }
            }
        } while(true);
    }
    
}