/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Finca;

import InicioPrincipal.ColorFondo;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author User
 */
public class RegistrarVaca extends javax.swing.JFrame {
    String user = Conexion.user;
    String clave = Conexion.clave;
    String url = Conexion.url;
    Connection con;
    Statement stmt;
    ResultSet rs;
    /**
     * Creates new form Inicio
     */
    public RegistrarVaca() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle(Conexion.nombreNegocio+": registrar cliente");
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(RegistrarVaca.class.getName()).log(Level.SEVERE, null, ex);
            }
        seleccionarPredio();
            
       
    }
    public Image getIconImage(){
       Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes1/icono.png"));
       return retValue;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNombres1 = new javax.swing.JLabel();
        jLabelPrecio3 = new javax.swing.JLabel();
        jTextFieldEntrada = new javax.swing.JTextField();
        jLabelPrecio4 = new javax.swing.JLabel();
        jTextFieldSecado = new javax.swing.JTextField();
        jTextChapeta = new javax.swing.JTextField();
        jComboBoxPredio = new javax.swing.JComboBox<>();
        jLabelNombres = new javax.swing.JLabel();
        jLabelPrecio1 = new javax.swing.JLabel();
        jLabelPrecio5 = new javax.swing.JLabel();
        jTextFieldServicio = new javax.swing.JTextField();
        jTextFieldNacimiento = new javax.swing.JTextField();
        jButtonListo = new javax.swing.JButton();
        jButtonCancelar1 = new javax.swing.JButton();
        jLabelPrecio2 = new javax.swing.JLabel();
        jTextFieldCantidadPartos = new javax.swing.JTextField();
        jButtonAtras1 = new javax.swing.JButton();
        jButtonInicio = new javax.swing.JButton();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldParto = new javax.swing.JTextField();
        jLabelLogo = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombres1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelNombres1.setForeground(new java.awt.Color(51, 51, 51));
        jLabelNombres1.setText("PREDIO:");
        getContentPane().add(jLabelNombres1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 110, -1));

        jLabelPrecio3.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelPrecio3.setForeground(new java.awt.Color(51, 51, 51));
        jLabelPrecio3.setText("FECHA ÚLTIMO SECADO:");
        getContentPane().add(jLabelPrecio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 300, -1));

        jTextFieldEntrada.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextFieldEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEntradaActionPerformed(evt);
            }
        });
        jTextFieldEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldEntradaKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 240, -1));

        jLabelPrecio4.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelPrecio4.setForeground(new java.awt.Color(51, 51, 51));
        jLabelPrecio4.setText("FECHA DE ENTRADA:");
        getContentPane().add(jLabelPrecio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 250, -1));

        jTextFieldSecado.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextFieldSecado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSecadoActionPerformed(evt);
            }
        });
        jTextFieldSecado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSecadoKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldSecado, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 280, -1));

        jTextChapeta.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextChapeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextChapetaActionPerformed(evt);
            }
        });
        jTextChapeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextChapetaKeyTyped(evt);
            }
        });
        getContentPane().add(jTextChapeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 430, -1));

        jComboBoxPredio.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        getContentPane().add(jComboBoxPredio, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 250, 40));

        jLabelNombres.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelNombres.setForeground(new java.awt.Color(51, 51, 51));
        jLabelNombres.setText("CHAPETA:");
        getContentPane().add(jLabelNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 140, -1));

        jLabelPrecio1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelPrecio1.setForeground(new java.awt.Color(51, 51, 51));
        jLabelPrecio1.setText("PARTOS:");
        getContentPane().add(jLabelPrecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 110, -1));

        jLabelPrecio5.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelPrecio5.setForeground(new java.awt.Color(51, 51, 51));
        jLabelPrecio5.setText("FECHA ÚLTIMO SERVICIO:");
        getContentPane().add(jLabelPrecio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 310, -1));

        jTextFieldServicio.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextFieldServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldServicioActionPerformed(evt);
            }
        });
        jTextFieldServicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldServicioKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 280, -1));

        jTextFieldNacimiento.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextFieldNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNacimientoActionPerformed(evt);
            }
        });
        jTextFieldNacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNacimientoKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 240, -1));

        jButtonListo.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonListo.setForeground(new java.awt.Color(51, 51, 51));
        jButtonListo.setText("REGISTRAR");
        jButtonListo.setBorderPainted(false);
        jButtonListo.setContentAreaFilled(false);
        jButtonListo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonListo, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 550, 230, 60));

        jButtonCancelar1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonCancelar1.setForeground(new java.awt.Color(51, 51, 51));
        jButtonCancelar1.setText("CANCELAR");
        jButtonCancelar1.setBorderPainted(false);
        jButtonCancelar1.setContentAreaFilled(false);
        jButtonCancelar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 550, 160, 60));

        jLabelPrecio2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelPrecio2.setForeground(new java.awt.Color(51, 51, 51));
        jLabelPrecio2.setText("FECHA DE NACIMIENTO:");
        getContentPane().add(jLabelPrecio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 280, -1));

        jTextFieldCantidadPartos.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextFieldCantidadPartos.setText("0");
        jTextFieldCantidadPartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCantidadPartosActionPerformed(evt);
            }
        });
        jTextFieldCantidadPartos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCantidadPartosKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldCantidadPartos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 280, -1));

        jButtonAtras1.setBackground(new java.awt.Color(153, 153, 0));
        jButtonAtras1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonAtras1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtras1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/atrasBlanco.png"))); // NOI18N
        jButtonAtras1.setBorderPainted(false);
        jButtonAtras1.setContentAreaFilled(false);
        jButtonAtras1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonAtras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtras1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 100, 40));

        jButtonInicio.setBackground(new java.awt.Color(153, 0, 153));
        jButtonInicio.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonInicio.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/inicio.png"))); // NOI18N
        jButtonInicio.setBorderPainted(false);
        jButtonInicio.setContentAreaFilled(false);
        jButtonInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 30, -1, -1));

        jLabelTelefono.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelTelefono.setForeground(new java.awt.Color(51, 51, 51));
        jLabelTelefono.setText("FECHA ÚLTIMO PARTO:");
        getContentPane().add(jLabelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        jTextFieldParto.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextFieldParto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPartoActionPerformed(evt);
            }
        });
        jTextFieldParto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPartoKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldParto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 240, -1));

        jLabelLogo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/icono.png"))); // NOI18N
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 290, -1, -1));

        jLabelFondo.setBackground(new java.awt.Color(ColorFondo.getColor1(), ColorFondo.getColor2(), ColorFondo.getColor3()));
        jLabelFondo.setOpaque(true);
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    void seleccionarPredio(){
        try {
             
            con = DriverManager.getConnection(url, user, clave);
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM nombre_finca");

                while(rs.next()){
                    jComboBoxPredio.addItem(rs.getString(2));
                }
        
            
        } catch (SQLException ex) {
            Logger.getLogger(Predios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void jTextChapetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextChapetaKeyTyped
        char c= evt.getKeyChar();
        if(Character.isLowerCase(c)){
            String cad=(""+c).toUpperCase();
            c= cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_jTextChapetaKeyTyped

    private void jTextFieldNacimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNacimientoKeyTyped
        char c= evt.getKeyChar();
        if(Character.isLowerCase(c)){
            String cad=(""+c).toUpperCase();
            c= cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_jTextFieldNacimientoKeyTyped

    private void jTextFieldNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNacimientoActionPerformed

    private void jButtonListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListoActionPerformed
        if(jTextChapeta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No ingresó el número de chapeta");
        }
            
        else if(jTextFieldNacimiento.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No ingresó la fecha de nacimiento");
            
        }else if(jTextFieldEntrada.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No ingresó la fecha de entrada");
        }
        else if(jTextFieldParto.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No ingresó la fecha\ndel último parto");
        }else if(jTextFieldCantidadPartos.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No ingresó la cantidad de partos");
        }else if(jTextFieldSecado.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No ingresó la fecha del último secado");
        }else if(jTextFieldServicio.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No ingresó la fecha del último servicio");
        }
        
        else{
            
            
        
            try {
                con = DriverManager.getConnection(url, user, clave);
                stmt = con.createStatement();
                stmt.executeUpdate("INSERT INTO vacas VALUES('0', '"+jTextChapeta.getText()+"' , "
                        + "'"+jTextFieldNacimiento.getText()+"' , "
                                + "'"+jTextFieldParto.getText()+"' ,"
                                        + "'"+jTextFieldCantidadPartos.getText()+"' , "
                                                + "'"+jTextFieldSecado.getText()+"' ,"
                                                        + "'"+jTextFieldEntrada.getText()+"',"
                                                                + "'N/A' , "
                                                                + "'"+jTextFieldServicio.getText()+"' , "
                                                                        + "'"+jComboBoxPredio.getSelectedItem().toString()+"')");
            } catch (SQLException ex) {
                Logger.getLogger(RegistrarVaca.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            JOptionPane.showMessageDialog(null, "Registro exitoso");
            
            jTextChapeta.setText("");
            jTextFieldCantidadPartos.setText("");

        }
    }//GEN-LAST:event_jButtonListoActionPerformed

    private void jButtonCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelar1ActionPerformed
        
        jTextFieldParto.setText("");
            
            jTextFieldNacimiento.setText("");
            jTextChapeta.setText("");
            jTextFieldCantidadPartos.setText("");
    }//GEN-LAST:event_jButtonCancelar1ActionPerformed

    private void jTextChapetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextChapetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextChapetaActionPerformed

    private void jTextFieldCantidadPartosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCantidadPartosKeyTyped
        char n = evt.getKeyChar();
        if(n < '0' || n> '9') evt.consume();
        if(jTextFieldCantidadPartos.getText().length()>= 10){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldCantidadPartosKeyTyped

    private void jTextFieldCantidadPartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCantidadPartosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCantidadPartosActionPerformed

    private void jButtonAtras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtras1ActionPerformed
        Vacas I = new Vacas();
        I.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAtras1ActionPerformed

    private void jButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioActionPerformed
        InicioFinca I = new InicioFinca();
        I.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonInicioActionPerformed

    private void jTextFieldPartoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPartoKeyTyped
        char c= evt.getKeyChar();
        if(Character.isLowerCase(c)){
            String cad=(""+c).toUpperCase();
            c= cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_jTextFieldPartoKeyTyped

    private void jTextFieldPartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPartoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPartoActionPerformed

    private void jTextFieldSecadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSecadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSecadoActionPerformed

    private void jTextFieldSecadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSecadoKeyTyped
        char c= evt.getKeyChar();
        if(Character.isLowerCase(c)){
            String cad=(""+c).toUpperCase();
            c= cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_jTextFieldSecadoKeyTyped

    private void jTextFieldEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEntradaActionPerformed

    private void jTextFieldEntradaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEntradaKeyTyped
        char c= evt.getKeyChar();
        if(Character.isLowerCase(c)){
            String cad=(""+c).toUpperCase();
            c= cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_jTextFieldEntradaKeyTyped

    private void jTextFieldServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldServicioActionPerformed

    private void jTextFieldServicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldServicioKeyTyped
        char c= evt.getKeyChar();
        if(Character.isLowerCase(c)){
            String cad=(""+c).toUpperCase();
            c= cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_jTextFieldServicioKeyTyped

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
            java.util.logging.Logger.getLogger(RegistrarVaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarVaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarVaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarVaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarVaca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonAtras1;
    public javax.swing.JButton jButtonCancelar1;
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonListo;
    public static javax.swing.JComboBox<String> jComboBoxPredio;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelNombres;
    private javax.swing.JLabel jLabelNombres1;
    private javax.swing.JLabel jLabelPrecio1;
    private javax.swing.JLabel jLabelPrecio2;
    private javax.swing.JLabel jLabelPrecio3;
    private javax.swing.JLabel jLabelPrecio4;
    private javax.swing.JLabel jLabelPrecio5;
    private javax.swing.JLabel jLabelTelefono;
    public javax.swing.JTextField jTextChapeta;
    private javax.swing.JTextField jTextFieldCantidadPartos;
    public javax.swing.JTextField jTextFieldEntrada;
    public javax.swing.JTextField jTextFieldNacimiento;
    private javax.swing.JTextField jTextFieldParto;
    private javax.swing.JTextField jTextFieldSecado;
    private javax.swing.JTextField jTextFieldServicio;
    // End of variables declaration//GEN-END:variables
}
