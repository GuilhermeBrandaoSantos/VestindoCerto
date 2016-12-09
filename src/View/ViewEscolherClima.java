/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.ModelRoupa;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author internet
 */
public class ViewEscolherClima extends javax.swing.JFrame {

    /**
     * Creates new form ViewEscolherClima
     */
    ModelRoupa modelRoupa;
    public ViewEscolherClima(ModelRoupa roupa) {
        modelRoupa = roupa;
        initComponents();
    }

    private ViewEscolherClima() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupClima = new javax.swing.ButtonGroup();
        jRadioButtonSol = new javax.swing.JRadioButton();
        btnProx1 = new javax.swing.JButton();
        lblClima = new javax.swing.JLabel();
        jRadioButtonNublado = new javax.swing.JRadioButton();
        btnVoltar = new javax.swing.JButton();
        jRadioButtonSeco = new javax.swing.JRadioButton();
        jRadioButtonChuva = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ESCOLHA DO CLIMA");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroupClima.add(jRadioButtonSol);
        jRadioButtonSol.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButtonSol.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonSol.setSelected(true);
        jRadioButtonSol.setText("Sol");
        jRadioButtonSol.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jRadioButtonSol, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 120, 76));

        btnProx1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnProx1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone-proximo.png"))); // NOI18N
        btnProx1.setText("Próximo");
        btnProx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProx1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnProx1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 190, 50));

        lblClima.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        lblClima.setForeground(new java.awt.Color(255, 255, 255));
        lblClima.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClima.setText("Escolha o Clima");
        lblClima.setMaximumSize(new java.awt.Dimension(250, 40));
        lblClima.setMinimumSize(new java.awt.Dimension(250, 40));
        lblClima.setPreferredSize(new java.awt.Dimension(330, 40));
        getContentPane().add(lblClima, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 450, 40));

        buttonGroupClima.add(jRadioButtonNublado);
        jRadioButtonNublado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButtonNublado.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonNublado.setText("Nublado");
        jRadioButtonNublado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadioButtonNublado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNubladoActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonNublado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 100, 76));

        btnVoltar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone-voltar.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 190, 50));

        buttonGroupClima.add(jRadioButtonSeco);
        jRadioButtonSeco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButtonSeco.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonSeco.setText("Seco");
        jRadioButtonSeco.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jRadioButtonSeco, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 100, 78));

        buttonGroupClima.add(jRadioButtonChuva);
        jRadioButtonChuva.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButtonChuva.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonChuva.setText("Chuva");
        jRadioButtonChuva.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jRadioButtonChuva, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 100, 78));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/banner-vestindo-certo-15.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProx1ActionPerformed
        //AQUI DEVE SER GRAVADO A ROUPA
        if(jRadioButtonSol.isSelected()){;
            modelRoupa.setFkClima(1);
        }else if(jRadioButtonChuva.isSelected()){
            modelRoupa.setFkClima(2);
        }else if(jRadioButtonNublado.isSelected()){
            modelRoupa.setFkClima(3);
        }else if(jRadioButtonSeco.isSelected()){
            modelRoupa.setFkClima(4);
        }
        
        ViewLookGerado look;
        try {
            look = new ViewLookGerado(modelRoupa);
            look.setVisible(true);
            dispose();
        } catch (IOException ex) {
            Logger.getLogger(ViewEscolherClima.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnProx1ActionPerformed

    private void jRadioButtonNubladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNubladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonNubladoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed

        ViewEscolherEvento evento = new ViewEscolherEvento(modelRoupa);
        evento.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

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
    private javax.swing.JButton btnVoltar;
    private javax.swing.ButtonGroup buttonGroupClima;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButtonChuva;
    private javax.swing.JRadioButton jRadioButtonNublado;
    private javax.swing.JRadioButton jRadioButtonSeco;
    private javax.swing.JRadioButton jRadioButtonSol;
    private javax.swing.JLabel lblClima;
    // End of variables declaration//GEN-END:variables
}
