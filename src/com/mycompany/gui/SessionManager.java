/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gui;

import com.codename1.io.Preferences;
import java.util.ArrayList;


/**
 *
 * @author Lenovo
 */
public class SessionManager {
    
    public static Preferences pref ; 
    
    
    
    
    private static int id ; 
    private static String userName ; 
    private static String email; 
    private static String numTel; 
    private static String fullAddress; 
    private static String passowrd ;
    private static ArrayList<String> roles;
    

    public static Preferences getPref() {
        return pref;
    }

    public static void setPref(Preferences pref) {
        SessionManager.pref = pref;
    }

    public static int getId() {
        return pref.get("id",id);
    }

    public static void setId(int id) {
        pref.set("id",id);
    }

    public static String getUserName() {
        return pref.get("username",userName);
    }

    public static void setUserName(String userName) {
         pref.set("username",userName);
    }

    public static String getEmail() {
        return pref.get("email",email);
    }

    public static void setEmail(String email) {
         pref.set("email",email);
    }

    public static String getPassowrd() {
        return pref.get("passowrd",passowrd);
    }

    public static void setPassowrd(String passowrd) {
         pref.set("passowrd",passowrd);
    }

    public static String getNumTel() {
        return pref.get("numTel",numTel);
    }

    public static void setNumTel(String numTel) {
         pref.set("numTel",numTel);
    }
    
    
    public static String getFullAddress() {
        return pref.get("fullAddress",fullAddress);
    }

    public static void setFullAddress(String fullAddress) {
         pref.set("fullAddress",fullAddress);
    }

    public static ArrayList<String> getRoles() {
        return roles;
    }

    public static void setRoles(ArrayList<String> roles) {
        SessionManager.roles = roles;
    }

    
   
    
    
    
}
