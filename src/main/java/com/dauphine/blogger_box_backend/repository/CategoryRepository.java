package com.dauphine.blogger_box_backend.repository;

import com.dauphine.blogger_box_backend.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, UUID> {
}