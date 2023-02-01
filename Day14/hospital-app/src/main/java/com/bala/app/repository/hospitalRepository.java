package com.bala.app.repository;

import com.bala.app.model.Hospital;
import org.springframework.data.repository.CrudRepository;

public interface hospitalRepository extends CrudRepository<Hospital,Integer> {

}
