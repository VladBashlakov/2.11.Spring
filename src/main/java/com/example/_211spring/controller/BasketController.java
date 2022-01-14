package com.example._211spring.controller;

import com.example._211spring.configurator.Basket;
import com.example._211spring.service.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/order")

public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public void add(@RequestParam ArrayList<Integer> list) {
        basketService.addProductID(list);
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return basketService.getProductID();
    }
}
