package com.example.demo.models.entity;


import com.example.demo.models.enums.Emotion;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "likes")
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private User user;
    @Enumerated(EnumType.STRING)
    private Emotion emotion;

    public Like() {
    }
}
