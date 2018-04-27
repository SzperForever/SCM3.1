package com.jabil.pojo;

import javax.persistence.*;

@Table(name = "URL")
public class Url {
    @Id
    @Column(name = "URL_id")
    private Integer urlId;

    private Integer id;

    @Column(name = "URL_title")
    private String urlTitle;

    @Column(name = "URL_address")
    private String urlAddress;

    @Column(name = "URL_desc")
    private String urlDesc;

    @Column(name = "picPath")
    private String picpath;

    @Column(name = "Catalog_id")
    private Integer catalogId;

    @Column(name = "Department_id")
    private Integer departmentId;

    @Column(name = "Tag_id")
    private String tagId;

    @Column(name = "IsExtemal")
    private Boolean isextemal;

    /**
     * @return URL_id
     */
    public Integer getUrlId() {
        return urlId;
    }

    /**
     * @param urlId
     */
    public void setUrlId(Integer urlId) {
        this.urlId = urlId;
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
     * @return URL_title
     */
    public String getUrlTitle() {
        return urlTitle;
    }

    /**
     * @param urlTitle
     */
    public void setUrlTitle(String urlTitle) {
        this.urlTitle = urlTitle == null ? null : urlTitle.trim();
    }

    /**
     * @return URL_address
     */
    public String getUrlAddress() {
        return urlAddress;
    }

    /**
     * @param urlAddress
     */
    public void setUrlAddress(String urlAddress) {
        this.urlAddress = urlAddress == null ? null : urlAddress.trim();
    }

    /**
     * @return URL_desc
     */
    public String getUrlDesc() {
        return urlDesc;
    }

    /**
     * @param urlDesc
     */
    public void setUrlDesc(String urlDesc) {
        this.urlDesc = urlDesc == null ? null : urlDesc.trim();
    }

    /**
     * @return picPath
     */
    public String getPicpath() {
        return picpath;
    }

    /**
     * @param picpath
     */
    public void setPicpath(String picpath) {
        this.picpath = picpath == null ? null : picpath.trim();
    }

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
     * @return Department_id
     */
    public Integer getDepartmentId() {
        return departmentId;
    }

    /**
     * @param departmentId
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * @return Tag_id
     */
    public String getTagId() {
        return tagId;
    }

    /**
     * @param tagId
     */
    public void setTagId(String tagId) {
        this.tagId = tagId == null ? null : tagId.trim();
    }

    /**
     * @return IsExtemal
     */
    public Boolean getIsextemal() {
        return isextemal;
    }

    /**
     * @param isextemal
     */
    public void setIsextemal(Boolean isextemal) {
        this.isextemal = isextemal;
    }
}