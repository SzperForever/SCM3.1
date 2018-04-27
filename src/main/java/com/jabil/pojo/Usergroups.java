package com.jabil.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "UserGroups")
public class Usergroups {
    @Id
    @Column(name = "Group_id")
    private Integer groupId;

    private Integer id;

    @Column(name = "Group_Name")
    private String groupName;

    @Column(name = "Details")
    private String details;

    @Column(name = "LockSetting")
    private Boolean locksetting;

    @Column(name = "Report_to_id")
    private Integer reportToId;

    @Column(name = "Addtime")
    private Date addtime;

    /**
     * @return Group_id
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * @param groupId
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
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
     * @return Group_Name
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * @param groupName
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * @return Details
     */
    public String getDetails() {
        return details;
    }

    /**
     * @param details
     */
    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }

    /**
     * @return LockSetting
     */
    public Boolean getLocksetting() {
        return locksetting;
    }

    /**
     * @param locksetting
     */
    public void setLocksetting(Boolean locksetting) {
        this.locksetting = locksetting;
    }

    /**
     * @return Report_to_id
     */
    public Integer getReportToId() {
        return reportToId;
    }

    /**
     * @param reportToId
     */
    public void setReportToId(Integer reportToId) {
        this.reportToId = reportToId;
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
}