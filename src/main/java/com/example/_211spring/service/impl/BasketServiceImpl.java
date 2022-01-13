package com.example._211spring.service.impl;

import com.example._211spring.service.BasketService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService {

    ArrayList<Integer> storage;

    public BasketServiceImpl(ArrayList<Integer> storage) {
        this.storage = storage;
    }

    @Override
    public void addProductID(Integer id) {
        storage.add(id);
    }

    @Override
    public ArrayList<Integer> getProductID() {
        return storage;
    }
}
