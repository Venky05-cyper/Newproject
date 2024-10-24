package com.example.NewProject.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.NewProject.Bean.newBean;
import com.example.NewProject.Entity.newEntity;
import com.example.NewProject.Repository.newRepo;

@Service
public class ImpService implements service{

	@Autowired
	newRepo repo;

	@Override
	public String postData(newBean request) {
		newEntity n = new newEntity();
//		n.setNewid(request.getId());
		n.setName(request.getName());
		n.setEmail(request.getEmail());
		n.setPassword(request.getPassword());
		repo.save(n);
		return "data saved";
	}

	public List<newEntity> getData() {
		return repo.findAll();
	}

	public Optional<newEntity> getById(int id) {
		return repo.findById(id);
	}

	@Override
	public String updateData(newBean request,int id) {
		Optional<newEntity> obj = repo.findById(id);
		
		if(obj.isPresent()) {
			newEntity ent = new newEntity();
//			ent.setNewid(request.getId());
			ent.setName(request.getName());
			ent.setEmail(request.getEmail());
			ent.setPassword(request.getPassword());
			repo.save(ent);
			return "data Updated";
		}else {
			return "data not updated";
		}
		
	}

	@Override
	public String deleteData(int id) {
		Optional<newEntity> obj = repo.findById(id);
		
		if(obj.isPresent()) {
			
			repo.delete(obj.get());
			return "data Deleted";
		}else {
			return "User not found with ID: " + id;
		}
		
	}

	
}
