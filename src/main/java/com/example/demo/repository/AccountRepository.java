package com.example.demo.repository;

import com.example.demo.entity.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

public interface AccountRepository extends CrudRepository<Account, Long> {

    List<Account> findAllByUserIdIn(Collection<Long> usersId);

    List<Account> findAllByIdIn(Collection<Long> accountsId);

}
