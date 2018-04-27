package com.jabil.pojo;

import java.util.Date;
import javax.persistence.*;

public class Roles {
    @Id
    @Column(name = "Role_id")
    private Integer roleId;

    private Integer id;

    @Column(name = "Role_Name")
    private String roleName;

    @Column(name = "IsExtemal")
    private Boolean isextemal;

    @Column(name = "Auth_id")
    private Integer authId;

    @Column(name = "Add_time")
    private Date addTime;

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
     * @return Role_Name
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
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

    /**
     * @return Auth_id
     */
    public Integer getAuthId() {
        return authId;
    }

    /**
     * @param authId
     */
    public void setAuthId(Integer authId) {
        this.authId = authId;
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