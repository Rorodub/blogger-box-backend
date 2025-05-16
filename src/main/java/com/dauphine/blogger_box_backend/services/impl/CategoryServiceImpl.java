package com.dauphine.blogger_box_backend.services.impl;

import com.dauphine.blogger_box_backend.models.Category;
import com.dauphine.blogger_box_backend.services.CategoryService;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;
public class CategoryServiceImpl implements CategoryService {

    @Override
    public List<Category> getAll(){
        return repository.findAll();
    }

    @Override
    public Category getById(UUID id){
        return repository.findById(id)
                .orElse(null);
    }

    @Override
    public Category create(String name){
        Category category = new Category(name);
        return repository.save(category);
    }

    @Override
    public Category updateName(UUID id, String name){
        Category category = getById(id);
        if (category != null) {
            return null;
        }
        category.setName(name);
        return repository.save(category);
    }

    @Override
    public boolean deleteByID(UUID id){
        repository.deleteByID(id);
        return true;
    }
}
