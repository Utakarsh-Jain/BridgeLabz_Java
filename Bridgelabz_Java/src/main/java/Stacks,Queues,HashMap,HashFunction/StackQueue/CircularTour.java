/*
Circular Tour Problem
Problem: Given a set of petrol pumps with petrol and distance to the next pump, determine the starting point for completing a circular tour.
Hint: Use a queue to simulate the tour, keeping track of surplus petrol at each pump.
Name : Utakarsh Jain
Date : 07/10/2026
*/

import java.util.LinkedList;
import java.util.Queue;
public class CircularTour {
    // Node stores petrol and distance information of a petrol pump
    static class PetrolPump {
        int petrol;
        int distance;
        PetrolPump(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }
    // Find the starting petrol pump using a queue
    static int findStartingPoint(int[] petrol, int[] distance) {
        Queue<PetrolPump> queue = new LinkedList<>();
        // Add all petrol pumps to the queue
        for (int i = 0; i < petrol.length; i++) {
            queue.add(new PetrolPump(petrol[i], distance[i]));
        }
        // Check each petrol pump as a possible starting point
        for (int start = 0; start < petrol.length; start++) {
            // Create a temporary queue for this tour
            Queue<PetrolPump> tempQueue = new LinkedList<>(queue);
            // Move pumps before the starting point to the back
            for (int i = 0; i < start; i++) {
                tempQueue.add(tempQueue.poll());
            }
            int currentPetrol = 0;
            boolean possible = true;
            // Simulate the complete circular tour
            for (int i = 0; i < petrol.length; i++) {
                PetrolPump pump = tempQueue.poll();
                // Add petrol received at current pump
                currentPetrol += pump.petrol;
                // Petrol required to travel to next pump
                currentPetrol -= pump.distance;
                // If petrol becomes negative, this start point fails
                if (currentPetrol < 0) {
                    possible = false;
                    break;
                }
                // Put the pump back to maintain circular structure
                tempQueue.add(pump);
            }
            // If all pumps were successfully visited
            if (possible) {
                return start;
            }
        }
        // No starting point can complete the circular tour
        return -1;
    }

    public static void main(String[] args) {

        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int result = findStartingPoint(petrol, distance);

        if (result == -1) {
            System.out.println("Circular tour is not possible");
        } else {
            System.out.println("Starting Point: " + result);
        }
    }
}

