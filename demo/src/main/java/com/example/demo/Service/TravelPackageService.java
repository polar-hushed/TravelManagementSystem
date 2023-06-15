package com.example.demo.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Entity.Activity;
import com.example.demo.Entity.Destination;
import com.example.demo.Entity.Passenger;
import com.example.demo.Entity.TravelPackage;

@Service
public class TravelPackageService {

    private final List <TravelPackage> travelPackages;
    private final List<Passenger> passengers;

    public TravelPackageService() {
        travelPackages = new ArrayList <> ();
        passengers = new ArrayList<>();
    }

    public void addPackage(TravelPackage travelPackage) {
        travelPackages.add(travelPackage);
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public TravelPackage getPackageItinerary(String name) {
        for (TravelPackage travelPackage : travelPackages) {
            if (travelPackage.getName().equals(name)) {
                return travelPackage;
            }
        }
        return null;
    }

    public TravelPackage getPassengerList(String name) {
        for (TravelPackage travelPackage : travelPackages) {
            if (travelPackage.getName().equals(name)) {
                return travelPackage;
            }
        }
        return null;
    }

    public Passenger getPassengerDetails(int passengerNumber) {
        for (Passenger passenger : passengers) {
            if (passenger.getPassengerNumber() == passengerNumber) {
                return passenger;
            }
        }
        return null;
    }

    public List<Activity> getAvailableActivities() {
        List<Activity> availableActivities = new ArrayList<>();
        for (TravelPackage travelPackage : travelPackages) {
            for (Destination destination : travelPackage.getDestinations()) {
                for (Activity activity : destination.getActivities()) {
                    if (activity.getCapacity() > 0) {
                        availableActivities.add(activity);
                    }
                }
            }
        }
        return availableActivities;
    }
}
