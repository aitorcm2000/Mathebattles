/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package paneles;

import BD.DB_methods;
import javax.swing.JTextArea;
import mathebattles.Archivos;
import static paneles.MFrame.cl;
import static paneles.MFrame.pl;

/**
 *
 * @author aitor
 */
public class Puntuaciones extends javax.swing.JPanel {

    /**
     * Creates new form Puntuaciones
     */
    public Puntuaciones() {
        DB_methods.mejoresScores();
        initComponents();
        Tabla_Score.setText(Archivos.leerMejores());
    }

    public void setTabla_Score(JTextArea Tabla_Score) {
        this.Tabla_Score = Tabla_Score;
    }
    

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        B_P_Menu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_Score = new javax.swing.JTextArea();

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 48)); // NOI18N
        jLabel1.setText("Puntuaciones");

        B_P_Menu.setText("Menu");
        B_P_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_P_MenuActionPerformed(evt);
            }
        });

        Tabla_Score.setEditable(false);
        Tabla_Score.setColumns(20);
        Tabla_Score.setRows(5);
        jScrollPane2.setViewportView(Tabla_Score);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(B_P_Menu)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(B_P_Menu)
                .addContainerGap(74, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void B_P_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_P_MenuActionPerformed
        // TODO add your handling code here:
        cl.show(pl, "Menu");
    }//GEN-LAST:event_B_P_MenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_P_Menu;
    private javax.swing.JTextArea Tabla_Score;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
