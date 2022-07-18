/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DBConnection.DBConnection;
import Model.Menu;
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
public class MenuDAO {
     private Connection conn;
    public MenuDAO(){
        DBConnection dbc = new DBConnection();
        conn = dbc.getConnection();
    }
    public ArrayList<Menu> getMenus(){
        try {
            ArrayList<Menu> menus = new ArrayList<>();
            String sql = "SELECT * FROM `menu`";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String price = rs.getString("price");
                String content = rs.getString("content");
                menus.add(new Menu(id, title, price, content));
            }
            return menus;
        } catch (SQLException ex) {
            Logger.getLogger(MenuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    } 
}
