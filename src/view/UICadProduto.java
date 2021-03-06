package view;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import model.Produto;

/**
 *
 * @author Davi, Maria Rita
 * @since 20/03
 * @version 1.0
 */
public class UICadProduto extends javax.swing.JFrame {
    private static final Produto p = new Produto();

    /**
     * Creates new form UICadProduto
     */
    public UICadProduto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipo = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jlNome = new javax.swing.JLabel();
        jlValor = new javax.swing.JLabel();
        jlTipo = new javax.swing.JLabel();
        jlQuantidade = new javax.swing.JLabel();
        jrAlimento = new javax.swing.JRadioButton();
        jrLimpeza = new javax.swing.JRadioButton();
        jrVestimenta = new javax.swing.JRadioButton();
        jtNome = new javax.swing.JTextField();
        jtValor = new javax.swing.JTextField();
        jtQuantidade = new javax.swing.JTextField();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jbCadastrar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlNome.setText("Nome");

        jlValor.setText("Valor");

        jlTipo.setText("Tipo");

        jlQuantidade.setText("Quantidade");

        bgTipo.add(jrAlimento);
        jrAlimento.setText("Alimento");
        jrAlimento.setActionCommand("Alimento");
        jrAlimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jrAlimentoKeyPressed(evt);
            }
        });

        bgTipo.add(jrLimpeza);
        jrLimpeza.setText("Limpeza");
        jrLimpeza.setActionCommand("Limpeza");
        jrLimpeza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jrLimpezaKeyPressed(evt);
            }
        });

        bgTipo.add(jrVestimenta);
        jrVestimenta.setText("Vestimenta");
        jrVestimenta.setActionCommand("Vestimenta");
        jrVestimenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jrVestimentaKeyPressed(evt);
            }
        });

        jtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtNomeKeyPressed(evt);
            }
        });

        jtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtValorKeyPressed(evt);
            }
        });

        jtQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtQuantidadeKeyPressed(evt);
            }
        });

        jLayeredPane1.setLayer(jlNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlValor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlTipo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlQuantidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jrAlimento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jrLimpeza, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jrVestimenta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtValor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtQuantidade, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jlTipo)
                        .addGap(18, 18, 18)
                        .addComponent(jrAlimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrLimpeza)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrVestimenta))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlValor)
                            .addComponent(jlQuantidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(jtValor)
                            .addComponent(jtNome)))
                    .addComponent(jlNome))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlValor)
                    .addComponent(jtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlQuantidade)
                    .addComponent(jtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTipo)
                    .addComponent(jrAlimento)
                    .addComponent(jrLimpeza)
                    .addComponent(jrVestimenta))
                .addGap(28, 28, 28))
        );

        jLayeredPane2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });
        jbCadastrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbCadastrarKeyPressed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });
        jbLimpar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbLimparKeyPressed(evt);
            }
        });

        jLayeredPane2.setLayer(jbCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jbCadastrar)
                .addGap(77, 77, 77)
                .addComponent(jbLimpar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrar)
                    .addComponent(jbLimpar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane2)
                    .addComponent(jLayeredPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLayeredPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void cadastrar(){
        p.setNomeProduto(jtNome.getText());
        p.setValorProduto(Double.parseDouble(jtValor.getText()));
        p.setQtdProduto(Integer.parseInt(jtQuantidade.getText()));
        p.setTipoProduto(bgTipo.getSelection().getActionCommand());
        
        JOptionPane.showMessageDialog(rootPane, p.toString());
    }
    
    private void limpar(){
        jtNome.setText("");
        jtValor.setText("");
        jtQuantidade.setText("");
        bgTipo.clearSelection();
    }
    
    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
       cadastrar();
       limpar();
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbCadastrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbCadastrarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cadastrar();
            limpar();     
        }
    }//GEN-LAST:event_jbCadastrarKeyPressed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limpar();     
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbLimparKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbLimparKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            limpar();     
        }
    }//GEN-LAST:event_jbLimparKeyPressed

    private void jtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtValor.grabFocus();
        }
    }//GEN-LAST:event_jtNomeKeyPressed

    private void jtValorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtValorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jtQuantidade.grabFocus();
        }
    }//GEN-LAST:event_jtValorKeyPressed

    private void jtQuantidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtQuantidadeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jrAlimento.grabFocus();
        }
    }//GEN-LAST:event_jtQuantidadeKeyPressed

    private void jrAlimentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jrAlimentoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jrLimpeza.grabFocus();
        }
    }//GEN-LAST:event_jrAlimentoKeyPressed

    private void jrLimpezaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jrLimpezaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jrVestimenta.grabFocus();
        }
    }//GEN-LAST:event_jrLimpezaKeyPressed

    private void jrVestimentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jrVestimentaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jbCadastrar.grabFocus();
        }
    }//GEN-LAST:event_jrVestimentaKeyPressed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(UICadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UICadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UICadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UICadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UICadProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgTipo;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlQuantidade;
    private javax.swing.JLabel jlTipo;
    private javax.swing.JLabel jlValor;
    private javax.swing.JRadioButton jrAlimento;
    private javax.swing.JRadioButton jrLimpeza;
    private javax.swing.JRadioButton jrVestimenta;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtQuantidade;
    private javax.swing.JTextField jtValor;
    // End of variables declaration//GEN-END:variables
}
