/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.DBConnection;
import Model.Entry;
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
public class EntryDAO {
      public Connection conn;

    public EntryDAO() {
        DBConnection dBConnection = new DBConnection();
        this.conn = dBConnection.getConnection();

    }

    public ArrayList<Entry> getEntrys() {
        try {
            ArrayList<Entry> entrys = new ArrayList<>();
            String sql = "SELECT * FROM `entry`";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String image = rs.getString("image");
                String content = rs.getString("content");
                entrys.add(new Entry(id, title, image, content));
            }
            return entrys;
        } catch (SQLException ex) {
            Logger.getLogger(EntryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
