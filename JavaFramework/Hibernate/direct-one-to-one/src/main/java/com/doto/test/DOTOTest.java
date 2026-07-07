package com.doto.test;

import com.doto.entities.AutoLoan;
import com.doto.entities.LoanDisbursement;
import com.doto.helper.EMFRegistry;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

import java.time.LocalDate;

public class DOTOTest {
    public static void main(String[] args) {
        try {
            /*AutoLoan autoLoan = AutoLoan.of()
                    .applicantName("Karishma k")
                    .tenure(3)
                    .principalAmount(120000)
                    .interestRate(7.5).build();

            int loanNo = saveAutoLoan(autoLoan);
            System.out.println("loanNo : "+loanNo);*/

            LoanDisbursement loanDisbursement = LoanDisbursement.of()
                    .disbursementDate(LocalDate.now())
                    .chequeNo("SBI3040234")
                    .chequeDate(LocalDate.now().plusDays(10))
                    .paidTo("Agent private service pvt Ltd")
                    .disbursementAmount(125000).build();

            int loanNo = saveLoanDisbursement(1, loanDisbursement);
            System.out.println("loanNo : "+loanNo);

            //showAutoLoan(1);
            //showLoanDisbursement(5);
        }finally {
            EMFRegistry.closeEntityManagerFactory();
        }
    }

    private static LoanDisbursement showLoanDisbursement(int loanNo){
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        LoanDisbursement loanDisbursement= null;
        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();

            loanDisbursement = entityManager.find(LoanDisbursement.class, loanNo);
            System.out.println(loanDisbursement);
        }finally {
            if(entityManager !=null && entityManager.isOpen()){
                entityManager.close();
            }
        }
        return loanDisbursement;
    }
    private static AutoLoan showAutoLoan(int loanNo){
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        AutoLoan autoLoan = null;
        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();

            autoLoan = entityManager.find(AutoLoan.class, loanNo);
        }finally {
            if(entityManager !=null && entityManager.isOpen()){
                entityManager.close();
            }
        }
        return autoLoan;
    }
    private static int saveAutoLoan(AutoLoan autoLoan){
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        boolean flag = false;
        int loanNo=0;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            entityManager.merge(autoLoan);
            loanNo = autoLoan.getLoanNo();

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
        return loanNo;
    }
    private static int saveLoanDisbursement(int loanNo, LoanDisbursement loanDisbursement){
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        boolean flag = false;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            AutoLoan autoLoan = entityManager.find(AutoLoan.class, loanNo);
            loanDisbursement.setAutoLoan(autoLoan);

            entityManager.persist(loanDisbursement);
            loanNo = loanDisbursement.getLoanNo();

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
        return loanNo;
    }
}
