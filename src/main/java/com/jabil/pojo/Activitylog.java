package com.jabil.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ActivityLog")
public class Activitylog {
    @Id
    @Column(name = "Log_id")
    private Long logId;

    private Long id;

    @Column(name = "Log_Name")
    private String logName;

    @Column(name = "Log_Userid")
    private Integer logUserid;

    @Column(name = "Log_time")
    private Date logTime;

    /**
     * @return Log_id
     */
    public Long getLogId() {
        return logId;
    }

    /**
     * @param logId
     */
    public void setLogId(Long logId) {
        this.logId = logId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return Log_Name
     */
    public String getLogName() {
        return logName;
    }

    /**
     * @param logName
     */
    public void setLogName(String logName) {
        this.logName = logName == null ? null : logName.trim();
    }

    /**
     * @return Log_Userid
     */
    public Integer getLogUserid() {
        return logUserid;
    }

    /**
     * @param logUserid
     */
    public void setLogUserid(Integer logUserid) {
        this.logUserid = logUserid;
    }

    /**
     * @return Log_time
     */
    public Date getLogTime() {
        return logTime;
    }

    /**
     * @param logTime
     */
    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }
}