
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Form1 extends JFrame{

    public Form1(String title) throws HeadlessException {
        super("Formulário - Média");
        JButton btCalcular = new JButton("Calcular");
        JTextField txtA = new JTextField("0");
        JTextField txtB = new JTextField("0");
        JLabel lbA = new JLabel("Valor A:");
        JLabel lbB = new JLabel("Valor B:");
        JPanel p =new JPanel();
        p.setLayout(null);
        this.add(p);
        lbA.setBounds(10, 0, 100, 20); txtA.setBounds(10, 20, 200, 20);
        lbB.setBounds(10, 40, 100, 20); txtB.setBounds(10, 60, 200, 20);
        btCalcular.setBounds(10, 100, 200, 20);
        p.add(lbA);
        p.add(lbB);
        p.add(txtA);
        p.add(txtB);
        p.add(btCalcular);
        btCalcular.addActionListener((ActionEvent e ) -> {
           double a = Double.parseDouble(txtA.getText());
           double b = Double.parseDouble(txtB.getText());
           Media m = new Media(a, b);
            JOptionPane.showMessageDialog(null, " Média Aritimética= "+ m.calcular() +"\n Geométrica= "+ m.geometrica() +"\n Harmônica= "+ m.harmonica());
        });
        this.setSize(600, 300);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
    }
   

}
