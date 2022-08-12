/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class DataSource {
    private String url = "jdbc:mysql://localhost:3306/projet";
    private String login = "root";
    private String pwd = "";
    private Connection connection;
    private static DataSource instance;

    private DataSource() {
        try {
            connection = DriverManager.getConnection(url, login, pwd);
            System.out.println("rrrrrrrrr");
        } catch (SQLException ex) {
            Logger.getLogger(DataSource.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static DataSource getInstance(){
        if(instance==null)
            instance=new DataSource();
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
    
}
