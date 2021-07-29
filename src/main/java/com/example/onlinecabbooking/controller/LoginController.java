package com.example.onlinecabbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onlinecabbooking.entities.Admin;
import com.example.onlinecabbooking.entities.Customer;
import com.example.onlinecabbooking.entities.Driver;
import com.example.onlinecabbooking.service.LoginService;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/admin")
    public String adminLogin(@RequestBody Admin admin) {

        return loginService.LoginAdmin(admin);
    }

    @PostMapping("/user")
    public String userLogin(@RequestBody Customer customer) {

        return loginService.LoginUser(customer);
    }

    @PostMapping("/driver")
    public String driverLogin(@RequestBody Driver driver) {

        return loginService.LoginDriver(driver);
    }
}
}
