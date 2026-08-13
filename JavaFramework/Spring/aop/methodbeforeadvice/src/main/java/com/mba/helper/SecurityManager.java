package com.mba.helper;

public class SecurityManager {
    private static SecurityManager instance;
    private ThreadLocal<User> threadLocal;

    record User(String un, String pwd){}

    private SecurityManager() {
        threadLocal = new ThreadLocal<>();
    }

    public static synchronized SecurityManager getInstance(){
        if(instance == null){
            instance = new SecurityManager();
        }
        return instance;
    }

    public void login(String un, String pwd){
        threadLocal.set(new User(un, pwd));
    }

    public boolean authentication(){
        User user = null;

        user = threadLocal.get();
        if (user != null){
            if(user.un().equals("John") && user.pwd().equals("aop@1"))
                return true;
        }
        return false;
    }

    public void logout(){
        threadLocal.set(null);
    }

    public String getLoggedInUser(){
        User user = null;

        user = threadLocal.get();
        if (user != null){
            return user.un();
        }
        return null;
    }
}
