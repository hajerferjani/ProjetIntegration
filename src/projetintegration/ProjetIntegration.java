/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package projetintegration;


import entites.Produit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.Statement;
import services.ProduitService;
import util.DataSource;

/**
 *
 * @author USER
 */
public class ProjetIntegration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       ProduitService ps=new ProduitService();
       
        //ps.add(new Produit(12, 1111, "rouge a levre", "fatales", "naarech", "femme", (float) 12.57));
       System.out.println(ps.readAll());

    }
    
}
