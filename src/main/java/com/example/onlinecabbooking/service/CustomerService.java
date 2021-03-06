package com.example.onlinecabbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.onlinecabbooking.entities.Customer;
import com.example.onlinecabbooking.exception.CustomerNotFoundException;
import com.example.onlinecabbooking.repository.ICustomerRepository;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public Customer insertCustomer(Customer customer) {
        return (Customer) this.customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer, long id) {
        Customer cust = (Customer) customerRepository.findById(id).orElseThrow(()-> new CustomerNotFoundException("Customer not found"));
        cust.setUsername(customer.getUsername());
        cust.setEmail(customer.getEmail());
        cust.setPassword(customer.getPassword());
        cust.setMobileNumber(customer.getMobileNumber());
        return (Customer) this.customerRepository.save(cust);
    }

    @Override
    public ResponseEntity<Customer> deleteCustomer(long id) {
        Customer cust = (Customer) customerRepository.findById(id).orElseThrow(()-> new CustomerNotFoundException("Customer not found"));
        this.customerRepository.delete(cust);
        return ResponseEntity.ok().build();
    }

    @Override
    public List<Customer> viewCustomers() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Customer viewCustomer(int customerId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Customer validateCustomer(String username, String password) {
        // TODO Auto-generated method stub
        return null;
    }

}
