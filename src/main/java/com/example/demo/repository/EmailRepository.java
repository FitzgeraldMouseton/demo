package com.example.demo.repository;

import com.example.demo.entity.Account;
import com.example.demo.entity.Email;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

public interface EmailRepository extends CrudRepository<Email, Long> {

    List<Email> findAllByUserIdIn(Collection<Long> usersId);

    List<Email> findAllByIdIn(Collection<Long> accountsId);
}
