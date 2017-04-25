package vues;


import controls.paintComponent;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mickaël
 */
public class menuJFrame extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menuJFrame() {
        
            
            setTitle("Module Administration");
                            
          
            this.setContentPane(paintComponent.JP(200));
            initComponents();
            
            
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
            setLocationRelativeTo(null);
        try {
            Image i = ImageIO.read(getClass().getResource("/images/logo.png"));
            setIconImage(i);
        } catch (IOException ex) {
            Logger.getLogger(menuJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(100, 0), new java.awt.Dimension(100, 0), new java.awt.Dimension(100, 32767));
        profs = new javax.swing.JButton();
        notes = new javax.swing.JButton();
        eleves1 = new javax.swing.JButton();
        sections = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        matieres = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Menu Principal");
        jLabel1.setToolTipText("");

        profs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/professeurs.png"))); // NOI18N
        profs.setText("Professeurs");
        profs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        profs.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        profs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profsMouseClicked(evt);
            }
        });
        profs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profsActionPerformed(evt);
            }
        });

        notes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/notes.png"))); // NOI18N
        notes.setText("Notes");
        notes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        notes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        notes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notesMouseClicked(evt);
            }
        });
        notes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notesActionPerformed(evt);
            }
        });

        eleves1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eleves.png"))); // NOI18N
        eleves1.setText("Elèves");
        eleves1.setDefaultCapable(false);
        eleves1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eleves1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        eleves1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eleves1MouseClicked(evt);
            }
        });
        eleves1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eleves1ActionPerformed(evt);
            }
        });

        sections.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sections.png"))); // NOI18N
        sections.setText("Sections");
        sections.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sections.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        sections.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sectionsMouseClicked(evt);
            }
        });
        sections.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectionsActionPerformed(evt);
            }
        });

        matieres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/matieres.png"))); // NOI18N
        matieres.setText("Matières");
        matieres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        matieres.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        matieres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                matieresMouseClicked(evt);
            }
        });
        matieres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matieresActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/config.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(sections, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(notes, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eleves1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(profs, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(matieres, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(43, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1))
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profs, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2))
                    .addComponent(eleves1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(matieres, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notes, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sections, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profsActionPerformed

    private void profsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profsMouseClicked
        // TODO add your handling code here:
        
            

                menuProfsJFrame s = new menuProfsJFrame();
                s.setVisible(true);
                
                
        
    }//GEN-LAST:event_profsMouseClicked

    private void notesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notesMouseClicked
        // TODO add your handling code here:
                menuNoteJFrame s = new menuNoteJFrame();
                s.setVisible(true);        
    }//GEN-LAST:event_notesMouseClicked

    private void notesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notesActionPerformed

    private void eleves1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eleves1MouseClicked
        // TODO add your handling code here:
        menuEleveJFrame s = new menuEleveJFrame();
        s.setVisible(true);
        
    }//GEN-LAST:event_eleves1MouseClicked

    private void eleves1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eleves1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eleves1ActionPerformed

    private void sectionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sectionsMouseClicked
        // TODO add your handling code here:
        menuSectionsJFrame s = new menuSectionsJFrame();
        s.setVisible(true);        
        
    }//GEN-LAST:event_sectionsMouseClicked

    private void sectionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sectionsActionPerformed

    private void matieresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_matieresMouseClicked
        // TODO add your handling code here:
        menuMatieresJFrame s = new menuMatieresJFrame();
        s.setVisible(true);          
    }//GEN-LAST:event_matieresMouseClicked

    private void matieresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matieresActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_matieresActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        menuConfigsJFrame s = new menuConfigsJFrame();
        s.setVisible(true); 
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(menuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eleves1;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton matieres;
    private javax.swing.JButton notes;
    private javax.swing.JButton profs;
    private javax.swing.JButton sections;
    // End of variables declaration//GEN-END:variables
}