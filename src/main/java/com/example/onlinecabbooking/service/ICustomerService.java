package com.example.onlinecabbooking.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.onlinecabbooking.entities.Customer;

public interface ICustomerService {
    public Customer insertCustomer(Customer customer);
    public Customer updateCustomer(Customer customer, long id);
    public ResponseEntity<Customer> deleteCustomer(long id);
    public List<Customer>viewCustomers();
    public Customer viewCustomer(int customerId);
    public Customer validateCustomer(String username, String password);
}
