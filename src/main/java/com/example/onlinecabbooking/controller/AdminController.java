package com.example.onlinecabbooking.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onlinecabbooking.entities.AbstractUser;
import com.example.onlinecabbooking.entities.Admin;
import com.example.onlinecabbooking.entities.TripBooking;
import com.example.onlinecabbooking.service.AdminService;



@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/insertadmin")
    public Admin insertAdmin(@RequestBody Admin admin) {
        // TODO Auto-generated method stub
        return this.adminService.insertAdmin(admin);
    }

    @PutMapping("/updateadmin/{id}")
    public Admin updateAdmin(@RequestBody Admin admin,@PathVariable("id") long id) {
        return adminService.updateAdmin(admin,id);
    }

    @DeleteMapping("/deleteadmin/{id}")
    public ResponseEntity<Admin> deleteAdmin(@PathVariable("id") long id) {
        return adminService.deleteAdmin(id);
    }
}
