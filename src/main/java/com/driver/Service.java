package com.driver;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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

    public void addOrderPartnerPair(String orderId, String partnerId) {
        repo.addOrderPartnerPair(orderId,partnerId);
    }

    public Order getOrderBYId(String orderId) {
       return repo.getOderById(orderId);
    }

    public DeliveryPartner getPartnerById(String partnerId) {
      return  repo.getPartnerById(partnerId);
    }

    public List<String> getOrderBYPartnerId(String partnerId) {
       return repo.getOrdersBYPartnerId(partnerId);
    }

    public List<String> getAllOrders() {
       return repo.getAllOrders();
    }
}
