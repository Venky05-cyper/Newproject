package com.example.NewProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.NewProject.Entity.newEntity;

public interface newRepo extends JpaRepository<newEntity, Integer>{

}
