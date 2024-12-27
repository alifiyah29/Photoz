package com.learn.springboot.photoz.clone.repository;

import org.springframework.data.repository.CrudRepository;

import com.learn.springboot.photoz.clone.model.Photo;

public interface PhotozRepository extends CrudRepository<Photo, Integer>{

}
