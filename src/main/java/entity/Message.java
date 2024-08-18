

package com.example.chatappfinal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String sender;
    private String receiver;
    private String content;
    private LocalDateTime timestamp;

    // Getters and Setters
}
