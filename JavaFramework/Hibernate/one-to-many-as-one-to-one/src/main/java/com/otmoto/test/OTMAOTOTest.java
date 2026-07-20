package com.otmoto.test;

import com.otmoto.entities.Account;
import com.otmoto.entities.Locker;
import com.otmoto.helper.EMFRegistry;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class OTMAOTOTest {
    public static void main(String[] args) {
        try {
            /*Locker locker = Locker.of().keyNo("Kn673").dimension("10*10*10 cm").charges(3000).build();
            int lockerNo = saveLocker(locker);
            System.out.println("lockerNo : "+lockerNo);*/

            /*Locker locker1 = Locker.of().keyNo("Kn677").dimension("10*10*10 cm").charges(3200).build();
            saveLocker(locker1);

            Set<Locker> lockers = Arrays.asList(locker1).stream().collect(Collectors.toSet());
            Account account = Account.of().accountType("saving")
                    .accountHolderName("Allen B")
                    .ifscCode("CNB234567")
                    .balance(25000)
                    .assignedLockers(lockers).build();
            int accountNo = saveAccount(account);
            System.out.println("accountNo : "+accountNo);*/

            /*Locker locker = findLocker(4);
            System.out.println(locker);*/

            showAccount(2);

        }finally {
            EMFRegistry.closeEntityManagerFactory();
        }
    }

    private static Account showAccount(int accountNo){
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        Account account = null;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();

            account = entityManager.find(Account.class, accountNo);
            System.out.println(account);

        }finally {
            if(entityManager !=null && entityManager.isOpen()){
                entityManager.close();
            }
        }
        return account;
    }

    private static Locker findLocker(int lockerNo){
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        Locker locker = null;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();

            locker = entityManager.find(Locker.class, lockerNo);

        }finally {
            if(entityManager !=null && entityManager.isOpen()){
                entityManager.close();
            }
        }
        return locker;
    }

    private static int saveLocker(Locker locker){
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        boolean flag = false;
        int lockerNo = 0;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            entityManager.persist(locker);
            lockerNo = locker.getLockerNo();
            flag = true;
        }finally {
            if(entityTransaction !=null ){
                if (flag){
                    entityTransaction.commit();
                }else {
                    entityTransaction.rollback();
                }
                entityManager.close();
            }
        }
        return lockerNo;
    }

    private static int saveAccount(Account account){
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        boolean flag = false;
        int accountNo = 0;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            entityManager.persist(account);
            accountNo = account.getAccountNo();
            flag = true;
        }finally {
            if(entityTransaction !=null){
                if (flag){
                    entityTransaction.commit();
                }else {
                    entityTransaction.rollback();
                }
                entityManager.close();
            }
        }
        return accountNo;
    }
}
