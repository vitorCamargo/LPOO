import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class Form1 extends javax.swing.JFrame {
    
    static Comanda[] mesas;
    static int numMesa = 0;
    
    static ArrayList<Item> cardapio;
    DefaultTableModel modelo = new DefaultTableModel();
    
    public Form1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbCardapio = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cbNumMesa = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        gridPedidos = new javax.swing.JTable();
        btAdd = new javax.swing.JButton();
        btDel = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Cardapio:");
        jLabel1.setName("jLabel1"); // NOI18N
        jLabel1.setOpaque(true);

        cbCardapio.setBackground(new java.awt.Color(0, 153, 51));
        cbCardapio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbCardapio.setName("cbCardapio"); // NOI18N

        jLabel2.setText("Número da Mesa:");

        cbNumMesa.setName("cbNumMesa"); // NOI18N
        cbNumMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNumMesaActionPerformed(evt);
            }
        });

        gridPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(gridPedidos);

        btAdd.setText("Adicionar");
        btAdd.setName("btName"); // NOI18N
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btDel.setText("Remover");
        btDel.setName("btDel"); // NOI18N
        btDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelActionPerformed(evt);
            }
        });

        btFechar.setText("Fechar Mesa");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbCardapio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btAdd)
                                .addGap(18, 18, 18)
                                .addComponent(btDel)
                                .addGap(18, 18, 18)
                                .addComponent(btFechar))
                            .addComponent(cbNumMesa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbNumMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdd)
                    .addComponent(btDel)
                    .addComponent(btFechar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        int op = cbCardapio.getSelectedIndex();
        Item i = (Item) cardapio.get(op);
        i.consumo(Integer.parseInt(JOptionPane.showInputDialog("Quantidade")));
        mesas[numMesa].adicionar(i);
        JOptionPane.showMessageDialog(null, "Pedido Cadastrado...");
        int pos = mesas[numMesa].getPedidos().size();
        modelo.addRow(new Object[]{pos, i.getDescricao(), i.getTotal()});
    }//GEN-LAST:event_btAddActionPerformed

    private void cbNumMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNumMesaActionPerformed
        numMesa = cbNumMesa.getSelectedIndex();
        int o = this.numMesa;
        modelo.setNumRows(0);
        if(mesas[numMesa] == null) {
            mesas[numMesa] = new Comanda(new ArrayList<Item>(), 0);
            JOptionPane.showMessageDialog(null, "Mesa Aberta");
        } else {
            JOptionPane.showMessageDialog(null, "Mesa Selecionada");
            
            if(mesas[numMesa].getPedidos() != null) {
                int i = 1;
                for(Item p: mesas[numMesa].getPedidos()) {
                    modelo.addRow(new Object[]{i++, o, p.getDescricao(), p.getTotal()});
                }
            }
        }
    }//GEN-LAST:event_cbNumMesaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cardapio = new ArrayList<>();
        cardapio.add(new Item(1, "Cerveja", 5.4));
        cardapio.add(new Item(2, "Refrigerante Lata", 2.3));
        cardapio.add(new Item(3, "Suco Natural", 2.3));
        cardapio.add(new Item(4, "Porção Batata", 10));
        cardapio.add(new Item(5, "Porção Salame", 12));
        cardapio.add(new Item(6, "Pizza Média", 21));
        cardapio.add(new Item(7, "Prato Comercial", 9.5));
        cardapio.add(new Item(8, "Macarronada Italiana", 14));
        cardapio.add(new Item(9, "Strogonoff de Carne", 17));
        cardapio.add(new Item(10, "Petit Gauteau", 19));
        cardapio.add(new Item(11, "Café Expresso Grande", 4.2));
        
        mesas = new Comanda[15];
        
        modelo.addColumn("n°");
        modelo.addColumn("Descrição");
        modelo.addColumn("Total");
        gridPedidos.setModel(modelo);
        
        for(Item p: cardapio) {
            cbCardapio.addItem(p.getDescricao() + " - R$ " + p.getPreco());
        }
        for(int i = 0; i < 15; i++) {
            cbNumMesa.addItem("Mesa n° " + (i + 1));
        }
    }//GEN-LAST:event_formWindowOpened

    private void btDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDelActionPerformed
        int op = gridPedidos.getSelectedRow();
        Item i = (Item) cardapio.get(op);
        JOptionPane.showMessageDialog(null, "Pedido Removido...");
        
        modelo.removeRow(op);
        mesas[numMesa].remover(i);
    }//GEN-LAST:event_btDelActionPerformed

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        numMesa = cbNumMesa.getSelectedIndex();
        
        mesas[numMesa].fechar();
        JOptionPane.showMessageDialog(null, "O total da mesa " + (numMesa + 1) + " é de: " + mesas[numMesa].getTotal());
        modelo.setNumRows(0);
        mesas[numMesa] = null;
    }//GEN-LAST:event_btFecharActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel( "com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Form1.class.getName()).log(Level.SEVERE, null, ex);
                }
                new Form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDel;
    private javax.swing.JButton btFechar;
    private javax.swing.JComboBox cbCardapio;
    private javax.swing.JComboBox cbNumMesa;
    private javax.swing.JTable gridPedidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
