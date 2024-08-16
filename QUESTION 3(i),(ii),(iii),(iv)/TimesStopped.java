/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Shakur
 */
public class TimesStopped {
    public static void main(String[] args) {
        int totalDistance = 10000;
        int passengerStopDistance = 150;
        int refuelStopDistance = 200;

        int passengerStops = totalDistance / passengerStopDistance;
        int refuelStops = totalDistance / refuelStopDistance;

        // Subtract the common stops to avoid double counting
        int commonStops = totalDistance / (passengerStopDistance * refuelStopDistance);
        
        int totalStops = passengerStops + refuelStops - commonStops;

        System.out.println("The train should stop " + totalStops + " times.");
    }
}
