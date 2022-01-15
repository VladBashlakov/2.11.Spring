package com.example._211spring.service;

import java.util.ArrayList;
import java.util.List;

public interface BasketService {
    List<Integer> getAllProducts();
    void addProductID(ArrayList<Integer> list);
}
