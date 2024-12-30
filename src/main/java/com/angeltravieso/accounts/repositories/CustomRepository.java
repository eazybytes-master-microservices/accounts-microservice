package com.angeltravieso.accounts.repositories;

import com.angeltravieso.accounts.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomRepository extends JpaRepository<Customer, Long> {

}
