package com.lambdaschool.zoos.models;


import javax.persistence.*;

@Entity
@Table(name = "zooanimals")
public class ZooAnimals {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long zooid;
    private long animalid;
    private String incomingzoo;

    public ZooAnimals(long animalid, String incomingzoo) {
        this.animalid = animalid;
        this.incomingzoo = incomingzoo;
    }

    public ZooAnimals() {
    }

    public long getZooid() {
        return zooid;
    }

    public long getAnimalid() {
        return animalid;
    }

    public void setAnimalid(long animalid) {
        this.animalid = animalid;
    }

    public String getIncomingzoo() {
        return incomingzoo;
    }

    public void setIncomingzoo(String incomingzoo) {
        this.incomingzoo = incomingzoo;
    }
}
