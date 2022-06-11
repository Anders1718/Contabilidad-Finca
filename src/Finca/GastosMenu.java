/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Finca;
import InicioPrincipal.ColorFondo;
import java.awt.Image;
import java.awt.Toolkit;
/**
 *
 * @author User
 */
public class GastosMenu extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public GastosMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle(Conexion.nombreNegocio+": productos");
        transpareciaBoton();
        //setIconImage(new ImageIcon(getClass().getResource("imagenes1/LogoFamil.png")).getImage());
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

        jButtonRegistrar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonIngreso = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonRegistrar.setBackground(new java.awt.Color(0, 153, 51));
        jButtonRegistrar.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonRegistrar.setForeground(new java.awt.Color(51, 51, 51));
        jButtonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/trabajador.png"))); // NOI18N
        jButtonRegistrar.setText("TRABAJADORES");
        jButtonRegistrar.setBorderPainted(false);
        jButtonRegistrar.setFocusPainted(false);
        jButtonRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonRegistrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 230, 240));

        jButtonBuscar.setBackground(new java.awt.Color(102, 51, 255));
        jButtonBuscar.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(51, 51, 51));
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/fertilizer.png"))); // NOI18N
        jButtonBuscar.setText("INSUMOS");
        jButtonBuscar.setBorderPainted(false);
        jButtonBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 230, 170));

        jButtonIngreso.setBackground(new java.awt.Color(255, 153, 51));
        jButtonIngreso.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonIngreso.setForeground(new java.awt.Color(51, 51, 51));
        jButtonIngreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/inventario bien.png"))); // NOI18N
        jButtonIngreso.setText("OTROS GASTOS");
        jButtonIngreso.setBorder(null);
        jButtonIngreso.setBorderPainted(false);
        jButtonIngreso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonIngreso.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 320, 300, 250));

        jButtonModificar.setBackground(new java.awt.Color(255, 0, 51));
        jButtonModificar.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonModificar.setForeground(new java.awt.Color(51, 51, 51));
        jButtonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/pago.png"))); // NOI18N
        jButtonModificar.setText("PAGO TRABAJADORES");
        jButtonModificar.setBorderPainted(false);
        jButtonModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 60, 300, 230));

        jButtonAtras.setBackground(new java.awt.Color(153, 153, 0));
        jButtonAtras.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonAtras.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/atrasBlanco.png"))); // NOI18N
        jButtonAtras.setBorderPainted(false);
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 80, 40));

        jLabelLogo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/cajon_1.png"))); // NOI18N
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, -1, -1));

        jLabelFondo.setBackground(new java.awt.Color(ColorFondo.getColor1(), ColorFondo.getColor2(), ColorFondo.getColor3()));
        jLabelFondo.setOpaque(true);
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 0, 1310, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void transpareciaBoton(){
        jButtonAtras.setOpaque(false);
        jButtonAtras.setContentAreaFilled(false);
        jButtonAtras.setBorderPainted(false);
        jButtonModificar.setOpaque(false);
        jButtonModificar.setContentAreaFilled(false);
        jButtonModificar.setBorderPainted(false);
       jButtonIngreso.setOpaque(false);
        jButtonIngreso.setContentAreaFilled(false);
        jButtonIngreso.setBorderPainted(false);
        jButtonBuscar.setOpaque(false);
        jButtonBuscar.setContentAreaFilled(false);
       jButtonBuscar.setBorderPainted(false);
       jButtonRegistrar.setOpaque(false);
        jButtonRegistrar.setContentAreaFilled(false);
        jButtonRegistrar.setBorderPainted(false);
    }
    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        RegistrarTrabajador R = new RegistrarTrabajador();
        R.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        Insumo B = new Insumo();
        B.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresoActionPerformed
        OtroGasto In = new OtroGasto();
        In.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonIngresoActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        PagarTrabajador M = new PagarTrabajador();
        M.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        InicioFinca I = new InicioFinca();
        I.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(GastosMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GastosMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GastosMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GastosMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new GastosMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonIngreso;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelLogo;
    // End of variables declaration//GEN-END:variables
}
