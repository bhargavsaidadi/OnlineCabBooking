package com.example.onlinecabbooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onlinecabbooking.entities.Driver;
import com.example.onlinecabbooking.exception.DriverNotFoundException;

@Repository
public interface IDriverRepository extends JpaRepository<Driver, Long>{
//	public Driver insertDriver(Driver driver);
//	public Driver updateDriver(Driver driver)throws DriverNotFoundException;
//	public Driver deleteDriver(int driverId)throws DriverNotFoundException;
//	public Driver viewDriver(int driverId)throws DriverNotFoundException;
//	public List<Driver>viewBestDrivers()throws DriverNotFoundException;
}
