package com.example.myProject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Drug {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private boolean prescription;
    private String drugForm;

    public Drug() {
    }

    public Drug(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Drug(String name) {
        this.name = name;
    }


    public boolean isPrescription() {

        return prescription;
    }

    public void setPrescription(boolean prescription) {

        this.prescription = prescription;
    }

    public String getDrugForm() {
        return drugForm;
    }

    public void setDrugForm(String drugForm) {

        this.drugForm = drugForm;
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

    @Override
    public String toString() {
        return "Drugs{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
