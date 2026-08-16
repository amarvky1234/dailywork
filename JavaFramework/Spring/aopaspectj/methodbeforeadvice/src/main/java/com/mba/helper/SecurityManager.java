package com.mba.helper;

public class SecurityManager {
    private static SecurityManager instance;
    private ThreadLocal<User> userThreadLocal;

    record User(String un, String pwd){}

    private SecurityManager(){
        userThreadLocal = new ThreadLocal<>();
    }

    public static synchronized SecurityManager getInstance(){
        if (instance == null){
            instance = new SecurityManager();
        }
        return instance;
    }

    public void login(String un, String pwd){
        userThreadLocal.set(new User(un, pwd));
    }

    public void logout(){
        userThreadLocal.set(null);
    }

    public boolean authenticate(){
        final User user = userThreadLocal.get();

        if(user != null){
            if (user.un().equals("fedrick") && user.pwd().equals("abc")){
                return true;
            }
        }
        return false;
    }

    public String logName(){
        final User user = userThreadLocal.get();

        if (user != null){
            return user.un();
        }
        return null;
    }
}
