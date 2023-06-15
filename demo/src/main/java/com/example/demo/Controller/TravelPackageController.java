package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.example.demo.Entity.Activity;
import com.example.demo.Entity.Passenger;
import com.example.demo.Entity.TravelPackage;
import com.example.demo.Service.TravelPackageService;

@RestController
@RequestMapping("/travel")
public class TravelPackageController {

    private final TravelPackageService travelPackageService;

    public TravelPackageController(TravelPackageService travelPackageService) {
        this.travelPackageService = travelPackageService;
    }

    @PostMapping("/package")
    public void addTravelPackage(@RequestBody TravelPackage travelPackage) {
        travelPackageService.addPackage(travelPackage);
    }

    @PostMapping("/passenger")
    public void addPassenger(@RequestBody Passenger passenger) {
        travelPackageService.addPassenger(passenger);
    }

    @GetMapping("/package/{name}/itinerary")
    public TravelPackage getPackageItinerary(@PathVariable String name) {
        return travelPackageService.getPackageItinerary(name);
    }

    @GetMapping("/package/{name}/passengers")
    public TravelPackage getPassengerList(@PathVariable String name) {
        return travelPackageService.getPassengerList(name);
    }

    @GetMapping("/passenger/{passengerNumber}")
    public Passenger getPassengerDetails(@PathVariable int passengerNumber) {
        return travelPackageService.getPassengerDetails(passengerNumber);
    }

    @GetMapping("/activities/available")
    public List<Activity> getAvailableActivities() {
        return travelPackageService.getAvailableActivities();
    }
}

