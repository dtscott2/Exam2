package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "VirusData")

public class Data {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    public int id;
    @Column(name = "Name")
    public String name;
    @Column(name = "Description")
    public String description;
    @Column(name = "Symptoms")
    public String symptoms;
    @Column(name = "Duration")
    public String duration;
    @Column(name = "Mortality Rate")
    public String mortalityRate;

//    **fix image column**
//    @Column(name = "Image")
//    public String image;


    public Data() {

    }

    public Data(int id, String name, String description,String symptoms, String duration, String mortalityRate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.symptoms = symptoms;
        this.duration = duration;
        this.mortalityRate = mortalityRate;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getMortalityRate() {
        return mortalityRate;
    }

    public void setMortalityRate(String mortalityRate) {
        this.mortalityRate = mortalityRate;
    }




}
