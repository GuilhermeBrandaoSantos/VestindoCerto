/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author internet
 */
public class ViewEscolherClima extends javax.swing.JFrame {

    /**
     * Creates new form ViewEscolherClima
     */
    public ViewEscolherClima() {
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

        rbtnEnsolarado = new javax.swing.JRadioButton();
        rbtnFrio = new javax.swing.JRadioButton();
        btnProx1 = new javax.swing.JButton();
        lblClima = new javax.swing.JLabel();
        rbtnNublado = new javax.swing.JRadioButton();
        btnVoltarMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbtnEnsolarado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbtnEnsolarado.setText("Ensolarado");
        rbtnEnsolarado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(rbtnEnsolarado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 120, 76));

        rbtnFrio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbtnFrio.setText("Frio");
        rbtnFrio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(rbtnFrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 70, 78));

        btnProx1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnProx1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone-proximo.png"))); // NOI18N
        btnProx1.setText("Próxima Etapa");
        btnProx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProx1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnProx1, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 340, 210, 50));

        lblClima.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblClima.setForeground(new java.awt.Color(255, 255, 255));
        lblClima.setText("Escolha o Clima");
        getContentPane().add(lblClima, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, 86));

        rbtnNublado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbtnNublado.setSelected(true);
        rbtnNublado.setText("Nublado");
        rbtnNublado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rbtnNublado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnNubladoActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnNublado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 100, 76));

        btnVoltarMenu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVoltarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone-voltar.png"))); // NOI18N
        btnVoltarMenu.setText("Voltar");
        btnVoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 340, 200, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/backgound.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProx1ActionPerformed

        ViewEscolherLocal local = new ViewEscolherLocal();
        local.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnProx1ActionPerformed

    private void rbtnNubladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnNubladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnNubladoActionPerformed

    private void btnVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarMenuActionPerformed

        ViewMenu menu = new ViewMenu();;
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarMenuActionPerformed

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
            java.util.logging.Logger.getLogger(ViewEscolherClima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEscolherClima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEscolherClima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEscolherClima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewEscolherClima().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProx1;
    private javax.swing.JButton btnVoltarMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblClima;
    private javax.swing.JRadioButton rbtnEnsolarado;
    private javax.swing.JRadioButton rbtnFrio;
    private javax.swing.JRadioButton rbtnNublado;
    // End of variables declaration//GEN-END:variables
}
