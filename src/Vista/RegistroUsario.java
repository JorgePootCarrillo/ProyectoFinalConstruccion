package Vista;

import Modelo.Usuario;
import Controlador.Controlador;
import javax.swing.JOptionPane;

public class RegistroUsario extends javax.swing.JFrame {

    public RegistroUsario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_NombreRegistro = new javax.swing.JTextField();
        txt_apellidoRegistro = new javax.swing.JTextField();
        txt_CurpRegistro = new javax.swing.JTextField();
        txt_ContraseniaRegistro = new javax.swing.JTextField();
        btn_registrarUsuario = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Registro Nuevo Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Apellido:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("CURP:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Contraseña:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));
        jPanel1.add(txt_NombreRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 100, -1));
        jPanel1.add(txt_apellidoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 100, -1));
        jPanel1.add(txt_CurpRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 100, -1));
        jPanel1.add(txt_ContraseniaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 100, -1));

        btn_registrarUsuario.setText("Registrarse");
        btn_registrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btn_registrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarUsuarioActionPerformed
        // TODO add your handling code here:
        try{
           String nombreUsuario=txt_NombreRegistro.getText();
            String apellidoUsuario=txt_apellidoRegistro.getText();
            String curpUsuario=txt_CurpRegistro.getText();
            String contraseniaUsuario=txt_ContraseniaRegistro.getText();
            Usuario usuario= new Usuario(nombreUsuario,apellidoUsuario,curpUsuario,contraseniaUsuario);
            Controlador.listaUsuarios.add(usuario);
           // Controlador.escribirDatosEnTxt("listaUsuarios.txt", 1);
            new IniciarSesion().setVisible(true);
            this.dispose();
           
        }catch(NumberFormatException e1){
            JOptionPane.showMessageDialog(null, "Error en la captura de datos");
        }
    }//GEN-LAST:event_btn_registrarUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroUsario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroUsario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroUsario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUsario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroUsario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registrarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_ContraseniaRegistro;
    private javax.swing.JTextField txt_CurpRegistro;
    private javax.swing.JTextField txt_NombreRegistro;
    private javax.swing.JTextField txt_apellidoRegistro;
    // End of variables declaration//GEN-END:variables
}
