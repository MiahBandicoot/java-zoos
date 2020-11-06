package com.lambdaschool.zoos.models;


import javax.persistence.*;

@Entity
@Table(name = "zoos")
public class Zoos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long zooid;
    private String zooname;

    public Zoos(String zooname) {
        this.zooname = zooname;
    }

    public Zoos() {
    }

    public long getZooid() {
        return zooid;
    }

    public String getZooname() {
        return zooname;
    }

    public void setZooname(String zooname) {
        this.zooname = zooname;
    }
}
