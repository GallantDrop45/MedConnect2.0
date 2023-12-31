/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.medconncet;

/**
 *
 * @author tiago
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Tela1
     */
    public Menu() {
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

        botão2 = new Modelos.Botão();
        botão1 = new Modelos.Botão();
        botão3 = new Modelos.Botão();
        botão4 = new Modelos.Botão();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1350, 900));
        setResizable(false);
        getContentPane().setLayout(null);

        botão2.setBorder(null);
        botão2.setForeground(new java.awt.Color(19, 107, 105));
        botão2.setText("Atendimento Preferencial");
        botão2.setBorderColor(new java.awt.Color(255, 255, 255));
        botão2.setColorClick(new java.awt.Color(255, 255, 255));
        botão2.setColorOver(new java.awt.Color(255, 255, 255));
        botão2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        botão2.setRadius(65);
        botão2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão2ActionPerformed(evt);
            }
        });
        getContentPane().add(botão2);
        botão2.setBounds(590, 460, 650, 70);

        botão1.setBorder(null);
        botão1.setForeground(new java.awt.Color(19, 107, 105));
        botão1.setText("Atendimento Comum");
        botão1.setBorderColor(new java.awt.Color(255, 255, 255));
        botão1.setColorClick(new java.awt.Color(255, 255, 255));
        botão1.setColorOver(new java.awt.Color(255, 255, 255));
        botão1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        botão1.setRadius(65);
        botão1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão1ActionPerformed(evt);
            }
        });
        getContentPane().add(botão1);
        botão1.setBounds(590, 340, 650, 70);

        botão3.setBorder(null);
        botão3.setForeground(new java.awt.Color(19, 107, 105));
        botão3.setText("Resultado de Exames");
        botão3.setBorderColor(new java.awt.Color(255, 255, 255));
        botão3.setColorClick(new java.awt.Color(255, 255, 255));
        botão3.setColorOver(new java.awt.Color(255, 255, 255));
        botão3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        botão3.setRadius(65);
        botão3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão3ActionPerformed(evt);
            }
        });
        getContentPane().add(botão3);
        botão3.setBounds(590, 580, 650, 70);

        botão4.setBorder(null);
        botão4.setForeground(new java.awt.Color(19, 107, 105));
        botão4.setText("Consultar Fila");
        botão4.setBorderColor(new java.awt.Color(255, 255, 255));
        botão4.setColorClick(new java.awt.Color(255, 255, 255));
        botão4.setColorOver(new java.awt.Color(255, 255, 255));
        botão4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        botão4.setRadius(65);
        botão4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botão4ActionPerformed(evt);
            }
        });
        getContentPane().add(botão4);
        botão4.setBounds(590, 710, 650, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Faculdade2\\MedConncet\\src\\main\\java\\Imagens\\Menu.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 2660, 880);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botão1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão1ActionPerformed
        AtendCom ac = new AtendCom();
        ac.setVisible(true);
        dispose();
    }//GEN-LAST:event_botão1ActionPerformed

    private void botão2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão2ActionPerformed
        AtendPref ap = new AtendPref();
        ap.setVisible(true);
        dispose();
    }//GEN-LAST:event_botão2ActionPerformed

    private void botão3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão3ActionPerformed
       ResulExa re = new ResulExa();
        re.setVisible(true);
        dispose();
    }//GEN-LAST:event_botão3ActionPerformed

    private void botão4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botão4ActionPerformed
        ConsultaFila cf = new ConsultaFila();
        cf.setVisible(true);
        dispose();
    }//GEN-LAST:event_botão4ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Modelos.Botão botão1;
    private Modelos.Botão botão2;
    private Modelos.Botão botão3;
    private Modelos.Botão botão4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
