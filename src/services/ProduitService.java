/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entites.Produit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DataSource;

/**
 *
 * @author USER
 */
public class ProduitService implements InterfaceService<Produit>{
    
    
    private Connection cnx;
    private Statement ste;
    private PreparedStatement pst;
    private ResultSet result;

    public ProduitService() {
        
    cnx = DataSource.getInstance().getConnection();
 
    }

    @Override
    public void add(Produit p) {
        try {
            String requete = "insert into Produit(id_produit,reference_produit,nom_produit,marque_produit,categorie_produit,sexe,prix_produit) values(?,?,?,?,?,?,?)";
            pst = cnx.prepareStatement(requete);
            pst.setInt(1, p.getId_produit());
            pst.setInt(2, p.getReference_produit());
            pst.setString(3, p.getNom_produit());
            pst.setString(4, p.getMarque_produit());
            pst.setString(5, p.getCategorie_produit());
            pst.setString(6, p.getSexe());
            pst.setFloat(7, p.getPrix_produit());
            
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProduitService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    public void delete(Produit t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Produit readById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Produit> readAll() {
         ArrayList<Produit> list = new ArrayList<>();
        try {
            String requete = "select * from produit";
           
            ste = cnx.createStatement();
            result = ste.executeQuery(requete);
            while (result.next()) {
                Produit p = new Produit(result.getInt("id_produit"),result.getInt("reference_produit") ,result.getString("nom_produit"), result.getString("marque_produit"),result.getString("categorie_produit"),result.getString("sexe") ,result.getInt("prix_produit"));
                list.add(p);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProduitService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public void update(Produit t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
