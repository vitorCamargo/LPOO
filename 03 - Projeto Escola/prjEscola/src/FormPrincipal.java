/* @author Vitor */
public class FormPrincipal extends javax.swing.JFrame {
    
    public FormPrincipal() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMenu = new javax.swing.JPanel();
        btAlunos = new javax.swing.JButton();
        btCursos = new javax.swing.JButton();
        btTurmas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnMenu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu do Sistema Escola", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Schoolbook", 0, 14), new java.awt.Color(51, 153, 255))); // NOI18N

        btAlunos.setBackground(new java.awt.Color(240, 240, 241));
        btAlunos.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        btAlunos.setForeground(new java.awt.Color(51, 51, 51));
        btAlunos.setText("Cadastro de Alunos");
        btAlunos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        btAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlunosActionPerformed(evt);
            }
        });

        btCursos.setBackground(new java.awt.Color(240, 240, 241));
        btCursos.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        btCursos.setForeground(new java.awt.Color(51, 51, 51));
        btCursos.setText("Cadastro de Cursos");
        btCursos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        btCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCursosActionPerformed(evt);
            }
        });

        btTurmas.setBackground(new java.awt.Color(240, 240, 241));
        btTurmas.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        btTurmas.setForeground(new java.awt.Color(51, 51, 51));
        btTurmas.setText("Cadastro de Turmas");
        btTurmas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        btTurmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTurmasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnMenuLayout = new javax.swing.GroupLayout(pnMenu);
        pnMenu.setLayout(pnMenuLayout);
        pnMenuLayout.setHorizontalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btTurmas, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                    .addComponent(btCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnMenuLayout.setVerticalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btTurmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTurmasActionPerformed
        FormTurma fr = new FormTurma();
        
        fr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        fr.setVisible(true);
    }//GEN-LAST:event_btTurmasActionPerformed

    private void btCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCursosActionPerformed
        FormCurso fr = new FormCurso();

        fr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        fr.setVisible(true);
    }//GEN-LAST:event_btCursosActionPerformed

    private void btAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlunosActionPerformed
        FormAluno fr = new FormAluno();

        fr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        fr.setVisible(true);
    }//GEN-LAST:event_btAlunosActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlunos;
    private javax.swing.JButton btCursos;
    private javax.swing.JButton btTurmas;
    private javax.swing.JPanel pnMenu;
    // End of variables declaration//GEN-END:variables
}