package com.primtiveinjection.javaconfig.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:com/primtiveinjection/javaconfig/annotation/app-config.properties")
public class PrimtiveInjectionJavaConfig {
    @Autowired
    private Environment env;

    //#1 approach
    @Bean
    public Branch branch1(){
        Branch branch = new Branch();
        branch.setId(Integer.parseInt(env.getProperty("branch.id")));
        branch.setIfscCode(env.getProperty("branch.ifscCode"));
        branch.setBranchName(env.getProperty("branch.branchName"));
        branch.setLocation(env.getProperty("branch.location"));

        return branch;
    }

    @Bean
    public Branch branch2(@Value("${branch.id}") int id,
                          @Value("${branch.ifscCode}") String ifscCode,
                          @Value("${branch.branchName}") String branchName,
                          @Value("${branch.location}") String location){
        System.out.println("branch2 is printing");
        Branch branch = new Branch();
        branch.setId(id);
        branch.setIfscCode(ifscCode);
        branch.setBranchName(branchName);
        branch.setLocation(location);
        return branch;
    }
}
