package com.example.optimizer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Rune {

    @Id
    @GeneratedValue
    private Long id;
    private String unitId;
    private String slot;
    private String maintStatId;
    private String setId;
    private String subStat;
    private String prefix;

    public Rune() {
    }

    public Rune(Long id, String unitId, String slot, String maintStatId, String setId, String subStat, String prefix) {
        this.id = id;
        this.unitId = unitId;
        this.slot = slot;
        this.maintStatId = maintStatId;
        this.setId = setId;
        this.subStat = subStat;
        this.prefix = prefix;
    }

    @Override
    public String toString() {
        return "Rune{" +
                "id=" + id +
                ", unitId='" + unitId + '\'' +
                ", slot='" + slot + '\'' +
                ", maintStatId='" + maintStatId + '\'' +
                ", setId='" + setId + '\'' +
                '}';
    }

    public String getSubStat() {
        return subStat;
    }

    public void setSubStat(String subStat) {
        this.subStat = subStat;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public String getMaintStatId() {
        return maintStatId;
    }

    public void setMaintStatId(String maintStatId) {
        this.maintStatId = maintStatId;
    }

    public String getSetId() {
        return setId;
    }

    public void setSetId(String setId) {
        this.setId = setId;
    }
}
