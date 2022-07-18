/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.DBConnection;
import Model.Image;
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
public class ImageDAO {
    public Connection conn;

    public ImageDAO() {
        DBConnection dBConnection = new DBConnection();
        this.conn = dBConnection.getConnection();

    }

    public ArrayList<Image> getImages() {
        try {
            ArrayList<Image> images = new ArrayList<>();
            String sql = "SELECT * FROM `image`";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String image = rs.getString("image");
                images.add(new Image(id, image));
            }
            return images;
        } catch (SQLException ex) {
            Logger.getLogger(ImageDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
