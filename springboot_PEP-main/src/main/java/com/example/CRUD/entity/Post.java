package com.example.CRUD.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String content;
    private String media;

    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}

/*

@entity
@data
@allargscon
@nlargcon


calss {

id autogen

long id:
Private String Content:
Private String Media:
Private DateTime:

------------------------------------
@many to one
@joinColumn (name= "User ID")
private user user:

}


 */
