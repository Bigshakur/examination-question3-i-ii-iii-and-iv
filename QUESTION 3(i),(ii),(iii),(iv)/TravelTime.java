/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Shakur
 */
public class TravelTime {
    public static void main(String[] args) {
        int totalDistance = 10000;
        int speedKmPerHour = 250;
        int stopTimeMinutes = 5;

        // Calculate time taken without stops
        double travelTimeHours = (double) totalDistance / speedKmPerHour;

        // Number of stops from Part (i)
        int passengerStops = totalDistance / 150;
        int refuelStops = totalDistance / 200;

        // Subtract common stops
        int commonStops = totalDistance / (150 * 200);

        int totalStops = passengerStops + refuelStops - commonStops;

        // Total time for stops in hours
        double stopTimeHours = (totalStops * stopTimeMinutes) / 60.0;

        // Total time including stops
        double totalTime = travelTimeHours + stopTimeHours;

        System.out.println("Total time taken: " + totalTime + " hours");
    }
}

