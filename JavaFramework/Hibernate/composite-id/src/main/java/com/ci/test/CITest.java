package com.ci.test;

import com.ci.entities.LoanApplication;
import com.ci.entities.LoanApplicationID;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class CITest {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibpu");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        boolean flag = false;

        try {
            entityTransaction.begin();

            LoanApplicationID loanApplicationID = new LoanApplicationID();
            loanApplicationID.setApplicationNo(10);
            loanApplicationID.setBranchCode("CNBK678RT");

            /*LoanApplication loanApplication = new LoanApplication();
            loanApplication.setLoanApplicationID(loanApplicationID);
            loanApplication.setApplicantName("Rishab");
            loanApplication.setAppliedDate(LocalDate.now());
            loanApplication.setLoanType("Home Loan");
            loanApplication.setAmount(400000);

            entityManager.persist(loanApplication);
            System.out.println("loan application saved");*/

            LoanApplication loanApplication = entityManager.find(LoanApplication.class, loanApplicationID);
            System.out.println(loanApplication);

            LoanApplicationID applicationID = new LoanApplicationID();
            applicationID.setApplicationNo(11);
            applicationID.setBranchCode("ABC");

            LoanApplication loanApplication1 = entityManager.find(LoanApplication.class, applicationID);
            System.out.println(loanApplication1);

            flag=true;
        }finally {
            if (entityTransaction != null){
                if (flag){
                    entityTransaction.commit();
                }else {
                    entityTransaction.rollback();
                }
            }
            if (entityManager != null){
                entityManager.close();
            }
            if (entityManagerFactory != null){
                entityManagerFactory.close();
            }
        }
    }
}
