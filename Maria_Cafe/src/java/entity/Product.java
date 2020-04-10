/*
* Product.java
*
* All Right Reserved
* Copyright (c) 2020 FPT University
 */
package entity;

import java.sql.Date;

/**
 * Product class.<br>
 *
 * <pre>
 *Class mô tả đối tượng Product
 *Trong class này sẽ tiến hành các xử lí dưới đây
 *
 * . GetId.
 * . SetId.
 * . GetName.
 * . SetName.
 * . GetPrice.
 * . SetPrice.
 * . GetContent.
 * . SetContent.
 * . GetCreatedDate.
 * . SetCreatedDate.
 * . GetImage.
 * . SetImage.
 *
 * </pre>
 *
 * @author FU QuanLHHE130736
 * @version 1.0
 */
public class Product {
    /**
     * Store id.
     */
    private int id;
    /**
     * Store name.
     */
    private String name;
    /**
     * Store price.
     */
    private double price;
    /**
     * Store content.
     */
    private String content;
    /**
     * Store createDate.
     */
    private Date createDate;
    /**
     * Store image.
     */
    private String image;
    /**
     * Constructor.<br>
     */
    public Product() {
    }
    /**
     * Constructor full parameter<br>
     *
     * @param id the id
     * @param name the name
     * @param price the price
     * @param content the content
     * @param createDate the createDate
     * @param image the image
     */
    public Product(int id, String name, double price, String content, Date createDate, String image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.content = content;
        this.createDate = createDate;
        this.image = image;
    }
    /**
     * Get id.<br>
     *
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * Set id.<br>
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Get name.<br>
     *
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * Set name.<br>
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Get price.<br>
     *
     * @return the price
     */
    public double getPrice() {
        return price;
    }
    /**
     * Set price.<br>
     *
     * @param price the price
     */
    public void setPrice(double price) {
        this.price = price;
    }
    /**
     * Get content.<br>
     *
     * @return the content
     */
    public String getContent() {
        return content;
    }
     /**
     * Set content.<br>
     *
     * @param content the content
     */
    public void setContent(String content) {
        this.content = content;
    }
    /**
     * Get createDate.<br>
     *
     * @return the createDate
     */
    public Date getCreateDate() {
        return createDate;
    }
    /**
     * Set createDate.<br>
     *
     * @param createDate the createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    /**
     * Get image.<br>
     *
     * @return the image
     */
    public String getImage() {
        return image;
    }
    /**
     * Set image.<br>
     *
     * @param image the image
     */
    public void setImage(String image) {
        this.image = image;
    }
    
}
