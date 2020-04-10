/*
* ProductDAO.java
*
* All Right Reserved
* Copyright (c) 2020 FPT University
 */
package dao;

import entity.Product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.DBContext;

/**
 * ProductDAO.<br>
 *
 * <pre>
 * Class dùng các câu query để lấy dữ liệu từ database
 * Trong class này sẽ tiến hành các xử lí dưới đây.
 *
 * . getTop2Product.
 * . getProductById.
 *
 * </pre>
 *
 * @author FU QuanLHHE130736
 * @version 1.0
 */
public class ProductDAO extends DBContext{
    /**
     * getTop2Product.<br>
     * Lấy ra top 2 sản phẩm gần nhất
     *
     * @return a List of Product
     */
    public List<Product> getTop2Product() {
        String sql = "SELECT TOP(2)* FROM dbo.Product ORDER BY createDate DESC";
        List<Product> listProduct = new ArrayList<>();
        try (PreparedStatement statement = connection.prepareStatement(sql);) {
            
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setPrice(rs.getDouble("price"));
                product.setContent(rs.getString("content"));
                product.setCreateDate(rs.getDate("createDate"));
                product.setImage(rs.getString("image"));
                listProduct.add(product);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return listProduct;
    }
    /**
     * getProductById.<br>
     * Lấy ra sản phẩm tương ứng với id truyền vào
     *
     * @param id the id
     * @return a List of Product
     */
    public Product getProductById(int id) {
        String sql = "SELECT * FROM dbo.Product WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql);) {
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setPrice(rs.getDouble("price"));
                product.setContent(rs.getString("content"));
                product.setCreateDate(rs.getDate("createDate"));
                product.setImage(rs.getString("image"));
                return product;
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

}
