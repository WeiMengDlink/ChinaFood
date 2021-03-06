package com.hy.bean;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by huyu on 2017/6/20.
 */
public class FoodScene implements Serializable,Comparable{
    private long id;
    private String name;
    private Set<Food> foods;

    public FoodScene() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Food> getFoods() {
        return foods;
    }

    public void setFoods(Set<Food> foods) {
        this.foods = foods;
    }

    @Override
    public int compareTo(Object o) {
        FoodScene c=(FoodScene) o;
        return (int)(this.id-c.getId());
    }
}
