/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jogoDaVelha;

/**
 *
 * @author daday
 */
public class Jogo extends javax.swing.JFrame {

    /**
     * Creates new form Jogo
     */
    public Jogo() {
        initComponents();
    }
    
    Logica logica = new Logica();
   
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l1c1 = new javax.swing.JButton();
        l1c2 = new javax.swing.JButton();
        l1c3 = new javax.swing.JButton();
        l2c1 = new javax.swing.JButton();
        l2c2 = new javax.swing.JButton();
        l2c3 = new javax.swing.JButton();
        l3c1 = new javax.swing.JButton();
        l3c2 = new javax.swing.JButton();
        l3c3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        l1c1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        l1c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l1c1ActionPerformed(evt);
            }
        });

        l1c2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        l1c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l1c2ActionPerformed(evt);
            }
        });

        l1c3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        l1c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l1c3ActionPerformed(evt);
            }
        });

        l2c1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        l2c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l2c1ActionPerformed(evt);
            }
        });

        l2c2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        l2c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l2c2ActionPerformed(evt);
            }
        });

        l2c3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        l2c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l2c3ActionPerformed(evt);
            }
        });

        l3c1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        l3c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l3c1ActionPerformed(evt);
            }
        });

        l3c2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        l3c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l3c2ActionPerformed(evt);
            }
        });

        l3c3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        l3c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l3c3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l1c1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l1c2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l1c3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l2c1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l2c2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l2c3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l3c1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l3c2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l3c3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(276, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l1c3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l1c1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l1c2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l2c1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l2c2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l2c3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l3c1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l3c2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l3c3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void l1c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l1c1ActionPerformed
        logica.preencher(l1c1);
        logica.verificarVitoria(l1c1, l1c2, l1c3, l2c1, l2c2, l2c3, l3c1, l3c2, l3c3);
    }//GEN-LAST:event_l1c1ActionPerformed

    private void l1c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l1c2ActionPerformed
        logica.preencher(l1c2);
        logica.verificarVitoria(l1c1, l1c2, l1c3, l2c1, l2c2, l2c3, l3c1, l3c2, l3c3);
    }//GEN-LAST:event_l1c2ActionPerformed

    private void l1c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l1c3ActionPerformed
        logica.preencher(l1c3);
        logica.verificarVitoria(l1c1, l1c2, l1c3, l2c1, l2c2, l2c3, l3c1, l3c2, l3c3);
    }//GEN-LAST:event_l1c3ActionPerformed

    private void l2c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l2c1ActionPerformed
        logica.preencher(l2c1);
        logica.verificarVitoria(l1c1, l1c2, l1c3, l2c1, l2c2, l2c3, l3c1, l3c2, l3c3);
    }//GEN-LAST:event_l2c1ActionPerformed

    private void l2c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l2c2ActionPerformed
        logica.preencher(l2c2);
        logica.verificarVitoria(l1c1, l1c2, l1c3, l2c1, l2c2, l2c3, l3c1, l3c2, l3c3);
    }//GEN-LAST:event_l2c2ActionPerformed

    private void l2c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l2c3ActionPerformed
        logica.preencher(l2c3);
        logica.verificarVitoria(l1c1, l1c2, l1c3, l2c1, l2c2, l2c3, l3c1, l3c2, l3c3);
    }//GEN-LAST:event_l2c3ActionPerformed

    private void l3c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l3c1ActionPerformed
        logica.preencher(l3c1);
        logica.verificarVitoria(l1c1, l1c2, l1c3, l2c1, l2c2, l2c3, l3c1, l3c2, l3c3);
    }//GEN-LAST:event_l3c1ActionPerformed

    private void l3c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l3c2ActionPerformed
        logica.preencher(l3c2);
        logica.verificarVitoria(l1c1, l1c2, l1c3, l2c1, l2c2, l2c3, l3c1, l3c2, l3c3);
    }//GEN-LAST:event_l3c2ActionPerformed

    private void l3c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l3c3ActionPerformed
        logica.preencher(l3c3);
        logica.verificarVitoria(l1c1, l1c2, l1c3, l2c1, l2c2, l2c3, l3c1, l3c2, l3c3);
    }//GEN-LAST:event_l3c3ActionPerformed

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
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton l1c1;
    private javax.swing.JButton l1c2;
    private javax.swing.JButton l1c3;
    private javax.swing.JButton l2c1;
    private javax.swing.JButton l2c2;
    private javax.swing.JButton l2c3;
    private javax.swing.JButton l3c1;
    private javax.swing.JButton l3c2;
    private javax.swing.JButton l3c3;
    // End of variables declaration//GEN-END:variables
}