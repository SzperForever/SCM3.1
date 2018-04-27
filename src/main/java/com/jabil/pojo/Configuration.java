package com.jabil.pojo;

import java.util.Date;
import javax.persistence.*;

public class Configuration {
    @Id
    @Column(name = "Config_id")
    private Integer configId;

    private Integer id;

    @Column(name = "Config_name")
    private String configName;

    @Column(name = "Config_Value")
    private String configValue;

    @Column(name = "Addtime")
    private Date addtime;

    /**
     * @return Config_id
     */
    public Integer getConfigId() {
        return configId;
    }

    /**
     * @param configId
     */
    public void setConfigId(Integer configId) {
        this.configId = configId;
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
     * @return Config_name
     */
    public String getConfigName() {
        return configName;
    }

    /**
     * @param configName
     */
    public void setConfigName(String configName) {
        this.configName = configName == null ? null : configName.trim();
    }

    /**
     * @return Config_Value
     */
    public String getConfigValue() {
        return configValue;
    }

    /**
     * @param configValue
     */
    public void setConfigValue(String configValue) {
        this.configValue = configValue == null ? null : configValue.trim();
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