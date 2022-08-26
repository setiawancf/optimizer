package com.example.optimizer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Rune {

    @Id
    @GeneratedValue
    private Long id;

    private String mainStat;
    private String mainStatValue;

    public Rune(String mainStat, String mainStatValue) {
        this.mainStat = mainStat;
        this.mainStatValue = mainStatValue;
    }

    public Rune() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMainStat() {
        return mainStat;
    }

    public void setMainStat(String mainStat) {
        this.mainStat = mainStat;
    }

    public String getMainStatValue() {
        return mainStatValue;
    }

    public void setMainStatValue(String mainStatValue) {
        this.mainStatValue = mainStatValue;
    }

    @Override
    public String toString() {
        return "Rune{" +
                "id=" + id +
                ", mainStat='" + mainStat + '\'' +
                ", mainStatValue='" + mainStatValue + '\'' +
                '}';
    }
}
