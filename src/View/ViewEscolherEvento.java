/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.ModelRoupa;

/**
 *
 * @author internet
 */
public class ViewEscolherEvento extends javax.swing.JFrame {

    /**
     * Creates new form ViewEscolherEvento
     */
    ModelRoupa modelRoupa;
    public ViewEscolherEvento(ModelRoupa roupa) {
        initComponents();
        modelRoupa = roupa;
    }

    private ViewEscolherEvento() {
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

        buttonGroupEvento = new javax.swing.ButtonGroup();
        jRadioButtonFaculdade = new javax.swing.JRadioButton();
        jRadioButtonTrabalho = new javax.swing.JRadioButton();
        jRadioButtonFesta = new javax.swing.JRadioButton();
        btnGerarLook = new javax.swing.JButton();
        lblEvento = new javax.swing.JLabel();
        jRadioButtonBalada = new javax.swing.JRadioButton();
        jRadioButtonCasamento = new javax.swing.JRadioButton();
        jRadioButtonAcademia = new javax.swing.JRadioButton();
        btnVoltarMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ESCOLHA DO EVENTO");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroupEvento.add(jRadioButtonFaculdade);
        jRadioButtonFaculdade.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButtonFaculdade.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonFaculdade.setSelected(true);
        jRadioButtonFaculdade.setText("Faculdade");
        jRadioButtonFaculdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFaculdadeActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonFaculdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        buttonGroupEvento.add(jRadioButtonTrabalho);
        jRadioButtonTrabalho.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButtonTrabalho.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonTrabalho.setText("Trabalho");
        getContentPane().add(jRadioButtonTrabalho, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        buttonGroupEvento.add(jRadioButtonFesta);
        jRadioButtonFesta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButtonFesta.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonFesta.setText("Festa");
        getContentPane().add(jRadioButtonFesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        btnGerarLook.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGerarLook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone-proximo.png"))); // NOI18N
        btnGerarLook.setText("Próximo");
        btnGerarLook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarLookActionPerformed(evt);
            }
        });
        getContentPane().add(btnGerarLook, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 190, 50));

        lblEvento.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        lblEvento.setForeground(new java.awt.Color(255, 255, 255));
        lblEvento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEvento.setText("Escolha o Evento");
        lblEvento.setMaximumSize(new java.awt.Dimension(250, 40));
        lblEvento.setMinimumSize(new java.awt.Dimension(250, 40));
        lblEvento.setPreferredSize(new java.awt.Dimension(330, 40));
        getContentPane().add(lblEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 450, -1));

        buttonGroupEvento.add(jRadioButtonBalada);
        jRadioButtonBalada.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButtonBalada.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonBalada.setText("Balada");
        getContentPane().add(jRadioButtonBalada, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        buttonGroupEvento.add(jRadioButtonCasamento);
        jRadioButtonCasamento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButtonCasamento.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonCasamento.setText("Casamento");
        getContentPane().add(jRadioButtonCasamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        buttonGroupEvento.add(jRadioButtonAcademia);
        jRadioButtonAcademia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButtonAcademia.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonAcademia.setText("Academia");
        getContentPane().add(jRadioButtonAcademia, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));

        btnVoltarMenu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVoltarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone-voltar.png"))); // NOI18N
        btnVoltarMenu.setText("Voltar");
        btnVoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 190, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/banner-vestindo-certo-08.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonFaculdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFaculdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonFaculdadeActionPerformed

    private void btnGerarLookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarLookActionPerformed
        if(jRadioButtonFaculdade.isSelected()){;
            modelRoupa.setFkEvento(1);
        }else if(jRadioButtonTrabalho.isSelected()){
            modelRoupa.setFkEvento(2);
        }else if(jRadioButtonFesta.isSelected()){
            modelRoupa.setFkEvento(3);
        }else if(jRadioButtonBalada.isSelected()){
            modelRoupa.setFkEvento(4);
        }else if(jRadioButtonCasamento.isSelected()){
            modelRoupa.setFkEvento(5);
        }else if(jRadioButtonAcademia.isSelected()){
            modelRoupa.setFkEvento(6);
        }
        
        ViewEscolherClima clima = new ViewEscolherClima(modelRoupa);
        clima.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnGerarLookActionPerformed

    private void btnVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarMenuActionPerformed

        ViewEscolherLocal local = new ViewEscolherLocal();
        local.setVisible(true);
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
            java.util.logging.Logger.getLogger(ViewEscolherEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEscolherEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEscolherEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEscolherEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewEscolherEvento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerarLook;
    private javax.swing.JButton btnVoltarMenu;
    private javax.swing.ButtonGroup buttonGroupEvento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButtonAcademia;
    private javax.swing.JRadioButton jRadioButtonBalada;
    private javax.swing.JRadioButton jRadioButtonCasamento;
    private javax.swing.JRadioButton jRadioButtonFaculdade;
    private javax.swing.JRadioButton jRadioButtonFesta;
    private javax.swing.JRadioButton jRadioButtonTrabalho;
    private javax.swing.JLabel lblEvento;
    // End of variables declaration//GEN-END:variables
}
