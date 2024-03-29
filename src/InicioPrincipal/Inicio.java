/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InicioPrincipal;

import Finca.Leche;
import Finca.Conexion;
import Finca.InicioFinca;
import Finca.GastosMenu;
import Finca.FincaMod;
import Turbo.InicioTurbo;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
/**
 *
 * @author User
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        this.setTitle(Conexion.getNombreNegocio()+": inicio");
        this.setLocationRelativeTo(null);
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

        jButtonInventario = new javax.swing.JButton();
        jButtonClientes = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonInventario.setBackground(new java.awt.Color(0, 0, 0));
        jButtonInventario.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonInventario.setForeground(new java.awt.Color(51, 51, 51));
        jButtonInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/vaca.png"))); // NOI18N
        jButtonInventario.setAutoscrolls(true);
        jButtonInventario.setBorderPainted(false);
        jButtonInventario.setContentAreaFilled(false);
        jButtonInventario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonInventario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInventarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 250, 310));

        jButtonClientes.setBackground(new java.awt.Color(0, 0, 0));
        jButtonClientes.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButtonClientes.setForeground(new java.awt.Color(51, 51, 51));
        jButtonClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/turbo.png"))); // NOI18N
        jButtonClientes.setAutoscrolls(true);
        jButtonClientes.setBorderPainted(false);
        jButtonClientes.setContentAreaFilled(false);
        jButtonClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClientesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 290, 310));

        jLabelFondo.setBackground(new java.awt.Color(ColorFondo.getColor1(), ColorFondo.getColor2(), ColorFondo.getColor3()));
        jLabelFondo.setOpaque(true);
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClientesActionPerformed
        InicioTurbo R = new InicioTurbo();
        R.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonClientesActionPerformed

    private void jButtonInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInventarioActionPerformed
        InicioFinca M = new InicioFinca();
        M.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonInventarioActionPerformed
    public void transpareciaBoton(){

        
       jButtonInventario.setOpaque(false);
        jButtonInventario.setContentAreaFilled(false);
        jButtonInventario.setBorderPainted(false);
        jButtonClientes.setOpaque(false);
        jButtonClientes.setContentAreaFilled(false);
       jButtonClientes.setBorderPainted(false);
    }
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClientes;
    private javax.swing.JButton jButtonInventario;
    private javax.swing.JLabel jLabelFondo;
    // End of variables declaration//GEN-END:variables
}
