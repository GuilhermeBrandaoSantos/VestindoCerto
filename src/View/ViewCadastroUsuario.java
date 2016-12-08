/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerUsuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author internet
 */
public class ViewCadastroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form ViewCadastroUsuario
     */
    public ViewCadastroUsuario() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblConfirmaSenha = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        txtSenhaConfirmar = new javax.swing.JPasswordField();
        bntCadastrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Usuário");
        jLabel1.setPreferredSize(new java.awt.Dimension(330, 40));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 450, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar novo usuário"));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("<html><b>Nome </b><font color=\"red\">*</font>");
        jPanel1.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("<html><b>E-mail </b><font color=\"red\">*</font>");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        lblSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("<html><b>Senha     </b><font color=\"red\">*</font>");
        jPanel1.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        lblConfirmaSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblConfirmaSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblConfirmaSenha.setText("<html><b>Confirmar Senha </b><font color=\"red\">*</font>");
        jPanel1.add(lblConfirmaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 350, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 350, -1));

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 350, -1));
        jPanel1.add(txtSenhaConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 350, -1));

        bntCadastrar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        bntCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone-gravar.png"))); // NOI18N
        bntCadastrar.setText("Cadastrar");
        bntCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(bntCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 190, 50));

        btnLimpar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone-limpar.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 190, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/banner-vestindo-certo-00.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, -1, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 440, 320));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/banner-vestindo-certo-00.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtNome.setText("");
        txtEmail.setText("");
        txtSenha.setText("");
        txtSenhaConfirmar.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void bntCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCadastrarActionPerformed
        String dados[] = new String[4];
        boolean controle;
        
        dados[0] = txtNome.getText();
        dados[1] = txtEmail.getText();
        dados[2] = txtSenha.getText();
        dados[3] = txtSenhaConfirmar.getText();
        
        try {
            if ("".equals(dados[0]) || "".equals(dados[1]) || "".equals(dados[2]) || "".equals(dados[3])){
                JOptionPane.showMessageDialog(null, "Você deve preencher todos os campos", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);            
            }else{   
                if(dados[3].equals(dados[2])){
                    ControllerUsuario usuario = new ControllerUsuario();
                    controle = usuario.storeUsuario(dados);
                    if(controle){
                        ViewMenu viewMenu = new ViewMenu();
                        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso.");
                        viewMenu.setVisible(true);
                        dispose();   
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "A confirmação de senha está incorreta", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE); 
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViewCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

                
    }//GEN-LAST:event_bntCadastrarActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblConfirmaSenha;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JPasswordField txtSenhaConfirmar;
    // End of variables declaration//GEN-END:variables
}
