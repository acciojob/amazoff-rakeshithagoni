package com.driver;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;

@Repository
public class Repo {
    HashSet<Order> o=new HashSet<>();
    HashSet<String> deliveryPartners=new HashSet<>();


    public void addOrder(Order order) {
        o.add(order);
    }

    public void addPartner(String partnerId) {
        deliveryPartners.add(partnerId);
    }
}
