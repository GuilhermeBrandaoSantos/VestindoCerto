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
public class ViewMenu extends javax.swing.JFrame {

    /**
     * Creates new form ViewMenu
     */
    public ViewMenu() {
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

        btnCadastrarRoupa = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnEscolherLook = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCadastrarRoupa.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        btnCadastrarRoupa.setText("Cadastar Roupas");
        btnCadastrarRoupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarRoupaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrarRoupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 80));

        btnPerfil.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        btnPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone-perfil.png"))); // NOI18N
        btnPerfil.setText("Perfil");
        getContentPane().add(btnPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 165, 80));

        btnSair.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icnoe-sair.jpg"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 165, 80));

        btnEscolherLook.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        btnEscolherLook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone-escolher.png"))); // NOI18N
        btnEscolherLook.setText("Look");
        btnEscolherLook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscolherLookActionPerformed(evt);
            }
        });
        getContentPane().add(btnEscolherLook, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 165, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/backgound2.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnEscolherLookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscolherLookActionPerformed

        ViewEscolherClima clima = new ViewEscolherClima();
        clima.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEscolherLookActionPerformed

    private void btnCadastrarRoupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarRoupaActionPerformed
        // TODO add your handling code here:
        ViewCadastroRoupa viewCadastroRoupa = new ViewCadastroRoupa();
        viewCadastroRoupa.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCadastrarRoupaActionPerformed

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
            java.util.logging.Logger.getLogger(ViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarRoupa;
    private javax.swing.JButton btnEscolherLook;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
