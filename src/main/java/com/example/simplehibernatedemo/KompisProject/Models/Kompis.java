package com.example.simplehibernatedemo.KompisProject.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
public class Kompis {

    @Id
    protected Long id;

    protected String name;
    protected String mail;
    protected String mobile;

    public Kompis(Long id, String name, String mail, String mobile) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.mobile = mobile;
    }

    public Kompis(String name, String mail, String mobile) {
        this.name = name;
        this.mail = mail;
        this.mobile = mobile;
    }

    public Kompis() {}

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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
