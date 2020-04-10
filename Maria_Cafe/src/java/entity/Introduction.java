/*
* Introduction.java
*
* All Right Reserved
* Copyright (c) 2020 FPT University
 */
package entity;

/**
 * Introduction class.<br>
 *
 * <pre>
 *Class mô tả đối tượng Introduction
 *Trong class này sẽ tiến hành các xử lí dưới đây
 *
 * . GetId.
 * . SetId.
 * . GetTitle.
 * . SetTitle.
 * . GetContent.
 * . SetContent.
 * . GetImage.
 * . SetImage.
 * . GetTitleDes.
 * . SetTitleDes.
 * . GetDescription.
 * . SetDescription.
 * . GetAddress.
 * . SetAddress.
 * . GetPhone.
 * . SetPhone.
 *
 * </pre>
 *
 * @author FU QuanLHHE130736
 * @version 1.0
 */
public class Introduction {
    /**
     * Store id.
     */
    private int id;
    /**
     * Store title.
     */
    private String title;
    /**
     * Store content.
     */
    private String content;
    /**
     * Store image.
     */
    private String image;
    /**
     * Store titleDes.
     */
    private String titleDes;
    /**
     * Store description.
     */
    private String description;
    /**
     * Store address.
     */
    private String address;
    /**
     * Store phone.
     */
    private String phone;
    /**
     * Constructor.<br>
     */
    public Introduction() {
    }
    /**
     * Constructor full parameter<br>
     *
     * @param id the id
     * @param title the title
     * @param content the content
     * @param image the image
     * @param titleDes the titleDes
     * @param description the description
     * @param address the address
     * @param phone the phone
     */
    public Introduction(int id, String title, String content, String image, String titleDes, String description, String address, String phone) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.image = image;
        this.titleDes = titleDes;
        this.description = description;
        this.address = address;
        this.phone = phone;
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
     * Get title.<br>
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }
    /**
     * Set title.<br>
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
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
    /**
     * Get titleDes.<br>
     *
     * @return the titleDes
     */
    public String getTitleDes() {
        return titleDes;
    }
    /**
     * Set titleDes.<br>
     *
     * @param titleDes the titleDes
     */
    public void setTitleDes(String titleDes) {
        this.titleDes = titleDes;
    }
    /**
     * Get description.<br>
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }
    /**
     * Set description.<br>
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * Get address.<br>
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }
    /**
     * Set address.<br>
     *
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * Get phone.<br>
     *
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }
    /**
     * Set phone.<br>
     *
     * @param phone the phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}
