package com.example.onlinecabbooking.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.onlinecabbooking.entities.Cab;
@Service
public interface ICabService {
    public Cab insertCab(Cab cab);
    public Cab updateCab(Cab cab, int id);
    public ResponseEntity<Cab> deleteCab(Cab cab, int id);
    public List<Cab> viewCabsOfType(String carType);
    public int countCabsOfType(String carType);
}}
