/**
 *
 * @author Jhon H Riaño
 */
package email;
import VISTA.plataforma;
import MODELO.Arreglo_Propietario;
import javax.swing.ImageIcon;


public class email extends javax.swing.JFrame {
//        Arreglo_Propietario pro;
        Mail mail = new Mail();
        public email() {
        initComponents();
        setIconImage (new ImageIcon(getClass().getResource("/icon/29.png")).getImage()); 
        this.setLocationRelativeTo(null);//PONER AL CENTRO EL FORMULARIO     
//        pro=new Arreglo_Propietario();  
//         int posFound = pro
//        this.jTxtEmisor.   setText(pro.RecuperarObj(posFound).getCorreo());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        jTxtEmisor = new javax.swing.JTextField();
        jTexAsunto = new javax.swing.JTextField();
        jTexDestino = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextResumen = new javax.swing.JTextArea();
        jPassword = new javax.swing.JPasswordField();
        jbtnEnviar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Envio de Correos");
        setResizable(false);

        jcMousePanel1.setColor1(new java.awt.Color(0, 102, 153));
        jcMousePanel1.setColor2(new java.awt.Color(0, 102, 204));
        jcMousePanel1.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/icon/agregar usuario.png"))); // NOI18N
        jcMousePanel1.setModo(2);
        jcMousePanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTxtEmisor.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jTxtEmisor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtEmisor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "De:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 14))); // NOI18N
        jcMousePanel1.add(jTxtEmisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 250, 60));

        jTexAsunto.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jTexAsunto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTexAsunto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Asunto:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 14))); // NOI18N
        jcMousePanel1.add(jTexAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 450, 70));

        jTexDestino.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jTexDestino.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTexDestino.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Para:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 14))); // NOI18N
        jcMousePanel1.add(jTexDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 450, 70));

        jTextResumen.setColumns(20);
        jTextResumen.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jTextResumen.setRows(5);
        jTextResumen.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONTENIDO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 14))); // NOI18N
        jScrollPane1.setViewportView(jTextResumen);

        jcMousePanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 530, 130));

        jPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contraseña", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 14))); // NOI18N
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        jcMousePanel1.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 200, 60));

        jbtnEnviar.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jbtnEnviar.setText("Enviar");
        jbtnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEnviarActionPerformed(evt);
            }
        });
        jcMousePanel1.add(jbtnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 80, 70));

        jLabel5.setFont(new java.awt.Font("Snap ITC", 0, 13)); // NOI18N
        jLabel5.setText("Poligran 2019");
        jcMousePanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, 20));

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel6.setText("Derechos Reservados   2019 COPY RIGHT ® ");
        jcMousePanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEnviarActionPerformed
        mail.setFrom( this.jTxtEmisor.getText() );
        mail.setPassword( this.jPassword.getPassword() );        
        mail.setTo( this.jTexDestino.getText() );
        mail.setSubject( this.jTexAsunto.getText() );
        mail.setMessage( this.jTextResumen.getText() );
        mail.SEND();
    }//GEN-LAST:event_jbtnEnviarActionPerformed

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
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
            java.util.logging.Logger.getLogger(email.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(email.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(email.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(email.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new email().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTexAsunto;
    private javax.swing.JTextField jTexDestino;
    private javax.swing.JTextArea jTextResumen;
    private javax.swing.JTextField jTxtEmisor;
    private javax.swing.JButton jbtnEnviar;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    // End of variables declaration//GEN-END:variables
}
