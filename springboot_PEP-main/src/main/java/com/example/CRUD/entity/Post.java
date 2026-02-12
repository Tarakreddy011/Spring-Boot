package com.example.CRUD.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;


    private String content;
    private String mediaUrl ;
    private LocalDateTime createdAt ;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user ;


    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDateTime.now();
    }


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
