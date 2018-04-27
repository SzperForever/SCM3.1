package com.jabil.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "DocumentSource")
public class Documentsource {
    @Id
    @Column(name = "Source_id")
    private Integer sourceId;

    private Integer id;

    @Column(name = "Source_name")
    private String sourceName;

    @Column(name = "Add_time")
    private Date addTime;

    /**
     * @return Source_id
     */
    public Integer getSourceId() {
        return sourceId;
    }

    /**
     * @param sourceId
     */
    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
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
     * @return Source_name
     */
    public String getSourceName() {
        return sourceName;
    }

    /**
     * @param sourceName
     */
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName == null ? null : sourceName.trim();
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