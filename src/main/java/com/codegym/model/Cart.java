package com.codegym.model;

import java.util.HashMap;

public class Cart {

    private HashMap<Integer, Integer> map = new HashMap<>();

    public HashMap<Integer, Integer> getMap(){
        return map;
    }

    public void setMap(HashMap<Integer, Integer> map){
        this.map = map;
    }
}
