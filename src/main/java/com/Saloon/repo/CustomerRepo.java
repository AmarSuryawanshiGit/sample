package com.Saloon.repo;

import com.Saloon.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customers, Integer> {

}
