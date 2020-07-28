package com.travellodge.hotelchainservice.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {
    @Id
    private String id;

    @Getter
    @Setter
    private String fname;


    @Getter
    @Setter
    private String lname;

    @Getter
    @Setter
    private String phoneNo;

    @Getter
    @Setter
    private String email;

    public User() {
    }

    public User(String fname, String lname, String phoneNo, String email) {
        this.fname = fname;
        this.lname = lname;
        this.phoneNo = phoneNo;
        this.email = email;
    }
}
