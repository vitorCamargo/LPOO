//author Vitu
import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String[] args){
        
        Aluno alun1 = new Aluno(1, "Alessandra", "ale@gmail.com", true, "informatica", 20);
        Aluno alun2 = new Aluno(2, "Debora", "debs@gmail.com", true, "enfermagem",21);
        Aluno alun3 = new Aluno(3, "Dayane", "daya@gmail.com", true, "metlurgica", 25);
        Aluno alun4 = new Aluno(4, "Claudio", "sem_dedo@gmail.com", true, "quimica", 18);
        Aluno alun5 = new Aluno(5, "Angelo", "angelo@gmail.com", true, "informatica", 25);
        Aluno alun6 = new Aluno(6, "Vitória", "vitoria@gmail.com", true, "mineracao", 30);
        Aluno alun7 = new Aluno(7, "Graciela", "grazzy@gmail.com", true, "eletrotecnica", 19);
        Aluno alun8 = new Aluno(8, "Tais", "taiosa@gmail.com", true, "edificacoes", 21);
        Aluno alun9 = new Aluno(9, "Victor José", "vitao@gmail.com", true, "informatica", 18);
        Aluno alun10 = new Aluno(3, "Isadora", "miojo@gmail.com", true, "enfermagem", 27);
        
        Professor prof1 = new Professor(1, "Aquiles", "aquilesff@gmail.com", true, true, true);
        Professor prof2 = new Professor(1, "Daine", "daine@gmail.com", true, true, true);
        Professor prof3 = new Professor(1, "Gislene", "gig@gmail.com", true, true, true);
        
        Excursao e = new Excursao("Recife", "Praia - Sol - Passeio Turístico", true, 100, null);
        
        Transporte t = new Transporte("WanderLust", "Navio", 100);
        
        int op;

         do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, ""
                    + " 1 - Abrir uma Excursão"
                    + "\n 2 - Reservar Lugares"
                    + "\n 3 - Listar Passageiros"
                    + "\n 0 - Sair"
                    + "\nDigite opção:"));

            if (op ==0) break;

            switch(op) {

                case 1: 
                    e.abrirExcursao(prof1, t, e);
                break;
                
                case 2:
                    e.reservar(alun1, e);
                    e.reservar(alun2, e);
                    e.reservar(alun3, e);
                    e.reservar(alun4, e);
                    e.reservar(alun5, e);
                    e.reservar(alun6, e);
                    e.reservar(alun7, e);
                    e.reservar(alun8, e);
                    e.reservar(alun9, e);
                    e.reservar(alun10, e);
                    e.reservar(prof1, e);
                    e.reservar(prof2, e);
                    e.reservar(prof3, e);
                break;
                
                case 3: 
                    e.relacaoPassageiros(); 
                break;
                
                default: 
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
                break;
            }
        } while(true);
    }
}