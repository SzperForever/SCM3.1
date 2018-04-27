package com.jabil.pojo;

import javax.persistence.*;

public class Icon {
    @Id
    @Column(name = "IconId")
    private Integer iconid;

    private Integer id;

    @Column(name = "DocTypeId")
    private Integer doctypeid;

    @Column(name = "CataId")
    private Integer cataid;

    @Column(name = "DepartId")
    private Integer departid;

    @Column(name = "TagId")
    private Integer tagid;

    private String icon;

    @Column(name = "iconColor")
    private String iconcolor;

    /**
     * @return IconId
     */
    public Integer getIconid() {
        return iconid;
    }

    /**
     * @param iconid
     */
    public void setIconid(Integer iconid) {
        this.iconid = iconid;
    }

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return DocTypeId
     */
    public Integer getDoctypeid() {
        return doctypeid;
    }

    /**
     * @param doctypeid
     */
    public void setDoctypeid(Integer doctypeid) {
        this.doctypeid = doctypeid;
    }

    /**
     * @return CataId
     */
    public Integer getCataid() {
        return cataid;
    }

    /**
     * @param cataid
     */
    public void setCataid(Integer cataid) {
        this.cataid = cataid;
    }

    /**
     * @return DepartId
     */
    public Integer getDepartid() {
        return departid;
    }

    /**
     * @param departid
     */
    public void setDepartid(Integer departid) {
        this.departid = departid;
    }

    /**
     * @return TagId
     */
    public Integer getTagid() {
        return tagid;
    }

    /**
     * @param tagid
     */
    public void setTagid(Integer tagid) {
        this.tagid = tagid;
    }

    /**
     * @return icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * @return iconColor
     */
    public String getIconcolor() {
        return iconcolor;
    }

    /**
     * @param iconcolor
     */
    public void setIconcolor(String iconcolor) {
        this.iconcolor = iconcolor == null ? null : iconcolor.trim();
    }
}