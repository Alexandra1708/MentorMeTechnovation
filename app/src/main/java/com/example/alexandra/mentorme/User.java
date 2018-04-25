package com.example.alexandra.mentorme;

/**
 * Created by Alexandra on 4/25/2018.
 */

public class User {
    int id;
    String email, uname, pass, cpass, subject, name;

    public void setId(int id) {
        this.id = id;

    }

    public int getId() {
        return this.id;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass() {
        return this.pass;
    }

    public void setCpass(String cpass) {
        this.cpass = cpass;
    }

    public String getCpass() {
        return this.cpass;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUname() {
        return this.uname;
    }


}