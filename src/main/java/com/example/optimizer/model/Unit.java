package com.example.optimizer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Unit {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String baseStat;
    private String runeStat;

    public Unit(int id, String name, String baseStat, String runeStat) {
        this.id = id;
        this.name = name;
        this.baseStat = baseStat;
        this.runeStat = runeStat;
    }

    public Unit() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBaseStat() {
        return baseStat;
    }

    public void setBaseStat(String baseStat) {
        this.baseStat = baseStat;
    }

    public String getRuneStat() {
        return runeStat;
    }

    public void setRuneStat(String runeStat) {
        this.runeStat = runeStat;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", baseStat='" + baseStat + '\'' +
                ", runeStat='" + runeStat + '\'' +
                '}';
    }
}
