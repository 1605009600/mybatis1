package com.example.demo.entity;

import java.time.LocalDateTime;

public class User {
    private int Id;
    private String LoginName;
    private  String Password;
    private String Phone;
    private String Email;
    private   String Valid;
    private LocalDateTime Create_Time;
    private  LocalDateTime Modifu_Time;
    private String Name;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getLoginName() {
        return LoginName;
    }

    public void setLoginName(String loginName) {
        LoginName = loginName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getValid() {
        return Valid;
    }

    public void setValid(String valid) {
        Valid = valid;
    }

    public LocalDateTime getCreate_Time() {
        return Create_Time;
    }

    public void setCreate_Time(LocalDateTime create_Time) {
        Create_Time = create_Time;
    }

    public LocalDateTime getModify_Time() {
        return Modifu_Time;
    }

    public void setModify_Time(LocalDateTime modifu_Time) {
        Modifu_Time = modifu_Time;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", LoginName='" + LoginName + '\'' +
                ", Password='" + Password + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Email='" + Email + '\'' +
                ", Valid='" + Valid + '\'' +
                ", Create_Time=" + Create_Time +
                ", Modifu_Time=" + Modifu_Time +
                ", Name='" + Name + '\'' +"\n"+
                '}';
    }
}

