/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.DAO;

import Models.Entities.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KhangNVCE140224
 */
public class CategoryDAO {
    Category bean = new Category();
    Connection conn;
    DBConnection db = new DBConnection();
    
    public ArrayList<Category> allCategoriess() {
        ArrayList<Category> allCategory = new ArrayList<>();
        
        try {
            PreparedStatement pst = conn.prepareStatement("SELECT * from category ");
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                Category category = new Category();
                category.setcId(rs.getInt("cId"));
                category.setcName(rs.getString("cName"));
                allCategory.add(category);
            }
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        return allCategory;
    }
}
