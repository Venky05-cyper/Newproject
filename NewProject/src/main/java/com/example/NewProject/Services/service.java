package com.example.NewProject.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;

import com.example.NewProject.Bean.newBean;
import com.example.NewProject.Entity.newEntity;

public interface service{

	String postData(newBean request);
	List<newEntity> getData();
	Optional<newEntity> getById(int id);
	String updateData(newBean request,int id);
	String deleteData(@PathVariable int id);
}
