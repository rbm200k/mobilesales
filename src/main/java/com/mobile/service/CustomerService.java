package com.mobile.service;

import com.mobile.models.Customer;
import com.mobile.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    public Customer saveCustomer(Customer customer) {
        return  customerRepo.save(customer);
    }
}
