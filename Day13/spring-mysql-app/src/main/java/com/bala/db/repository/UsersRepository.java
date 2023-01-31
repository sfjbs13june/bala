package com.bala.db.repository;

import com.bala.db.model.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Users, Integer> {
}

