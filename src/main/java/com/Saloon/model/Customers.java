package com.Saloon.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Saloon_Customers")
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "c_id")
    private int cno;
    @Column(name = "c_name")
    private String cname;
    @Column(name = "c_phone", unique = true)
    private long cphone;
    @Column(name = "c_email", unique = true)
    private String cemail;

    public Customers() {
    }

    public Customers(String cname, int cphone, String cemail) {
        this.cname = cname;
        this.cphone = cphone;
        this.cemail = cemail;
    }

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public long getCphone() {
        return cphone;
    }

    public void setCphone(int cphone) {
        this.cphone = cphone;
    }

    public String getCemail() {
        return cemail;
    }

    public void setCemail(String cemail) {
        this.cemail = cemail;
    }

    @Override
    public String toString() {
        return "Customers{" + "cno=" + cno + ", cname='" + cname + '\'' + ", cphone=" + cphone + ", cemail='" + cemail + '\'' + '}';
    }
}