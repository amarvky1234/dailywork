package com.txmgmt.test;

import com.txmgmt.dao.JobDao;
import com.txmgmt.entities.Job;
import com.txmgmt.helper.SessionFactoryRegistry;

public class TXMGMTTest {
    public static void main(String[] args) {
        Job job = null;
        JobDao jobDao = null;

        try{
            jobDao = new JobDao();
            job = new Job();

            job.setJobNo(1);
            job.setJobTitle("Principal Application Enigineer");
            job.setDescription("Java devlopers with hand-on experience on building enterprise applications");
            job.setLocation("hyderbad");
            job.setDesignation("IC4");
            job.setSalary(800000);
            jobDao.saveJob(job);

        }finally {
            SessionFactoryRegistry.closeSessionFactory();
        }

    }
}
