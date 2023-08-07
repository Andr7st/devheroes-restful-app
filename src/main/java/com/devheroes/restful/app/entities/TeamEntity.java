package com.devheroes.restful.app.entities;

import jakarta.persistence.*;

@Entity(name = "team")
@Table(name = "teams")
@SuppressWarnings("unused")
public class TeamEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 24, nullable = false)
    private String name;

    @Column(length = 12)
    private String country;

    @Column(length = 24)
    private String colors;

    @Column(columnDefinition = "int default 1")
    private int division;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }
}
