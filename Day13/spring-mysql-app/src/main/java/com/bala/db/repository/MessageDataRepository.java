package com.bala.db.repository;

import com.bala.db.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageDataRepository extends CrudRepository<Message, Integer> {
}

