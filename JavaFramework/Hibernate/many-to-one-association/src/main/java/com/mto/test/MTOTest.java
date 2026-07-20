package com.mto.test;

import com.mto.entities.Associate;
import com.mto.entities.Project;
import com.mto.helper.EMFRegistry;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

import java.time.LocalDate;

public class MTOTest {
    public static void main(String[] args) {

        try {
            /*Project project = Project.of().title("HMS").duration(12).client("Apollo").budget(100000).build();
            int projectNo = saveProject(project);
            System.out.println(projectNo);*/

            /*Project project = getProject(1);
            Associate associate = Associate.of().fullName("Smith P")
                    .experience(10)
                    .designation("Programmer")
                    .doj(LocalDate.now().minusYears(10))
                    .assignedProject(project).build();
            int associateNo = saveAssociate(associate);
            System.out.println(associateNo);*/

            /*Project project = getProject(1);
            System.out.println(project);*/

            getAssociate(1);

        }finally {
            EMFRegistry.closeEntityManagerFactory();
        }
    }

    private static Project getProject(int projectNo){
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        Project project = null;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();

            project = entityManager.find(Project.class, projectNo);
        }finally {
            if (entityManager !=null && entityManager.isOpen()){
                entityManager.close();
            }
        }
        return project;
    }

    private static Associate getAssociate(int associateNo){
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        Associate associate = null;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();

            associate = entityManager.find(Associate.class, associateNo);
            System.out.println(associate);
        }finally {
            if (entityManager !=null && entityManager.isOpen()){
                entityManager.close();
            }
        }
        return associate;
    }

    private static int saveProject(Project project){
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        boolean flag = false;
        int projectNo=0;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            entityManager.persist(project);
            projectNo = project.getProjectNo();

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
        return projectNo;
    }

    private static int saveAssociate(Associate associate){
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        boolean flag = false;
        int associateNo =0;

        try {
            entityManagerFactory = EMFRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            entityManager.persist(associate);
            associateNo = associate.getAssociateNo();

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
        return associateNo;
    }
}
