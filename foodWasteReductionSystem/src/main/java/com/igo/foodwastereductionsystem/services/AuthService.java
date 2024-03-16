/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.igo.foodwastereductionsystem.services;

/**
 *
 * @author liyingguo
 */
public interface AuthService {
    /**
     * login with username and password
     * @param username
     * @param password
     * @return 
     */
    boolean login(String username, String password);
    //todo-register goes here
    
    /**
     * logout to clean session stuff
     * @return 
     */
    boolean logout();
}
