package com.studentapi.studentapi.repository;


import org.springframework.data.repository.CrudRepository;

import com.studentapi.studentapi.entity.Students;

public interface UserRepository extends CrudRepository<Students, Long>{

	

}
