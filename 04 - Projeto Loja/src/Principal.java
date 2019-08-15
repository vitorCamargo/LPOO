import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        
        GerenciadorEstoques g = new GerenciadorEstoques();
        
        Produto produto[] = new Produto[3];
        produto[0] = new Livro("José de Alencar", "Saraiva", "Sexta Edição", "A Mão e a Luva", "Romance", 10, 48.60, 6.70);
        produto[1] = new Cd("José de Chico Buarque", "Record", "Brasil", "Chico e Amigos", "MPB", 30, 23.90, 9.70);
        produto[2] = new Dvd("Noah Share", "45 minutos", "16 anos", "House MD SD1", "Seriado", 8, 59.90, 3.50);
        
        int menu;
        int op;
        
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Menu: \n1 - Livro \n2 - CD \n3 - DVD \n0 - Sair" + "\nDigite uma opção:"));
            
            if(op == 0) {
                break;
            } else {
                switch(op) {
                    case 1:
                        do {
                            menu = Integer.parseInt(JOptionPane.showInputDialog("MENU \n1 - Comprar Livro \n2 - Vender Livro \n3 - Encomendar Livro \n4 - Listar Produto \n0 - Sair \nDigite uma opção abaixo"));
                            if(menu == 0) {
                                break;
                            } else {
                                switch(menu) {
                                    case 1:
                                        String autor = JOptionPane.showInputDialog("Digite o nome do Autor: ");
                                        String editora = JOptionPane.showInputDialog("Digite o nome da Editora: ");
                                        String edicao = JOptionPane.showInputDialog("Digite o nome da Edição: ");
                                        String descricao = JOptionPane.showInputDialog("Digite uma descrição: ");
                                        String genero = JOptionPane.showInputDialog("Digite o genêro da obra: ");
                                        Double precoCompra = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço Pago: "));
                                        
                                        produto[0] = new Livro(autor, editora, edicao, descricao, genero, produto[0].getEstoqueDisponivel(), precoCompra, precoCompra + precoCompra * 0.15);
                                        
                                        g.comprar(produto[0]);
                                        
                                    break;
                                    
                                    case 2:
                                        g.vender(produto[0]);
                                    break;
                                        
                                    case 3:
                                        g.encomendar(produto[0]);
                                    break;
                                        
                                    case 4:
                                        produto[0].calcularPrecoVenda();
                                        produto[0].listarProduto();
                                    break;
                                    
                                    default:
                                        JOptionPane.showMessageDialog(null, "Opção Inválida");
                                    break;
                                }
                            }
                        } while(menu != 0);
                        
                    break;
                        
                    case 2:
                        do {
                            menu = Integer.parseInt(JOptionPane.showInputDialog("MENU \n1 - Comprar CD \n2 - Vender CD \n3 - Encomendar CD \n4 - Listar Produto \n0 - Sair \nDigite uma opção abaixo"));
                            if(menu ==  0) {
                                break;
                            } else {
                                switch(menu) {
                                    case 1:
                                        String artista = JOptionPane.showInputDialog("Digite o nome do Artista: ");
                                        String gravadora = JOptionPane.showInputDialog("Digite o nome da Gravadora: ");
                                        String pais = JOptionPane.showInputDialog("Digite o país de Origem: ");
                                        String descricao = JOptionPane.showInputDialog("Digite uma descrição: ");
                                        String genero = JOptionPane.showInputDialog("Digite o genêro da obra: ");
                                        Double precoCompra = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço Pago: "));
                                        Double pcLucro = Double.parseDouble("Digite o percentual de lucro: ");
                                        
                                        produto[1] = new Cd(artista, gravadora, pais, descricao, genero, produto[0].getEstoqueDisponivel(), precoCompra, precoCompra + precoCompra * pcLucro / 100);
                                        
                                        g.comprar(produto[1]);
                                    break;
                                    
                                    case 2:
                                        g.vender(produto[1]);
                                    break;
                                        
                                    case 3:
                                        g.encomendar(produto[1]);
                                    break;
                                        
                                    case 4:
                                        ((Cd)produto[1]).calcularPrecoVenda(Double.parseDouble("Digite o percentual de lucro: "));
                                        produto[1].listarProduto();
                                    break;
                                    
                                    default:
                                        JOptionPane.showMessageDialog(null, "Opção Inválida");
                                    break;
                                }
                            }
                        } while(menu != 0);
                    break;
                        
                    case 3:
                        do {
                            menu = Integer.parseInt(JOptionPane.showInputDialog("MENU \n1 - Comprar Livro \n2 - Vender Livro \n3 - Encomendar Livro \n4 - Listar Produto \n0 - Sair \nDigite uma opção abaixo"));
                            if(menu == 0) {
                                break;
                            } else {
                                switch(menu) {
                                    case 1:
                                        String diretor = JOptionPane.showInputDialog("Digite o nome do Diretor: ");
                                        String duracao = JOptionPane.showInputDialog("Digite a Duração: ");
                                        String censura = JOptionPane.showInputDialog("Digite a Censura: ");
                                        String descricao = JOptionPane.showInputDialog("Digite uma descrição: ");
                                        String genero = JOptionPane.showInputDialog("Digite o genêro da obra: ");
                                        Double precoCompra = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço Pago: "));
                                        Double pcLucro = Double.parseDouble("Digite o percentual de lucro: ");
                                        Double cotacaoDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação do Dolar: "));
                                        
                                        produto[2] = new Dvd(diretor, duracao, censura, descricao, genero, produto[0].getEstoqueDisponivel(), precoCompra, precoCompra + (precoCompra * cotacaoDolar) * pcLucro / 100);
                                                                                
                                        g.comprar(produto[2]);
                                    break;
                                    
                                    case 2:
                                        g.vender(produto[2]);
                                    break;
                                        
                                    case 3:
                                        g.encomendar(produto[2]);
                                    break;
                                        
                                    case 4:
                                        ((Dvd)produto[2]).calcularPrecoVenda(Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de lucro: ")), Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação do Dolar: ")));
                                        produto[2].listarProduto();
                                    break;
                                        
                                    default:
                                        JOptionPane.showMessageDialog(null, "Opção Inválida");
                                    break;
                                }
                            }
                        } while(menu != 0);
                    break;
                    
                    default:
                        JOptionPane.showMessageDialog(null, "Opção Inválida");
                    break;   
                }
            }
        } while(true);
    }
}