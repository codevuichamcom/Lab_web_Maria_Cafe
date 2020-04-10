/*
* IntroductionDAO.java
*
* All Right Reserved
* Copyright (c) 2020 FPT University
 */
package dao;

import entity.Introduction;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import jdbc.DBContext;

/**
 * IntroductionDAO.<br>
 *
 * <pre>
 * Class dùng các câu query để lấy dữ liệu từ database
 * Trong class này sẽ tiến hành các xử lí dưới đây.
 *
 * . getIntroduction.
 *
 * </pre>
 *
 * @author FU QuanLHHE130736
 * @version 1.0
 */
public class IntroductionDAO extends DBContext{
    /**
     * getIntroduction.<br>
     * Lấy ra thông tin giới thiệu đầu tiên trong bảng Introduction
     *
     * @return a Introduction
     */
    public Introduction getIntroduction() {
        String sql = "SELECT TOP(1)* FROM dbo.Introduction";
        try (PreparedStatement statement = connection.prepareStatement(sql);) {
            
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                Introduction intro = new Introduction();
                intro.setId(rs.getInt("id"));
                intro.setTitle(rs.getString("title"));
                intro.setContent(rs.getString("content"));
                intro.setImage(rs.getString("image"));
                intro.setTitleDes(rs.getString("titleDes"));
                intro.setDescription(rs.getString("description"));
                intro.setAddress(rs.getString("address"));
                intro.setPhone(rs.getString("phone"));
                return intro;
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }
}
