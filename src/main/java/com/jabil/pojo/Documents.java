package com.jabil.pojo;

import java.util.Date;
import javax.persistence.*;

public class Documents {
    @Id
    @Column(name = "Doc_id")
    private Integer docId;

    private Integer id;

    @Column(name = "Doc_name")
    private String docName;

    @Column(name = "Doc_Desc")
    private String docDesc;

    @Column(name = "Doc_Path")
    private String docPath;

    @Column(name = "Doc_Number")
    private String docNumber;

    @Column(name = "Doc_Version")
    private String docVersion;

    @Column(name = "Doc_Source_id")
    private Integer docSourceId;

    @Column(name = "Doc_type_id")
    private Integer docTypeId;

    @Column(name = "Doc_Status")
    private String docStatus;

    @Column(name = "Pic_Path")
    private String picPath;

    @Column(name = "Department_id")
    private Integer departmentId;

    @Column(name = "Tag_id")
    private Integer tagId;

    @Column(name = "Action_By_Userid")
    private Integer actionByUserid;

    @Column(name = "Action_time")
    private Date actionTime;

    @Column(name = "LstUpdateBy")
    private Integer lstupdateby;

    @Column(name = "LstUpdateTime")
    private Date lstupdatetime;

    /**
     * @return Doc_id
     */
    public Integer getDocId() {
        return docId;
    }

    /**
     * @param docId
     */
    public void setDocId(Integer docId) {
        this.docId = docId;
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
     * @return Doc_name
     */
    public String getDocName() {
        return docName;
    }

    /**
     * @param docName
     */
    public void setDocName(String docName) {
        this.docName = docName == null ? null : docName.trim();
    }

    /**
     * @return Doc_Desc
     */
    public String getDocDesc() {
        return docDesc;
    }

    /**
     * @param docDesc
     */
    public void setDocDesc(String docDesc) {
        this.docDesc = docDesc == null ? null : docDesc.trim();
    }

    /**
     * @return Doc_Path
     */
    public String getDocPath() {
        return docPath;
    }

    /**
     * @param docPath
     */
    public void setDocPath(String docPath) {
        this.docPath = docPath == null ? null : docPath.trim();
    }

    /**
     * @return Doc_Number
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * @param docNumber
     */
    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber == null ? null : docNumber.trim();
    }

    /**
     * @return Doc_Version
     */
    public String getDocVersion() {
        return docVersion;
    }

    /**
     * @param docVersion
     */
    public void setDocVersion(String docVersion) {
        this.docVersion = docVersion == null ? null : docVersion.trim();
    }

    /**
     * @return Doc_Source_id
     */
    public Integer getDocSourceId() {
        return docSourceId;
    }

    /**
     * @param docSourceId
     */
    public void setDocSourceId(Integer docSourceId) {
        this.docSourceId = docSourceId;
    }

    /**
     * @return Doc_type_id
     */
    public Integer getDocTypeId() {
        return docTypeId;
    }

    /**
     * @param docTypeId
     */
    public void setDocTypeId(Integer docTypeId) {
        this.docTypeId = docTypeId;
    }

    /**
     * @return Doc_Status
     */
    public String getDocStatus() {
        return docStatus;
    }

    /**
     * @param docStatus
     */
    public void setDocStatus(String docStatus) {
        this.docStatus = docStatus == null ? null : docStatus.trim();
    }

    /**
     * @return Pic_Path
     */
    public String getPicPath() {
        return picPath;
    }

    /**
     * @param picPath
     */
    public void setPicPath(String picPath) {
        this.picPath = picPath == null ? null : picPath.trim();
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
    public Integer getTagId() {
        return tagId;
    }

    /**
     * @param tagId
     */
    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    /**
     * @return Action_By_Userid
     */
    public Integer getActionByUserid() {
        return actionByUserid;
    }

    /**
     * @param actionByUserid
     */
    public void setActionByUserid(Integer actionByUserid) {
        this.actionByUserid = actionByUserid;
    }

    /**
     * @return Action_time
     */
    public Date getActionTime() {
        return actionTime;
    }

    /**
     * @param actionTime
     */
    public void setActionTime(Date actionTime) {
        this.actionTime = actionTime;
    }

    /**
     * @return LstUpdateBy
     */
    public Integer getLstupdateby() {
        return lstupdateby;
    }

    /**
     * @param lstupdateby
     */
    public void setLstupdateby(Integer lstupdateby) {
        this.lstupdateby = lstupdateby;
    }

    /**
     * @return LstUpdateTime
     */
    public Date getLstupdatetime() {
        return lstupdatetime;
    }

    /**
     * @param lstupdatetime
     */
    public void setLstupdatetime(Date lstupdatetime) {
        this.lstupdatetime = lstupdatetime;
    }
}