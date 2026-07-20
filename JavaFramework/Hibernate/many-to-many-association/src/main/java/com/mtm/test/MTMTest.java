package com.mtm.test;

import com.mtm.entities.Passenger;
import com.mtm.entities.Trip;
import com.mtm.helper.EMFRegistry;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class MTMTest {
    public static void main(String[] args) {

        try {
            /*Passenger passenger = Passenger.of()
                    .fullName("Laura J")
                    .age(26)
                    .gender("Female")
                    .mobileNo("8876456789")
                    .emailAddress("Jlaura@gmail.com").build();
            int passengerNo = savePassenger(passenger);
            System.out.println("passenger no : "+passengerNo);*/

            /*Passenger passenger = getPassenger(3);
            System.out.println(passenger);*/

            /*Passenger passenger1 = getPassenger(1);
            Passenger passenger2 = getPassenger(2);
            Passenger passenger3 = getPassenger(3);

            Set<Passenger> passengers = new HashSet<>();
            passengers.add(passenger1);
            passengers.add(passenger2);
            passengers.add(passenger3);

            Trip trip = Trip.of()
                    .source("Hyderabad")
                    .destination("Bangalore")
                    .journeyDate(LocalDate.now().plusDays(7))
                    .days(7)
                    .cost(40000)
                    .passengers(passengers).build();
            int tripNo = saveTrip(trip);
            System.out.println("trip no: "+tripNo);*/

            showTrip(2);
        }finally {
            EMFRegistry.closeEntityManagerFactory();
        }
    }

    private static Passenger getPassenger(int passengerNo){
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        Passenger passenger = null;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();

            passenger = entityManager.find(Passenger.class, passengerNo);
        }finally {
            if(entityManager !=null && entityManager.isOpen()){
                entityManager.close();
            }
        }
        return passenger;
    }

    private static Trip showTrip(int tripNo){
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        Trip trip = null;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();

            trip = entityManager.find(Trip.class, tripNo);
            System.out.println(trip);
        }finally {
            if(entityManager !=null && entityManager.isOpen()){
                entityManager.close();
            }
        }
        return trip;
    }

    private static int savePassenger(Passenger passenger){
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        boolean flag = false;
        int passengerNo = 0;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            entityManager.persist(passenger);
            passengerNo = passenger.getPassengerNo();

            flag = true;
        }finally {
            if (entityTransaction !=null){
                if(flag){
                    entityTransaction.commit();
                }else {
                    entityTransaction.rollback();
                }
                entityManager.close();
            }
        }
        return passengerNo;
    }

    private static int saveTrip(Trip trip){
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        boolean flag = false;
        int tripNo = 0;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            entityManager.persist(trip);
            tripNo = trip.getTripNo();

            flag = true;
        }finally {
            if (entityTransaction !=null){
                if(flag){
                    entityTransaction.commit();
                }else {
                    entityTransaction.rollback();
                }
                entityManager.close();
            }
        }
        return tripNo;
    }
}
