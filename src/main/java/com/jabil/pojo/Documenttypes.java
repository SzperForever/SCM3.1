package com.jabil.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "DocumentTypes")
public class Documenttypes {
    @Id
    @Column(name = "DocType_id")
    private Integer doctypeId;

    private Integer id;

    @Column(name = "DocType_Name")
    private String doctypeName;

    @Column(name = "Add_time")
    private Date addTime;

    /**
     * @return DocType_id
     */
    public Integer getDoctypeId() {
        return doctypeId;
    }

    /**
     * @param doctypeId
     */
    public void setDoctypeId(Integer doctypeId) {
        this.doctypeId = doctypeId;
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
     * @return DocType_Name
     */
    public String getDoctypeName() {
        return doctypeName;
    }

    /**
     * @param doctypeName
     */
    public void setDoctypeName(String doctypeName) {
        this.doctypeName = doctypeName == null ? null : doctypeName.trim();
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