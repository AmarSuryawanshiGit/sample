package com.Saloon.controller;

import com.Saloon.model.Customers;
import com.Saloon.repo.CustomerRepo;
import com.Saloon.service.CustomerServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/v1/")
public class CustomerController {

    private CustomerServiceI customerServiceI;
    @Autowired
    public CustomerController(CustomerServiceI customerServiceI) {
        this.customerServiceI = customerServiceI;
    }

    @GetMapping("/customers")
    public List<Customers> getAllCustomers(){
        List<Customers> allCustomers = customerServiceI.getAllCustomers();
        return allCustomers;
    }
}
