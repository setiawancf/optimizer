package com.example.optimizer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SetStat {

    @Id
    @GeneratedValue
    private String id;
    private String runeType;
    private String qtyActive;
    private String stat;
    private long value;

    public SetStat() {
    }

    public SetStat(String id, String runeType, String qtyActive, String stat, long value) {
        this.id = id;
        this.runeType = runeType;
        this.qtyActive = qtyActive;
        this.stat = stat;
        this.value = value;
    }

    public String getQtyActive() {
        return qtyActive;
    }

    public void setQtyActive(String qtyActive) {
        this.qtyActive = qtyActive;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRuneType() {
        return runeType;
    }

    public void setRuneType(String runeType) {
        this.runeType = runeType;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SetStat{" +
                "id='" + id + '\'' +
                ", runeType='" + runeType + '\'' +
                ", stat='" + stat + '\'' +
                ", value=" + value +
                '}';
    }
}
