import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class FormCurso extends javax.swing.JFrame {

    public ArrayList<Curso> cursos = new ArrayList<>();
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    public FormCurso() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCodigo = new javax.swing.JLabel();
        lbDescricao = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        gridCursos = new javax.swing.JTable();
        btEditar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbCodigo.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        lbCodigo.setForeground(new java.awt.Color(51, 153, 255));
        lbCodigo.setText("Código do Curso:");

        lbDescricao.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        lbDescricao.setForeground(new java.awt.Color(51, 153, 255));
        lbDescricao.setText("Descrição do Curso:");

        txtDescricao.setFont(new java.awt.Font("Century Schoolbook", 0, 11)); // NOI18N
        txtDescricao.setForeground(new java.awt.Color(51, 51, 51));
        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        txtCodigo.setFont(new java.awt.Font("Century Schoolbook", 0, 11)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(51, 51, 51));
        txtCodigo.setText("0");
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        btSalvar.setBackground(new java.awt.Color(240, 240, 241));
        btSalvar.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        btSalvar.setForeground(new java.awt.Color(51, 51, 51));
        btSalvar.setText("Salvar Curso");
        btSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        jScrollPane1.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        gridCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        gridCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gridCursosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(gridCursos);

        btEditar.setBackground(new java.awt.Color(240, 240, 241));
        btEditar.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        btEditar.setForeground(new java.awt.Color(51, 51, 51));
        btEditar.setText("Editar Curso");
        btEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btRemover.setBackground(new java.awt.Color(240, 240, 241));
        btRemover.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        btRemover.setForeground(new java.awt.Color(51, 51, 51));
        btRemover.setText("Remover Curso");
        btRemover.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtDescricao)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDescricao)
                            .addComponent(lbCodigo))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(lbDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(347, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        try {
            Curso curso = new Curso(
                            Integer.parseInt(txtCodigo.getText()),
                            txtDescricao.getText());
            
            if(verificarCurso(curso)) {
                JOptionPane.showMessageDialog(null, "Curso já Cadastrado");
                return;
            }
            
            cursos.add(curso);
            
            JOptionPane.showMessageDialog(null, "Curso Cadastrado");
            
            modelo.addRow(new Object[]{
                curso.getCod(),
                curso.getDescricao()
            });
            
            txtCodigo.setText("0");
            txtDescricao.setText("");
            txtCodigo.requestFocus();
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar: " + e.getMessage());
        }
    }//GEN-LAST:event_btSalvarActionPerformed
    
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        modelo.addColumn("Código");
        modelo.addColumn("Descrição");
        gridCursos.setModel(modelo);
        lerCursos();
    }//GEN-LAST:event_formWindowOpened

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked

    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        if(gridCursos.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Nenhum Curso Selecionado");
            return ;
        }
        
        Curso c = procurar(gridCursos.getValueAt(gridCursos.getSelectedRow(), 0).toString());
        
        if(c != null) {
            c.setDescricao(txtDescricao.getText());
            
            gridCursos.setValueAt(c.getDescricao(), gridCursos.getSelectedRow(), 1);
            JOptionPane.showMessageDialog(null, "Curso Editado com Sucesso");
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        if(gridCursos.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Nenhum Curso Selecionado");
            return ;
        }
        
        Curso c = procurar(gridCursos.getValueAt(gridCursos.getSelectedRow(), 0).toString());
        
        if(c != null) {
            cursos.remove(c);
            modelo.removeRow(gridCursos.getSelectedRow());
            JOptionPane.showMessageDialog(null, "Curso Removido com Sucesso");
            
            txtCodigo.setText("0");
            txtDescricao.setText("");
            txtCodigo.requestFocus();
        }
    }//GEN-LAST:event_btRemoverActionPerformed

    private void gridCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridCursosMouseClicked
        Curso c = procurar(gridCursos.getValueAt(gridCursos.getSelectedRow(), 0).toString());
        
        if(c != null) {
            txtCodigo.setText(String.valueOf(c.getCod()));
            txtDescricao.setText(String.valueOf(c.getDescricao()));
        }
    }//GEN-LAST:event_gridCursosMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        salvarCursos();
    }//GEN-LAST:event_formWindowClosing
    
    private boolean verificarCurso(Curso c) {
        return cursos.stream().anyMatch((item) -> (item.getCod()) == c.getCod());
    }
    
    private Curso procurar(String cod) {
        for(Curso item: cursos) {
            int num = Integer.parseInt(cod);
            
            if(item.getCod() == num) {
                return item;
            }
        }
        return null;
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
                modelo.addRow(new Object[] {
                        curso.getCod(),
                        curso.getDescricao()
                });
                linha = buffer.readLine(); // lê da segunda até a última linha
            }

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "erro ao abrir arquivo");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "erro ao ler arquivo");
        }
        
    }
    
    private void salvarCursos() {
        try {
            FileWriter arquivo = new FileWriter("c://banco//cursos.txt");
            
            BufferedWriter buffer = new BufferedWriter(arquivo);
            
            for(Curso item: cursos) {
                String linha = String.valueOf(item.getCod()) + ";" +
                                            item.getDescricao();
                                            
                                            buffer.write(linha);
                                            
                                            buffer.newLine();
            }
            buffer.close();
        } catch(FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Ler o Arquivo");
        } catch(IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Abrir o Arquivo");
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
            java.util.logging.Logger.getLogger(FormCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FormCurso().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btRemover;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTable gridCursos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescricao;
    // End of variables declaration//GEN-END:variables
}
