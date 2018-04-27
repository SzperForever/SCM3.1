package com.jabil.pojo;

import java.util.Date;
import javax.persistence.*;

public class Catalogs {
    @Id
    @Column(name = "Catalog_id")
    private Integer catalogId;

    private Integer id;

    @Column(name = "Catalog_name")
    private String catalogName;

    @Column(name = "Addtime")
    private Date addtime;

    private String icon;

    @Column(name = "iconColor")
    private String iconcolor;

    /**
     * @return Catalog_id
     */
    public Integer getCatalogId() {
        return catalogId;
    }

    /**
     * @param catalogId
     */
    public void setCatalogId(Integer catalogId) {
        this.catalogId = catalogId;
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
     * @return Catalog_name
     */
    public String getCatalogName() {
        return catalogName;
    }

    /**
     * @param catalogName
     */
    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName == null ? null : catalogName.trim();
    }

    /**
     * @return Addtime
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * @param addtime
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
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