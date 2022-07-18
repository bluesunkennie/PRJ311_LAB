/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DBConnection.DBConnection;
import Model.Entry;
import java.sql.Connection;
import java.sql.Date;
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
    private Connection conn;
    
    public EntryDAO(){
        DBConnection dbc = new DBConnection();
        conn = dbc.getConnection();// get connection
    }
    
    public ArrayList<Entry> getEntrys(){
        try {
            ArrayList<Entry> entrys = new  ArrayList<>();
            String sql = "SELECT * FROM `entry`";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
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
    
    public Entry getEntry(int id){
        try {
            String sql = "SELECT * FROM `entry` WHERE id =?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            //store blog
            while(rs.next()){
                String name = rs.getString("id");
                String title = rs.getString("title");
                String image = rs.getString("image");
                String content = rs.getString("content");
                Date date = rs.getDate("date");
                return new Entry(id, title, image, content);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EntryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
