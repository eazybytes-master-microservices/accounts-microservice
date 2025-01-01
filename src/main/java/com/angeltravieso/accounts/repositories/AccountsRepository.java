package com.angeltravieso.accounts.repositories;

import com.angeltravieso.accounts.entity.Accounts;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {

    Optional<Accounts> findByCustomerId(Long customerId);

    @Transactional // execute in transaction
    @Modifying // tell to spring modify data
    void deleteByCustomerId(Long customerId);

}
