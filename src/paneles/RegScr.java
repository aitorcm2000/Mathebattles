/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package paneles;

import BD.DB_methods;
import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static mathebattles.Main.mf;
import mathebattles.Usuario;
import static paneles.MFrame.cl;
import static paneles.MFrame.pl;

/**
 *
 * @author aitor
 */
public class RegScr extends javax.swing.JPanel {
    private Dialog adv_conf;
    /**
     * Creates new form LogScr
     */
    public RegScr() {
        initComponents();
        Error_User.setVisible(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        L_REGISTRO = new javax.swing.JLabel();
        L_ALIAS = new javax.swing.JLabel();
        TF_Nombre = new javax.swing.JTextField();
        CB_Curso = new javax.swing.JComboBox<>();
        L_AULA = new javax.swing.JLabel();
        CB_Aula = new javax.swing.JComboBox<>();
        L_CURSO = new javax.swing.JLabel();
        L_ALIAS1 = new javax.swing.JLabel();
        CB_Edad = new javax.swing.JComboBox<>();
        L_DNI = new javax.swing.JLabel();
        TF_dni = new javax.swing.JTextField();
        L_OPCIONAL = new javax.swing.JLabel();
        B_Comp_Reg = new javax.swing.JButton();
        Error_User = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(800, 700));
        setMinimumSize(new java.awt.Dimension(800, 700));

        L_REGISTRO.setFont(new java.awt.Font("Noto Sans", 0, 48)); // NOI18N
        L_REGISTRO.setText("Registro");

        L_ALIAS.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        L_ALIAS.setText("Introduce un nombre :");

        TF_Nombre.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N

        CB_Curso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2ºESO A", "2ºESO B", "3ºESO A", "3ºESO B", "4ºESO A", "4ºESO B", "1ºDAM" }));
        CB_Curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_CursoActionPerformed(evt);
            }
        });

        L_AULA.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        L_AULA.setText("Introduce el aula :");

        CB_Aula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A24", "A25", "A26", "A14", "A15", "A16" }));

        L_CURSO.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        L_CURSO.setText("Introduce un curso :");

        L_ALIAS1.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        L_ALIAS1.setText("Introduce tu edad :");

        CB_Edad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99" }));

        L_DNI.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        L_DNI.setText("Introduce tu DNI :");

        TF_dni.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N

        L_OPCIONAL.setText("(Opcional)");

        B_Comp_Reg.setText("Completar registro");
        B_Comp_Reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Comp_RegActionPerformed(evt);
            }
        });

        Error_User.setBackground(new java.awt.Color(153, 153, 153));
        Error_User.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Error_User.setForeground(new java.awt.Color(229, 21, 21));
        Error_User.setText("Ya existe este usuario");
        Error_User.setFocusable(false);

        jButton1.setText("jButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Error_User)
                .addGap(339, 339, 339))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(L_REGISTRO))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(B_Comp_Reg)
                        .addGap(28, 28, 28)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(L_OPCIONAL)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L_ALIAS)
                            .addComponent(L_ALIAS1)
                            .addComponent(L_AULA)
                            .addComponent(L_DNI)
                            .addComponent(L_CURSO))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TF_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CB_Aula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CB_Curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CB_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(L_REGISTRO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Error_User)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_ALIAS))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_ALIAS1)
                    .addComponent(CB_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_DNI)
                    .addComponent(L_OPCIONAL))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB_Curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_CURSO))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_AULA)
                    .addComponent(CB_Aula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_Comp_Reg)
                    .addComponent(jButton1))
                .addContainerGap(108, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CB_CursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_CursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_CursoActionPerformed

    private void B_Comp_RegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Comp_RegActionPerformed
        // TODO add your handling code here:
        BorderLayout borde = new BorderLayout();
        String str_ta="";
        adv_conf= new Dialog(mf,"Advertencia confirmacion", true);
        adv_conf.setLayout(borde);
        JTextArea textoadv;
        
        JButton conf = new JButton("Confirmar");
        conf.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(!DB_methods.usuarioExiste(TF_Nombre.getText())){
                    Usuario.us_act.setAlias(TF_Nombre.getText());
                    Usuario.us_act.setEdad(getCB_Edad());
                    Usuario.us_act.setId_curso(DB_methods.buscaID_Curso(getCB_Curso()));
                    Usuario.us_act.setDni(TF_dni.getText());
                    DB_methods.insertUsuario(Usuario.us_act);
                    cl.show(pl, "Menu");
                }else{
                    Error_User.setVisible(true);
                }
                
                adv_conf.setVisible(false);
            }            
        });
        textoadv = new JTextArea();
        textoadv.setBounds(10, 10, 300, 200);
        
        str_ta="Alias : "+TF_Nombre.getText()+"\n"
                + "Edad : "+getCB_Edad()+"\n"
                + "Curso : "+getCB_Curso()+"\n"
                + "Aula : "+getCB_Aula();
        
        textoadv = new JTextArea(str_ta);
        textoadv.setEditable(false);
        textoadv.setBounds(50, 50, 50, 200);

        
        adv_conf.add(textoadv, BorderLayout.CENTER);
        adv_conf.add(conf,BorderLayout.SOUTH);
        adv_conf.setSize(200, 200);
        adv_conf.setVisible(true);
        
    }//GEN-LAST:event_B_Comp_RegActionPerformed

    public static String getCB_Aula() {
        return CB_Aula.getSelectedItem().toString();
    }

    public static String getCB_Curso() {
        return CB_Curso.getSelectedItem().toString();
    }

    public static int getCB_Edad() {
        return Integer.parseInt(CB_Edad.getSelectedItem().toString());
    }

    public static String getTF_Nombre() {
        return TF_Nombre.getText();
    }

    public static String getTF_dni() {
        return TF_dni.getText();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Comp_Reg;
    public static javax.swing.JComboBox<String> CB_Aula;
    public static javax.swing.JComboBox<String> CB_Curso;
    public static javax.swing.JComboBox<String> CB_Edad;
    private javax.swing.JLabel Error_User;
    private javax.swing.JLabel L_ALIAS;
    private javax.swing.JLabel L_ALIAS1;
    private javax.swing.JLabel L_AULA;
    private javax.swing.JLabel L_CURSO;
    private javax.swing.JLabel L_DNI;
    private javax.swing.JLabel L_OPCIONAL;
    private javax.swing.JLabel L_REGISTRO;
    public static javax.swing.JTextField TF_Nombre;
    public static javax.swing.JTextField TF_dni;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
