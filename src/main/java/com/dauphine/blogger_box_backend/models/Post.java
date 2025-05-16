package com.dauphine.blogger_box_backend.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "post")
public class Post {

    @Id
    @Column(name="id")
    private UUID id;

    @Column(name="title")
    private String title;

    @Column(name="content")
    private String content;

    @Column(name="created_date")
    private LocalDateTime createdDate;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    public Post() {
    }

    public Post(String title, String content, Category category) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.content = content;
        this.createdDate = LocalDateTime.now();
        this.category = category;
    }
}
