/*
* About.java
*
* All Right Reserved
* Copyright (c) 2020 FPT University
 */
package entity;

/**
 * About.<br>
 *
 * <pre>
 *Class mô tả đối tượng About
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
 *
 * </pre>
 *
 * @author FU QuanLHHE130736
 * @version 1.0
 */
public class About {

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
     * Constructor.<br>
     */
    public About() {
    }
    /**
     * Constructor full parameter<br>
     *
     * @param id the id
     * @param title the title
     * @param content the content
     * @param image the image
     */
    public About(int id, String title, String content, String image) {
        this.id = id;
        this.title = title;
        this.content = content;
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

}
