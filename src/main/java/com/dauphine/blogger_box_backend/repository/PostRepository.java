package com.dauphine.blogger_box_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dauphine.blogger_box_backend.models.Category;
import java.util.UUID;

public class PostRepository implements JpaRepository<Category, UUID> {
}
