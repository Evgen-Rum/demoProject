package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class City {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;

    @Column
    private int isCapital;

    @ManyToOne
    private Country country;

    public City() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIsCapital() {
        return isCapital;
    }

    public void setIsCapital(int isCapital) {
        this.isCapital = isCapital;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isCapital=" + isCapital +
                '}';
    }
}
