package com.lambdaschool.zoos.models;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "telephones")
public class Telephones {
    @Autowired
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long phoneid;
    private String phonetype;
    private String phonenumber;

    public Telephones(String phonetype, String phonenumber) {
        this.phonetype = phonetype;
        this.phonenumber = phonenumber;
    }

    public Telephones() {
    }

    public long getPhoneid() {
        return phoneid;
    }

    public String getPhonetype() {
        return phonetype;
    }

    public void setPhonetype(String phonetype) {
        this.phonetype = phonetype;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
