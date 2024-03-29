/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examen1p2_hectorflores;

import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hecto
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }
    
    ArrayList <SocialClass> cuentas;
    UberSocial uber = new UberSocial();
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        agregarCuenta = new javax.swing.JButton();
        agregarPost = new javax.swing.JButton();
        agregarAmigo = new javax.swing.JButton();
        agregarComment = new javax.swing.JButton();
        profileForm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Menu de redes sociales:");

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        agregarCuenta.setText("Agregar Cuenta");
        agregarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarCuentaActionPerformed(evt);
            }
        });

        agregarPost.setText("Agregar Post");
        agregarPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPostActionPerformed(evt);
            }
        });

        agregarAmigo.setText("Agregar Amigo");
        agregarAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarAmigoActionPerformed(evt);
            }
        });

        agregarComment.setText("Agregar Comment");
        agregarComment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarCommentActionPerformed(evt);
            }
        });

        profileForm.setText("Mostrar Profile de Usuario");
        profileForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileFormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(salir)
                    .addComponent(jLabel1)
                    .addComponent(agregarCuenta)
                    .addComponent(agregarPost)
                    .addComponent(agregarAmigo)
                    .addComponent(agregarComment)
                    .addComponent(profileForm))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agregarCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agregarPost)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agregarAmigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agregarComment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profileForm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salir)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed
        
    private void agregarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarCuentaActionPerformed
        String redSocial = JOptionPane.showInputDialog("Desea una cueta de Facebook o Twitter?");
        
        while (true){
            if (redSocial.equalsIgnoreCase("facebook") || redSocial.equalsIgnoreCase("twitter")){
                break;
            } else {
                redSocial = JOptionPane.showInputDialog("Ingrese solamente Facebook o Twitter\n\nDesea una cueta de Facebook o Twitter?");
            }
        }
        
        String username = JOptionPane.showInputDialog("Ingrese el nombre de usuario para la cuenta");
        
        while (username == null){
            username = JOptionPane.showInputDialog("Ingrese el nombre de usuario para la cuenta (al menos 1 caracter)");
        }
        
        redSocial = redSocial.toUpperCase();
        uber.agregarCuenta(username, redSocial);
        
        
    }//GEN-LAST:event_agregarCuentaActionPerformed
 
    private void agregarPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPostActionPerformed
        String username = JOptionPane.showInputDialog("Ingrese el nombre de usuario que desea agregar un post");
        String post = JOptionPane.showInputDialog("Ingrese el post que desea agregar");
        
        while (post == null){
            post = JOptionPane.showInputDialog("Ingrese al menos un carrracter para el post que desea agregar");
        }
        
        uber.agregarPost(username, post);
        
    }//GEN-LAST:event_agregarPostActionPerformed
    
    private void agregarAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarAmigoActionPerformed
        String user1 = JOptionPane.showInputDialog("Ingrese el usuario a quien le desea agregar un amigo");
        String user2 = JOptionPane.showInputDialog("Ingrese el usuario que desea agregar como amigo de " + user1);
        
        uber.agregarAmigo(user1, user2);
    }//GEN-LAST:event_agregarAmigoActionPerformed
    
    private void agregarCommentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarCommentActionPerformed
        String username = JOptionPane.showInputDialog("Ingrese el usuario de Facebook al que le agregara un comentario en uno de sus posts");
        
        try {
            int postId = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del post al que le va a agregar el  comentario:"));
            String autor = JOptionPane.showInputDialog("Ingrese el autor del comentario:");
            String comentario = JOptionPane.showInputDialog("Ingrese el comentario:");
            
            uber.agregarComment(username, postId, autor, comentario);
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ingrese datos validos");
        }
    }//GEN-LAST:event_agregarCommentActionPerformed
    
    private void profileFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileFormActionPerformed
        String username = JOptionPane.showInputDialog("Ingrese el usuario para mostrar su profile");
        
        uber.profileFrom(username);
    }//GEN-LAST:event_profileFormActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarAmigo;
    private javax.swing.JButton agregarComment;
    private javax.swing.JButton agregarCuenta;
    private javax.swing.JButton agregarPost;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton profileForm;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
