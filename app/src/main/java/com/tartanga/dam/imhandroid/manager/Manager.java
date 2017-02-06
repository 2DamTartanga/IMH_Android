package com.tartanga.dam.imhandroid.manager;

import android.support.v7.app.AppCompatActivity;

public class Manager {
    private static Manager manager = new Manager();

    public static Manager getInstance() {
        return manager;
    }

    public void switchMainFragment(AppCompatActivity activity, int fragmentTag, Object[] args){
       // frameManager.switchMainFragment(activity, fragmentTag, args);
    }
    public void switchMainFragment(AppCompatActivity activity, int fragmentTag){
        this.switchMainFragment(activity, fragmentTag, null);
    }
}
