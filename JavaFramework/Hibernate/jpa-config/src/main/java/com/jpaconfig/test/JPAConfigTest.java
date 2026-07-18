package com.jpaconfig.test;

import com.jpaconfig.dao.RechargePlanDao;
import com.jpaconfig.entities.RechargePlan;
import com.jpaconfig.helper.EntityManagerFactoryRegistry;

public class JPAConfigTest {
    public static void main(String[] args) {

        RechargePlan rechargePlan = new RechargePlan();
        rechargePlan.setPlanNo(2);
        rechargePlan.setPlanName("499 unlimited plan");
        rechargePlan.setCircle("AP");
        rechargePlan.setValidityDays(40);
        rechargePlan.setDescription("unlimited Text/Talk local");
        rechargePlan.setRechargeAmount(499);

        try {
            RechargePlanDao rechargePlanDao = new RechargePlanDao();
            rechargePlanDao.saveRechargePlan(rechargePlan);
            System.out.println("recharge plan saved");
        }finally {
            EntityManagerFactoryRegistry.closeEntityManagerFactory();
        }
    }
}
