package com.example.onlinecabbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlinecabbooking.entities.Admin;
import com.example.onlinecabbooking.entities.Customer;
import com.example.onlinecabbooking.entities.Driver;
import com.example.onlinecabbooking.repository.IAdminRepository;
import com.example.onlinecabbooking.repository.ICustomerRepository;
import com.example.onlinecabbooking.repository.IDriverRepository;

@Service
public class LoginService {

    @Autowired
    private IAdminRepository iAdminRepository;

    @Autowired
    private ICustomerRepository iCustomerRepository;

    @Autowired
    private IDriverRepository iDriverRepository;

    public String LoginAdmin(Admin admin) {
        List<Admin> ad = iAdminRepository.findAll();
        String result=null;
        for(int i=0; i<ad.size(); i++) {
            if(ad.get(i).getUsername().equals(admin.getUsername()) && ad.get(i).getPassword().equals(admin.getPassword())) {

                result = admin.getUsername()+" is logged in";
            }else {
                result = "Username or Password is wrong.";
            }

        }
        return result;
    }

    public String LoginUser(Customer customer) {
        List<Customer> ad = iCustomerRepository.findAll();
        String result=null;
        for(int i=0; i<ad.size(); i++) {
            if(ad.get(i).getUsername().equals(customer.getUsername()) && ad.get(i).getPassword().equals(customer.getPassword())) {

                result = customer.getUsername()+" is logged in";
            }else {
                result = "Username or Password is wrong.";
            }

        }
        return result;
    }

    public String LoginDriver(Driver driver) {
        List<Driver> ad = iDriverRepository.findAll();
        String result=null;
        for(int i=0; i<ad.size(); i++) {
            if(ad.get(i).getUsername().equals(driver.getUsername()) && ad.get(i).getPassword().equals(driver.getPassword())) {

                result = driver.getUsername()+" is logged in";
            }else {
                result = "Username or Password is wrong.";
            }

        }
        return result;
    }

}
