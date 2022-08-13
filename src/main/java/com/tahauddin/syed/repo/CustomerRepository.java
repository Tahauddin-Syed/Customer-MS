package com.tahauddin.syed.repo;

import com.tahauddin.syed.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
