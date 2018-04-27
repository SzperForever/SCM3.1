package com.jabil.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ReferenceLinks")
public class Referencelinks {
    @Id
    @Column(name = "Refer_id")
    private Integer referId;

    private Integer id;

    @Column(name = "Refer_name")
    private String referName;

    @Column(name = "Refer_URL")
    private String referUrl;

    @Column(name = "Add_time")
    private Date addTime;

    /**
     * @return Refer_id
     */
    public Integer getReferId() {
        return referId;
    }

    /**
     * @param referId
     */
    public void setReferId(Integer referId) {
        this.referId = referId;
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
     * @return Refer_name
     */
    public String getReferName() {
        return referName;
    }

    /**
     * @param referName
     */
    public void setReferName(String referName) {
        this.referName = referName == null ? null : referName.trim();
    }

    /**
     * @return Refer_URL
     */
    public String getReferUrl() {
        return referUrl;
    }

    /**
     * @param referUrl
     */
    public void setReferUrl(String referUrl) {
        this.referUrl = referUrl == null ? null : referUrl.trim();
    }

    /**
     * @return Add_time
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * @param addTime
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}