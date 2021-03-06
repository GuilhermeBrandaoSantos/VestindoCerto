/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.ModelRoupa;
import UTIL.ManipularImagem;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Ricardo Mota
 */
public class ViewCadastroRoupa extends javax.swing.JFrame {

    /**
     * Creates new form ViewCadastroRoupa
     */
    BufferedImage imagem;
    public ViewCadastroRoupa() {
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

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        buttonGroupTipo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtImage = new javax.swing.JTextField();
        lblImage = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnVoltarMenu = new javax.swing.JButton();
        jRadioButtonTipo02 = new javax.swing.JRadioButton();
        jRadioButtonTipo01 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CADASTRO DE ROUPA");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(450, 400));
        setSize(new java.awt.Dimension(450, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Roupa");
        jLabel1.setPreferredSize(new java.awt.Dimension(330, 40));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 450, -1));

        txtImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImageActionPerformed(evt);
            }
        });
        getContentPane().add(txtImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 220, 30));
        getContentPane().add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 200, 190));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone-selecionar.png"))); // NOI18N
        jButton1.setText("Selecionar arquivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 190, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone-enviar.png"))); // NOI18N
        jButton2.setText("Enviar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 190, 50));

        btnVoltarMenu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVoltarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone-voltar.png"))); // NOI18N
        btnVoltarMenu.setText("Voltar");
        btnVoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 190, 50));

        buttonGroupTipo.add(jRadioButtonTipo02);
        jRadioButtonTipo02.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonTipo02.setText("Tipo 02");
        getContentPane().add(jRadioButtonTipo02, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        buttonGroupTipo.add(jRadioButtonTipo01);
        jRadioButtonTipo01.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonTipo01.setSelected(true);
        jRadioButtonTipo01.setText("Tipo 01");
        getContentPane().add(jRadioButtonTipo01, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html><body>Camisa, Camiseta, <br>Blusa, Jaco etc</body></html>");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("<html><body>Bermuda, Short,<br> Calça etc</body></html>");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/banner-vestindo-certo-13.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 410));

        setSize(new java.awt.Dimension(466, 439));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImageActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser chooser = new JFileChooser(); //Objeto de manipulação dos arquivos
        int res = chooser.showOpenDialog(null); //resposta

        String caminhoFisico;
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG PNG GIF Images", "jpg", "gif", "png");
        chooser.setFileFilter(filter);

        if(res == JFileChooser.APPROVE_OPTION){
            File arquivo = chooser.getSelectedFile();
            try {
                caminhoFisico = chooser.getCurrentDirectory()+"/"+chooser.getSelectedFile().getName();
                txtImage.setText(caminhoFisico);

                imagem = ManipularImagem.setImagemDimensao(arquivo.getAbsolutePath(), 240, 240);
                lblImage.setIcon(new ImageIcon(imagem));

            } catch (Exception ex) {
                // System.out.println(ex.printStackTrace().toString());
            }
            //System.out.println("diretorio: "+chooser.getCurrentDirectory());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String controle = txtImage.getText();
        if("".equals(controle)){
            JOptionPane.showMessageDialog(null, "Você precisa carregar uma imagem antes de enviar.", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
        } else {
            //Objetos
            ModelRoupa modelRoupa = new ModelRoupa();
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());

            //Definições para timestamp
            Instant instant = timestamp.toInstant();
            Timestamp tsFromInstant = Timestamp.from(instant);

            //Setando dados do objeto roupa
            String imageName = String.valueOf(tsFromInstant.getTime());
            if(jRadioButtonTipo01.isSelected()){;
                modelRoupa.setFkTipo(1);
            }else if(jRadioButtonTipo02.isSelected()){
                modelRoupa.setFkTipo(2);
            }
            modelRoupa.setImagem(imageName+".jpg");

            //Upload do arquivo
            try {
                String caminho = new File(".").getCanonicalPath()+"/src/ImagesUsuarios/";
                File outputfile = new File(caminho+modelRoupa.getImagem());
                ImageIO.write(imagem, "jpg", outputfile);
                JOptionPane.showMessageDialog(null, "Imagem enviada com sucesso.");
            } catch (IOException ex) {
                Logger.getLogger(ViewCadastroRoupa.class.getName()).log(Level.SEVERE, null, ex);
            }

            ViewCadastroRoupaLocal next = new ViewCadastroRoupaLocal(modelRoupa);
            next.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarMenuActionPerformed
        ViewMenu menu = new ViewMenu();
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
            java.util.logging.Logger.getLogger(ViewCadastroRoupa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroRoupa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroRoupa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroRoupa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCadastroRoupa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltarMenu;
    private javax.swing.ButtonGroup buttonGroupTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButton jRadioButtonTipo01;
    private javax.swing.JRadioButton jRadioButtonTipo02;
    private javax.swing.JLabel lblImage;
    private javax.swing.JTextField txtImage;
    // End of variables declaration//GEN-END:variables
}
