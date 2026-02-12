package com.example.CRUD.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "user_info")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String phone;
    private String profilePic;
    private String location;
    private Boolean verificationStatus;


    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
