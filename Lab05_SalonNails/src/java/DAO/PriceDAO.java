/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.DBConnection;
import Model.Price;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class PriceDAO {
     public Connection conn;

    public PriceDAO() {
        DBConnection dBConnection = new DBConnection();
        this.conn = dBConnection.getConnection();

    }

    public ArrayList<Price> getPrices() {
        try {
            ArrayList<Price> prices = new ArrayList<>();
            String sql = "SELECT * FROM `price`";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String price = rs.getString("price");
                prices.add(new Price(id, title, price));
            }
            return prices;
        } catch (SQLException ex) {
            Logger.getLogger(PriceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
