package com.example.myProject.model;

import javax.persistence.*;

@Entity
public class Generic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    int pillsQuantity;
    String manufacturer;
    @ManyToOne
    Drug drug;

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

    public int getPillsQuantity() {
        return pillsQuantity;
    }

    public void setPillsQuantity(int pillsQuantity) {
        this.pillsQuantity = pillsQuantity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public Generic() {
    }

    public Generic( String name, int pillsQuantity, String manufacturer, Drug drug) {
        this.name = name;
        this.pillsQuantity = pillsQuantity;
        this.manufacturer = manufacturer;
        this.drug = drug;
    }

    @Override
    public String toString() {
        return "Generics{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pillsQuantity=" + pillsQuantity +
                ", manufacturer='" + manufacturer + '\'' +
                ", drug=" + drug +
                '}';
    }
}

