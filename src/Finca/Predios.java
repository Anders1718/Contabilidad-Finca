/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Finca;

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
public class Predios {
    static String user = Conexion.user;
    static String clave = Conexion.clave;
    static String url = Conexion.url;
    static Connection con;
    static Statement stmt;
    static ResultSet rs;

    public Predios() {
        
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(RegistrarVaca.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    
    
    
    
    
}
