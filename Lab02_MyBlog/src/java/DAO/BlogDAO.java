/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DBConnection.DBConnection;
import Model.Blog;
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
public class BlogDAO {

    public Connection conn;

    public BlogDAO() {
        DBConnection dBConnection = new DBConnection();
        this.conn = dBConnection.getConnection();

    }

    public ArrayList<Blog> getBlogs() {
        try {
            ArrayList<Blog> blogs = new ArrayList<>();
            String sql = "SELECT * FROM `blog` ORDER BY date DESC";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String picture = rs.getString("picture");
                String content = rs.getString("content");
                Date date = rs.getDate("date");
                blogs.add(new Blog(id, name, picture, content, date));
            }
            return blogs;
        } catch (SQLException ex) {
            Logger.getLogger(BlogDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Blog getBlog(int id) {
        try {
            String sql = "SELECT * FROM `blog` WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String picture = rs.getString("picture");
                String content = rs.getString("content");
                Date date = rs.getDate("date");
                return new Blog(id, name, picture, content, date);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BlogDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
