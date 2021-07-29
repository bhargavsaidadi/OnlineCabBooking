package com.example.onlinecabbooking.repository;

import java.util.List;

import com.example.onlinecabbooking.entities.TripBooking;

public interface ITripBookingRepository {
    public TripBooking insertTripBooking(TripBooking tripBooking);
    public TripBooking updateTripBooking(TripBooking tripBooking);
    public TripBooking deleteTripBooking(TripBooking tripBooking);
    public List<TripBooking> viewAllTripsCustomer(int customerId);
    public TripBooking calculateBill(int customerId);
}
