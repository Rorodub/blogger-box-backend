package com.dauphine.blogger_box_backend.models;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name= "category")
public class Category {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name= "name")
    private String name;

    public Category(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public Category() {
    }

    public UUID getId() { return id;}

    public void setId(UUID id) { this.id = id;}

    public String getName() { return name;}

    public void setName(String name) { this.name = name;}
}
