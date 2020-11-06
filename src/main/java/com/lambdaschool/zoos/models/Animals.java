package com.lambdaschool.zoos.models;

import javax.persistence.*;

@Entity
@Table(name = "animals")
public class Animals {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long animalid;
    private String animaltype;


    public Animals(long animalid, String animaltype) {
        this.animalid = animalid;
        this.animaltype = animaltype;
    }

    public Animals() {
    }

    public String getAnimaltype() {
        return animaltype;
    }

    public void setAnimaltype(String animaltype) {
        this.animaltype = animaltype;
    }
}
