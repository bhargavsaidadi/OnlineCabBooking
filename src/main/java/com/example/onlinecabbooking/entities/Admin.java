package com.example.onlinecabbooking.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin extends AbstractUser {


    public Admin() {
        super();
    }




    public Admin(long joinId, String username, String password, String mobileNumber, String email) {
        super(joinId, username, password, mobileNumber, email);
        // TODO Auto-generated constructor stub
    }




}
