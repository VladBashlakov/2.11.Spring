package com.example._211spring.service.impl;

import com.example._211spring.configurator.Basket;
import com.example._211spring.service.BasketService;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class BasketServiceImpl implements BasketService {

    private final Basket basket;

    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void addProductID(ArrayList<Integer> list) {
        basket.setList(list);
    }

    @Override
    public List<Integer> getAllProducts() {
        return basket.getList();
    }
}
