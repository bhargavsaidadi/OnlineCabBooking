package com.example.onlinecabbooking.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.onlinecabbooking.entities.Admin;
import com.example.onlinecabbooking.entities.TripBooking;

@Service
public interface IAdminService {
    public Admin insertAdmin(Admin admin);
    public Admin updateAdmin(Admin admin, long id);
    public ResponseEntity<Admin> deleteAdmin(long adminId);
    public List<TripBooking>getAllTrips(int customerId);
    public List<TripBooking>getTripsCabwise();
    public List<TripBooking>getTripsCustomerwise();
    public List<TripBooking>getTripsDatewise();
    public List<TripBooking>getAllTripsForDays(int customerId, LocalDateTime fromDate, LocalDateTime toDate);
}
