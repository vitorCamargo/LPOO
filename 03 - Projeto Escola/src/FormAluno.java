import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormAluno extends javax.swing.JFrame {
    
    public ArrayList<Aluno> alunos = new ArrayList<>();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public FormAluno() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtFone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNascimento = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        cbSituacao = new javax.swing.JComboBox();
        btGravar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        gridAlunos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("Nome do Aluno:");

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("Telefone:");

        txtCod.setFont(new java.awt.Font("Century Schoolbook", 0, 11)); // NOI18N
        txtCod.setForeground(new java.awt.Color(51, 51, 51));
        txtCod.setText("0");
        txtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodActionPerformed(evt);
            }
        });

        txtNome.setFont(new java.awt.Font("Century Schoolbook", 0, 11)); // NOI18N
        txtNome.setForeground(new java.awt.Color(51, 51, 51));

        txtFone.setFont(new java.awt.Font("Century Schoolbook", 0, 11)); // NOI18N
        txtFone.setForeground(new java.awt.Color(51, 51, 51));

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setText("Cidade:");

        txtCidade.setFont(new java.awt.Font("Century Schoolbook", 0, 11)); // NOI18N
        txtCidade.setForeground(new java.awt.Color(51, 51, 51));

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("Nascimento:");

        txtNascimento.setForeground(new java.awt.Color(51, 51, 51));
        txtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        txtNascimento.setFont(new java.awt.Font("Century Schoolbook", 0, 11)); // NOI18N
        txtNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNascimentoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 255));
        jLabel6.setText("Situação:");

        cbSituacao.setFont(new java.awt.Font("Century Schoolbook", 0, 11)); // NOI18N
        cbSituacao.setForeground(new java.awt.Color(51, 51, 51));
        cbSituacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ativo", "Desistente", "Evadido", "Transferido" }));

        btGravar.setBackground(new java.awt.Color(240, 240, 241));
        btGravar.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        btGravar.setForeground(new java.awt.Color(51, 51, 51));
        btGravar.setText("Gravar");
        btGravar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        btGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarActionPerformed(evt);
            }
        });

        btEditar.setBackground(new java.awt.Color(240, 240, 241));
        btEditar.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        btEditar.setForeground(new java.awt.Color(51, 51, 51));
        btEditar.setText("Editar");
        btEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btRemover.setBackground(new java.awt.Color(240, 240, 241));
        btRemover.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        btRemover.setForeground(new java.awt.Color(51, 51, 51));
        btRemover.setText("Remover");
        btRemover.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        gridAlunos.setFont(new java.awt.Font("Century Schoolbook", 0, 11)); // NOI18N
        gridAlunos.setForeground(new java.awt.Color(51, 51, 51));
        gridAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        gridAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gridAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(gridAlunos);

        jLabel7.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 255));
        jLabel7.setText("E-mail:");

        txtEmail.setFont(new java.awt.Font("Century Schoolbook", 0, 11)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(51, 51, 51));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtNome)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtFone, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtCidade)))
                    .addComponent(txtEmail)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbSituacao, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        modelo.addColumn("Código");
        modelo.addColumn("Nome");
        modelo.addColumn("Situação");
        gridAlunos.setModel(modelo);
        lerAlunos();
    }//GEN-LAST:event_formWindowOpened

    private void txtNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNascimentoActionPerformed
        
    }//GEN-LAST:event_txtNascimentoActionPerformed

    private void btGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarActionPerformed
        try {
            Calendar nascimento = Calendar.getInstance();
            DateFormat formatter;
            Date data;
            
            formatter = new SimpleDateFormat("dd/MM/yyyy");
            data = (Date) formatter.parse(txtNascimento.getText());
            JOptionPane.showMessageDialog(null, data.toString());
            nascimento.setTime(data);
            Aluno aluno = new Aluno(
                            Integer.parseInt(txtCod.getText()),
                            txtNome.getText(),
                            nascimento,
                            txtFone.getText(),
                            txtCidade.getText(),
                            txtEmail.getText(),
                            cbSituacao.getModel().getSelectedItem().toString()
                        );
            
            if(verificaAluno(aluno)) {
                JOptionPane.showMessageDialog(null, "Aluno já Cadastrado");
                return ;
            }
            alunos.add(aluno);
            
            JOptionPane.showMessageDialog(null, "Aluno Cadastrado");
            
            modelo.addRow(new Object[]{
                aluno.getCod(),
                aluno.getNome(),
                aluno.getSituacao()
            });
            
            txtCod.setText("0");
            txtNome.setText("");
            txtCidade.setText("");
            txtFone.setText("");
            txtEmail.setText("");
            txtNascimento.setText("");
            cbSituacao.setSelectedIndex(0);
            txtCod.requestFocus();
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e.getMessage());
        } catch (ParseException e){
            
        }
    }//GEN-LAST:event_btGravarActionPerformed
    
    private boolean verificaAluno(Aluno a) {
        return alunos.stream().anyMatch((item) -> (item.getCod() == a.getCod()));
    }
    
    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        if(gridAlunos.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Nenhum Aluno Selecionado");
            return ;
        }
        Aluno a = procurar(gridAlunos.getValueAt(gridAlunos.getSelectedRow(), 0).toString());
        
        if(a != null) {
            alunos.remove(a);
            
            modelo.removeRow(gridAlunos.getSelectedRow());
            JOptionPane.showMessageDialog(null, "Aluno Removido com Sucesso");
            
            txtCod.setText("0");
            txtNome.setText("");
            txtCidade.setText("");
            txtFone.setText("");
            txtEmail.setText("");
            txtNascimento.setText("");
            cbSituacao.setSelectedIndex(0);
            txtCod.requestFocus();
        }
    }//GEN-LAST:event_btRemoverActionPerformed
    
    private Aluno procurar(String cod) {
        for(Aluno item: alunos) {
            int num = Integer.parseInt(cod);
            if(item.getCod() == num)
                return item;
        }
        return null;
    }

    private void gridAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridAlunosMouseClicked
        Aluno e = procurar(gridAlunos.getValueAt(gridAlunos.getSelectedRow(), 0).toString());
        
        if(e != null) {
            txtCod.setText(String.valueOf(e.getCod()));
            txtNome.setText(e.getNome());
            txtCidade.setText(e.getCidade());
            txtFone.setText(e.getTelefone());
            txtEmail.setText(e.getEmail());
            
            SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
            txtNascimento.setText(s.format(e.getNascimento().getTime()));
            
            cbSituacao.setSelectedItem(e.getSituacao());
        }
    }//GEN-LAST:event_gridAlunosMouseClicked

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        if(gridAlunos.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Nenhum Aluno Selecionado");
            return ;
        }
        Aluno a = procurar(gridAlunos.getValueAt(gridAlunos.getSelectedRow(), 0).toString());
        
        if(a != null) {
            a.setNome(txtNome.getText());
            a.setEmail(txtEmail.getText());
            a.setCidade(txtCidade.getText());
            a.setTelefone(txtFone.getText());
            a.setSituacao(cbSituacao.getSelectedItem().toString());
            Calendar nascimento = Calendar.getInstance();
            
            try {
                DateFormat formatter;
                Date data;
                
                formatter = new SimpleDateFormat("dd/MM/yyyy");
                data = (Date) formatter.parse(txtNascimento.getText());
                nascimento.setTime(data);
            } catch(ParseException e){
                
            }
            
            gridAlunos.setValueAt(a.getNome(), gridAlunos.getSelectedRow(), 1);
            gridAlunos.setValueAt(a.getSituacao(), gridAlunos.getSelectedRow(), 2);
            JOptionPane.showMessageDialog(null, "Aluno Editado com Sucesso");
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        salvarAlunos();
    }//GEN-LAST:event_formWindowClosing
    
    private void lerAlunos() {
        try {
            FileReader arquivo = new FileReader("c://banco//alunos.txt");
            BufferedReader buffer = new BufferedReader(arquivo);
            String linha = buffer.readLine();
            
            while (linha != null) {
                String campos[] = new String[6];
                campos = linha.split(";");
                Calendar nascimento = Calendar.getInstance();
            
                try {
                    DateFormat formatter;
                    Date data;
                
                    formatter = new SimpleDateFormat("dd/MM/yyyy");
                    data = (Date) formatter.parse(campos[2]);
                    nascimento.setTime(data);
                } catch(ParseException e){
                
                }
                
                Aluno aluno  = new Aluno(
                        Integer.parseInt(campos[0]),
                        campos[1], nascimento, campos[3], campos[4], campos[5], campos[6]);
        
                alunos.add(aluno);
        
                //adiciona o curso no JTable
                modelo.addRow(new Object[] {
                        aluno.getCod(),
                        aluno.getNome(),
                        aluno.getSituacao()
                });
                linha = buffer.readLine(); // lê da segunda até a última linha
            }

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "erro ao abrir arquivo");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "erro ao ler arquivo");
        }
        
    }
    
    private void salvarAlunos() {
        try {
            FileWriter arquivo = new FileWriter("c://banco//alunos.txt");
            
            BufferedWriter buffer = new BufferedWriter(arquivo);
            
            for(Aluno item: alunos) {
                  SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
                String nasc = s.format(item.getNascimento().getTime());
                String linha = String.valueOf(item.getCod()) + ";" +
                                            item.getNome() + ";" + 
                                            nasc + ";" +
                                            item.getTelefone() + ";" +
                                            item.getCidade() + ";" +
                                            item.getEmail() + ";" +
                                            item.getSituacao();
                                            
                                            buffer.write(linha);
                                            
                                            buffer.newLine();
            }
            buffer.close();
        } catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Erro ao Ler o Arquivo");
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null, "Erro ao Abrir o Arquivo");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btGravar;
    private javax.swing.JButton btRemover;
    private javax.swing.JComboBox cbSituacao;
    private javax.swing.JTable gridAlunos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFone;
    private javax.swing.JFormattedTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}