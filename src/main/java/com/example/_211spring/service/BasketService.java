package com.example._211spring.service;

import com.example._211spring.configurator.Basket;

import java.util.ArrayList;

public interface BasketService {
    Basket getProductID();
    void addProductID(ArrayList<Integer> list);
}
