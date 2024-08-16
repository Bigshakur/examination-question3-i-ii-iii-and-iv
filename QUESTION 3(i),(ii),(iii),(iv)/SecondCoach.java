/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Shakur
 */

public class SecondCoach {
    public static void main(String[] args) {
        int totalDistance = 10000;
        double speedMetersPerSecond = 225.5;

        // Convert speed to km/h
        double speedKmPerHour = speedMetersPerSecond * 3.6;

        // Calculate time
        double travelTimeHours = (double) totalDistance / speedKmPerHour;

        System.out.println("Time taken by the second coach: " + travelTimeHours + " hours");
    }
}
