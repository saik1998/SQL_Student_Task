package com.firstapp.student_teacher_details;

public class ModelClass {


    String name,mail;

    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ModelClass(int id) {
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

    public ModelClass(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }
}
