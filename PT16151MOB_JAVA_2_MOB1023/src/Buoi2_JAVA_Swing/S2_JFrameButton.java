/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi2_JAVA_Swing;

import java.awt.Color;

/**
 *
 * @author LegendNguyen
 */
public class S2_JFrameButton extends javax.swing.JFrame {

    /**
     * Creates new form JFrameButton
     */
    public S2_JFrameButton() {
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

        btn_Green = new javax.swing.JButton();
        lbl_text = new javax.swing.JLabel();
        btn_ok = new javax.swing.JButton();
        btn_Red = new javax.swing.JButton();
        btn_blue = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_Green.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn_Green.setText("Green");
        btn_Green.setToolTipText("");
        btn_Green.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GreenActionPerformed(evt);
            }
        });

        lbl_text.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbl_text.setText("jLabel1");

        btn_ok.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn_ok.setText("OK");
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });

        btn_Red.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn_Red.setText("Red");
        btn_Red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RedActionPerformed(evt);
            }
        });

        btn_blue.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btn_blue.setText("Blue");
        btn_blue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_blueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lbl_text)
                .addContainerGap(474, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_blue)
                    .addComponent(btn_Green))
                .addGap(31, 31, 31))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(71, 71, 71)
                    .addComponent(btn_ok)
                    .addContainerGap(521, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(540, Short.MAX_VALUE)
                    .addComponent(btn_Red)
                    .addGap(32, 32, 32)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lbl_text)
                .addGap(33, 33, 33)
                .addComponent(btn_blue)
                .addGap(18, 18, 18)
                .addComponent(btn_Green)
                .addContainerGap(153, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(152, 152, 152)
                    .addComponent(btn_ok)
                    .addContainerGap(219, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(btn_Red)
                    .addContainerGap(323, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_GreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GreenActionPerformed
       this.getContentPane().setBackground(Color.red);
    }//GEN-LAST:event_btn_GreenActionPerformed

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
        System.out.println("Nút đã bấm rồi nè");
        lbl_text.setText("Chào Mừng Các Bạn Đến Với JAVA2");
    }//GEN-LAST:event_btn_okActionPerformed

    private void btn_RedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RedActionPerformed
        this.getContentPane().setBackground(Color.red);
    }//GEN-LAST:event_btn_RedActionPerformed

    private void btn_blueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_blueActionPerformed
         this.getContentPane().setBackground(Color.blue);
    }//GEN-LAST:event_btn_blueActionPerformed

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
            java.util.logging.Logger.getLogger(S2_JFrameButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(S2_JFrameButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(S2_JFrameButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(S2_JFrameButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new S2_JFrameButton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Green;
    private javax.swing.JButton btn_Red;
    private javax.swing.JButton btn_blue;
    private javax.swing.JButton btn_ok;
    private javax.swing.JLabel lbl_text;
    // End of variables declaration//GEN-END:variables
}
