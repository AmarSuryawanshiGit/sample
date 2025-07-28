package com.Saloon.service;

import com.Saloon.model.Customers;
import com.Saloon.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements CustomerServiceI{

    private CustomerRepo customerRepo;

    @Autowired
    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @Override
    public List<Customers> getAllCustomers() {
        List<Customers> all = customerRepo.findAll();
        return all;
    }
}
