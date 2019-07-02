
package ventanas;
/**
 *
 * @author Jhon H Riaño
 */
import VISTA.plataforma;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class acceso extends javax.swing.JFrame {
plataforma plataforma = new plataforma();//codigo para accesar a la ventana del formulario jframe interfaz

    public acceso() {
        initComponents();
    this.setLocationRelativeTo(null);
    setIconImage (new ImageIcon(getClass().getResource("/icon/29.png")).getImage()); 
    Limpiar_Entradas();
    }
    
  //metodo para limpiar los campos de texto
  public void Limpiar_Entradas()
{
jtxtCodigo.setText("");
jtxtContraseña.setText(""); 
jtxtCodigo.requestFocus();
}  
   //metodo par mostrar el mensaje    
  public void mensaje(String texto)
{
JOptionPane.showMessageDialog(this, texto);
}//Fin del mensaje
  
   //metodo para ingresar a la plataforma
 public  void Validacion()
{ 

String  contraseña =jtxtContraseña.getText();
String  codigo=jtxtCodigo.getText();
 
  //verificar el usuario
      if (codigo.equalsIgnoreCase("poli")  && contraseña.equalsIgnoreCase("poli2019"))
        { mensaje(" ¡ ACCESO CORRECTO ! ");//condicion que me indica que el usuario debe tener  el codigo 123456, 
    //y la contraseña administrador
    plataforma.setVisible(true);//muestra la ventana de plataforma
    this.hide();//esta ventana JFrame acceso automaticamente se oculta al abrirse el Jframe plataforma
    Limpiar_Entradas();//se invoca al metodo para limpiar entradas
    }
     else {  mensaje ("Verificar CÓDIGO O CONTRASEÑA");//si no cumple ninguna de las condiciones anteriores se mostrara el mensaje
    Limpiar_Entradas();//se invoca al metodo para limpiar entradas
    jtxtCodigo.requestFocus();//pone el cursor en el campo de texto de nombre Codigo
    } 

        

} 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtnEntrar = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtxtContraseña = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jtxtCodigo = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acceso al Sistema ");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnEntrar.setBackground(new java.awt.Color(0, 0, 0));
        jbtnEntrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnEntrar.setForeground(new java.awt.Color(0, 204, 0));
        jbtnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/LLAVES.png"))); // NOI18N
        jbtnEntrar.setText("ENTRAR");
        jbtnEntrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 255, 102), new java.awt.Color(0, 255, 0), new java.awt.Color(153, 255, 102), new java.awt.Color(102, 204, 0)));
        jbtnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEntrarActionPerformed(evt);
            }
        });
        jbtnEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnEntrarKeyPressed(evt);
            }
        });
        jPanel1.add(jbtnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 150, 50));

        jbtnSalir.setBackground(new java.awt.Color(0, 0, 0));
        jbtnSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnSalir.setForeground(new java.awt.Color(255, 0, 0));
        jbtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ELIMINAR.png"))); // NOI18N
        jbtnSalir.setText("SALIR");
        jbtnSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(255, 0, 0), new java.awt.Color(255, 51, 0), new java.awt.Color(255, 51, 51), new java.awt.Color(153, 0, 0)));
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 150, 50));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Imagen2.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, 150));

        jtxtContraseña.setBackground(new java.awt.Color(204, 0, 51));
        jtxtContraseña.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jtxtContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jtxtContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtContraseña.setText("administrador");
        jtxtContraseña.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Contraseña", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Bold", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(jtxtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 160, 80));

        jLabel6.setFont(new java.awt.Font("Snap ITC", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Poligran 2019");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, 20));

        jtxtCodigo.setBackground(new java.awt.Color(204, 0, 51));
        jtxtCodigo.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jtxtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        jtxtCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtCodigo.setText("123456");
        jtxtCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Usuario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Bold", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jtxtCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jtxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 160, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEntrarActionPerformed
 
Validacion();

    }//GEN-LAST:event_jbtnEntrarActionPerformed

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed

        int i;
        i = JOptionPane.showConfirmDialog(null, "¿Desea salir del Aplicativo?", "", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        if (i == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jbtnEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnEntrarKeyPressed
   
Validacion();

    }//GEN-LAST:event_jbtnEntrarKeyPressed

    public static void main(String args[]) {
   
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new acceso().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnEntrar;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JPasswordField jtxtCodigo;
    private javax.swing.JPasswordField jtxtContraseña;
    // End of variables declaration//GEN-END:variables
}
