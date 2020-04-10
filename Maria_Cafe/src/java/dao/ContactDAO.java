/*
* ContactDAO.java
*
* All Right Reserved
* Copyright (c) 2020 FPT University
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import jdbc.DBContext;



/**
 * ContactDAO.<br>
 *
 * <pre>
 * Class dùng các câu query để lấy dữ liệu từ database
 * Trong class này sẽ tiến hành các xử lí dưới đây.
 *
 * . getAllContact.
 *
 * </pre>
 *
 * @author FU QuanLHHE130736
 * @version 1.0
 */
public class ContactDAO extends DBContext {

    /**
     * getAllContact.<br>
     * Lấy ra thông tin liên lac trong bản contact và đổ vào map
     *
     * @return a Map of Contact
     */
    public Map<String,String> getAllContact() {
        String sql = "SELECT * FROM dbo.Contact";
        Map<String,String> map = new HashMap<>();
        try (PreparedStatement statement = connection.prepareStatement(sql);) {
            
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                map.put(rs.getString("key"), rs.getString("value"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return map;
    }
    
}
