package com.driver;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

@Autowired
Repo repo;
    public void addOrder(Order order) {
        repo.addOrder(order);
    }

    public void addPartner(String partnerId) {
        repo.addPartner(partnerId);
    }
}
