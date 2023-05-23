package com.example.optimizer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MainStat {

    @Id
    @GeneratedValue
    private String id;
    private String stat;
    private long value;

    public MainStat() {
    }

    public MainStat(String id, String stat, long value) {
        this.id = id;
        this.stat = stat;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        return "MainStat{" +
                "id='" + id + '\'' +
                ", stat='" + stat + '\'' +
                ", value=" + value +
                '}';
    }
}
