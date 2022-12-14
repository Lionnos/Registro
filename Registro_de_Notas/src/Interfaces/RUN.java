/**
 * @author Henry Leon Hurtado
 * Codigo : 211179
 * REGISTRO DE NOTAS USANDO JFRAME
   ===============================
   
 * Para que el programa funcione debe seguir los siguientes pasos:
 * 1er : Ejecuta la clase RUN
 * 2do : Para entrar como Admin debe registrarse con un Usuario y contraseña
        diferente a un correo institucional de estudiante. ejm: Usuario@mail.com
 * 3er : Para entrar como estudiante debe registrarse con su correo institucional
 *       difrente al usuario de admin. ejm: 211179@unamba.edu.pe
 * 
*/

package Interfaces;
import DataBase.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RUN extends javax.swing.JFrame {
    private ArrayList<String> correos = new ArrayList<String>();
    private ArrayList<String> passwords = new ArrayList<String>();
    
    /**
     * Creates new form Login
     */
    public RUN() {
        initComponents();
        this.setLocationRelativeTo(null); //al centro de la pantalla

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Usuario = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        IniciarSesion = new javax.swing.JButton();
        Registrarse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("INICIO SECCION");

        jLabel1.setText("Usuario");

        jLabel3.setText("Contraseña");

        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });

        IniciarSesion.setText("Iniciar Sesion");
        IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSesionActionPerformed(evt);
            }
        });

        Registrarse.setText("Registrarse");
        Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(IniciarSesion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Registrarse))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(49, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel2))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(47, 47, 47)
                                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IniciarSesion)
                    .addComponent(Registrarse))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarseActionPerformed
       /*Registrarse ventanaRegister = new Registrarse();
       ventanaRegister.setVisible(true);

        correos.add(ventanaRegister.usuario);
        passwords.add(ventanaRegister.password);
        */
        registrar();
    }//GEN-LAST:event_RegistrarseActionPerformed

    private void IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {                                              
        
        
        // ACCION DEL BOTTON "INICIAR SESION"
        boolean aceptaUsuario = false; 
        boolean aceptaPassword = false;
        String us = "";

        /* Prueba Para ingresar
        correos.add("211179@unamba.edu.pe");
        passwords.add("123456");
        correos.add("Henry@unamba.edu.pe");
        passwords.add("123456");
        */
        try {
            //Validacion de Usuario
            for (String str : correos) {
                if (Usuario.getText().equals(str)) {
                    aceptaUsuario = true;
                    us = Usuario.getText();
                }
            }
            // Validacion de Contrasena
            char[] arrayC = Password.getPassword();
            String pass = new String(arrayC);
            for (String str : passwords) {
                if (pass.equals(str)) {
                    aceptaPassword = true;
                }
            }
            
            /* ACION DE INICIO DE SESION */
            if (aceptaUsuario == true && aceptaPassword == true ) {
                Validacion validarCorreo = new Validacion();

                if (validarCorreo.validar(us) == true) {
                    // ACCCIONES PARA LA VENTANA ESTUDIANTE
                    this.setVisible(true); //Ocultamos la ventana de inicio de sesion
                    Estudiante ventanaEstudiante = new Estudiante();
                    ventanaEstudiante.setVisible(true);
                    ventanaEstudiante.cerrar(true);
                    

                } else {
                    // ACCIONES PARA LA VENTANA DOCENTE
                    setVisible(false); //Ocultamos la ventana de inicio de sesion
                    this.setVisible(true);
                    Docente ventanaDocente = new Docente();
                    ventanaDocente.setVisible(true);
                    ventanaDocente.cerrar(true);

                }

                validarCorreo = null;
                aceptaPassword = false;
                aceptaPassword = false;
            } else {
                aceptaPassword = false;
                aceptaPassword = false;
                JOptionPane.showMessageDialog(null,"REGISTRESE o vuelva a intentarlo");

            }
            //
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR");
        }



    }

    public void registrar(){
        correos.add(JOptionPane.showInputDialog("Introduce tu usuario: "));
        passwords.add(JOptionPane.showInputDialog("Introduce tu contraseña: "));

    }
    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

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
            java.util.logging.Logger.getLogger(RUN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RUN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RUN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RUN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RUN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IniciarSesion;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton Registrarse;
    private javax.swing.JTextField Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
