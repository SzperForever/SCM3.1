package com.jabil.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.sql.Date;

public class Users {
    @Id
    @Column(name = "User_id")
    private Integer userId;

    private Integer id;

    @Column(name = "Group_id")
    private Integer groupId;

    @Column(name = "Role_id")
    private Integer roleId;

    @Column(name = "Depart_id")
    private Integer departId;

    @Column(name = "NTid")
    private String ntid;

    @Column(name = "Display")
    private String display;

    @Column(name = "Alias")
    private String alias;

    @Column(name = "MailAddress")
    private String mailaddress;

    @Column(name = "Active")
    private Boolean active;

    @Column(name = "Add_time")
    private Date addTime;

    /**
     * @return User_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
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
     * @return Role_id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * @return Depart_id
     */
    public Integer getDepartId() {
        return departId;
    }

    /**
     * @param departId
     */
    public void setDepartId(Integer departId) {
        this.departId = departId;
    }

    /**
     * @return NTid
     */
    public String getNtid() {
        return ntid;
    }

    /**
     * @param ntid
     */
    public void setNtid(String ntid) {
        this.ntid = ntid == null ? null : ntid.trim();
    }

    /**
     * @return Display
     */
    public String getDisplay() {
        return display;
    }

    /**
     * @param display
     */
    public void setDisplay(String display) {
        this.display = display == null ? null : display.trim();
    }

    /**
     * @return Alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * @param alias
     */
    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    /**
     * @return MailAddress
     */
    public String getMailaddress() {
        return mailaddress;
    }

    /**
     * @param mailaddress
     */
    public void setMailaddress(String mailaddress) {
        this.mailaddress = mailaddress == null ? null : mailaddress.trim();
    }

    /**
     * @return Active
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * @param active
     */
    public void setActive(Boolean active) {
        this.active = active;
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