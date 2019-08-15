import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class FormTurma extends javax.swing.JFrame {

    public ArrayList<Curso> cursos = new ArrayList<>();
    
    public ArrayList<Aluno> alunos = new ArrayList<>();
    
    public Turma turma = new Turma(0, "", null, new ArrayList<>());
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    
    public FormTurma() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btGravar1 = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbCurso = new javax.swing.JComboBox();
        cbSala = new javax.swing.JComboBox();
        btAbreSala = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        gridTurmas = new javax.swing.JTable();
        cbAlunos = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btGravar1.setBackground(new java.awt.Color(240, 240, 241));
        btGravar1.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        btGravar1.setForeground(new java.awt.Color(51, 51, 51));
        btGravar1.setText("Adicionar Aluno");
        btGravar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        btGravar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravar1ActionPerformed(evt);
            }
        });

        btRemover.setBackground(new java.awt.Color(240, 240, 241));
        btRemover.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        btRemover.setForeground(new java.awt.Color(51, 51, 51));
        btRemover.setText("Remover Aluno");
        btRemover.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Selecionar Curso:");

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("Sala:");

        cbCurso.setFont(new java.awt.Font("Century Schoolbook", 0, 11)); // NOI18N
        cbCurso.setForeground(new java.awt.Color(51, 51, 51));
        cbCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCursoActionPerformed(evt);
            }
        });

        cbSala.setFont(new java.awt.Font("Century Schoolbook", 0, 11)); // NOI18N
        cbSala.setForeground(new java.awt.Color(51, 51, 51));
        cbSala.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1ºD", "2ºD", "3ºD", "1ºW", "2ºW", "3ºW" }));

        btAbreSala.setBackground(new java.awt.Color(240, 240, 241));
        btAbreSala.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        btAbreSala.setForeground(new java.awt.Color(51, 51, 51));
        btAbreSala.setText("Criar Sala");
        btAbreSala.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        btAbreSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbreSalaActionPerformed(evt);
            }
        });

        gridTurmas.setFont(new java.awt.Font("Century Schoolbook", 0, 11)); // NOI18N
        gridTurmas.setForeground(new java.awt.Color(51, 51, 51));
        gridTurmas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(gridTurmas);

        jLabel3.setText("Alunos Cadastrados:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btAbreSala, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(cbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbSala, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btGravar1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(cbAlunos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btAbreSala, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGravar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGravar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravar1ActionPerformed
        Aluno novo = alunos.get(cbAlunos.getSelectedIndex());
        
        boolean achou = procurar(String.valueOf(novo.getCod()));
        
        if(!achou) {
            turma.getChamada().add(novo);
            modelo.addRow(new Object[]{
                turma.getDecricao(),
                novo.getNome(),
                novo.getSituacao()
            });
        } else {
            JOptionPane.showMessageDialog(null, "Aluno já cadastrado na turma");
        }
    }//GEN-LAST:event_btGravar1ActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        int pos = gridTurmas.getSelectedRow();
        turma.getChamada().remove(pos);
        modelo.removeRow(pos);
    }//GEN-LAST:event_btRemoverActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lerCursos();
        
        modelo.addColumn("Sala");
        modelo.addColumn("Aluno");
        modelo.addColumn("Situação");
        gridTurmas.setModel(modelo);
        
        cbCurso = new JComboBox(new DefaultComboBoxModel(cursos.toArray()));
        
        for(Curso curso:cursos) {
            cbCurso.addItem(curso.getDescricao());
        }
        
        try {
            lerAlunos();
        } catch (ParseException ex) {
            Logger.getLogger(FormTurma.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(Aluno aluno:alunos) {
            cbAlunos.addItem(aluno.getNome());
        }
        
        cbAlunos.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void btAbreSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbreSalaActionPerformed
        Random r = new Random();
        int codigo = r.nextInt(65536);
        
        Turma t = new Turma(
            codigo,
            cbSala.getSelectedItem().toString(),
            cursos.get(cbCurso.getSelectedIndex()),
            new ArrayList<Aluno>()
        );
        
        JOptionPane.showMessageDialog(null, "Classe " + t.getDecricao() + " no curso " + t.getCurso().getDescricao() + 
                " criada com sucesso!!. Adicione alunos na sala");
        cbAlunos.setEnabled(true);
        turma = t;
    }//GEN-LAST:event_btAbreSalaActionPerformed

    private void cbCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCursoActionPerformed
    
    private boolean procurar(String cod){
        for(Aluno item: turma.getChamada()) {
            int num = Integer.parseInt(cod);
            
            if(item.getCod() == num) {
                return true;
            }
        }
        return false;
    }
    
    private void lerCursos() {
        try {
            FileReader arquivo = new FileReader("c://banco//cursos.txt");
            BufferedReader buffer = new BufferedReader(arquivo);
            String linha = buffer.readLine();
            
            while (linha != null) {
                String campos[] = new String[2];
                campos = linha.split(";");
                Curso curso  = new Curso(
                        Integer.parseInt(campos[0]),
                        campos[1]);
        
                cursos.add(curso);
        
                //adiciona o curso no JTable
                cbCurso.addItem(
                        curso.getDescricao()
                );
                linha = buffer.readLine(); // lê da segunda até a última linha
            }

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "erro ao abrir arquivo");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "erro ao ler arquivo");
        }
        
    }
    private void lerAlunos() throws ParseException {
        try {
            FileReader arquivo = new FileReader("c://banco//alunos.txt");
            BufferedReader buffer = new BufferedReader(arquivo);
            String linha = buffer.readLine();
            
            while (linha != null) {
                try {
                    String[] campos;
                    campos = linha.split(";");
                    Calendar nascimento = Calendar.getInstance();
                    DateFormat formatter ;
                    Date data ;
                    formatter = new SimpleDateFormat("dd/MM/yyyy");
                    data = (Date)formatter.parse(campos[2]);
                    nascimento.setTime(data);
                    
                    Aluno aluno = new Aluno(
                        Integer.parseInt(campos[0]),
                        campos[1], nascimento,
                        campos[3], campos[4],
                        campos[5], campos[6]
                    );

                    alunos.add(aluno);
                } catch (ParseException err) {
                    Logger.getLogger(FormTurma.class.getName()).log(Level.SEVERE, null, err);
                }
            
                linha = buffer.readLine();
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "erro ao ler arquivo");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "erro ao abrir arquivo");
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel( "com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(FormCurso.class.getName()).log(Level.SEVERE, null, ex);
                }
                new FormTurma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAbreSala;
    private javax.swing.JButton btGravar1;
    private javax.swing.JButton btRemover;
    private javax.swing.JComboBox cbAlunos;
    private javax.swing.JComboBox cbCurso;
    private javax.swing.JComboBox cbSala;
    private javax.swing.JTable gridTurmas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
