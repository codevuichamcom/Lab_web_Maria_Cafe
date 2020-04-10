/*
* AboutDAO.java
*
* All Right Reserved
* Copyright (c) 2020 FPT University
 */
package dao;

import entity.About;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import jdbc.DBContext;



/**
 * AboutDAO.<br>
 *
 * <pre>
 * Class dùng các câu query để lấy dữ liệu từ database
 * Trong class này sẽ tiến hành các xử lí dưới đây.
 *
 * . getAbout.
 *
 * </pre>
 *
 * @author FU QuanLHHE130736
 * @version 1.0
 */
public class AboutDAO extends DBContext {

    /**
     * getAbout.<br>
     * Lấy ra about đầu tiên trong bảng About
     *
     * @return a About
     */
    public About getAbout() {
        String sql = "SELECT TOP(1)* FROM dbo.About";
        try (PreparedStatement statement = connection.prepareStatement(sql);) {
            
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                About about = new About();
                about.setId(rs.getInt("id"));
                about.setTitle(rs.getString("title"));
                about.setContent(rs.getString("content"));
                about.setImage(rs.getString("image"));
                return about;
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }
}
