package com.example._211spring.configurator;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Integer> list;

    public Basket() {
        this.list = new ArrayList<>();
    }

     public void setList(List<Integer> list) {
        this.list = list;
    }

}
