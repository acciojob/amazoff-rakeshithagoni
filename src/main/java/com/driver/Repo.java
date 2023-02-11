package com.driver;

import org.springframework.stereotype.Repository;

import java.util.*;
import java.lang.*;

@Repository
public class Repo {
    //HashSet<Order> o=new HashSet<>();
  //  HashSet<DeliveryPartner> deliveryPartners=new HashSet<>();
     HashMap<String, Order> orders;
    HashMap<String, DeliveryPartner> deliveryPartners;
     HashMap<String, List<Order>> partnerOrders;
   // Map<String, List<String>> aopp=new HashMap<>();//
     HashMap<String, Integer> unassignedOrders;


    public Repo() {
        this.orders = new HashMap<>();
        this.deliveryPartners = new HashMap<>();
        this.partnerOrders = new HashMap<>();
        this.unassignedOrders = new HashMap<>();
    }
    public void addOrder(Order order) {
        orders.put(order.getId(), order);
    }

    public void addPartner(String partnerId) {
        DeliveryPartner del=new DeliveryPartner(partnerId);
        deliveryPartners.put(del.getId(),del);
    }

    public void addOrderPartnerPair(String orderId, String partnerId) {
        LinkedList<Order> list=new LinkedList<>();
        Order s=orders.get(orderId);
        list.add(s);
        partnerOrders.put(partnerId,list);
    }

    public Order getOderById(String orderId) {
       return orders.get(orderId);
    }

    public DeliveryPartner getPartnerById(String partnerId) {
     return   deliveryPartners.get(partnerId);
    }

    public List<String> getOrdersBYPartnerId(String partnerId) {
       List<Order> list=     partnerOrders.get(partnerId);
       List<String> rlist=new LinkedList<>();
        for(Order li:list){
            rlist.add(li.getId());
        }
        return rlist;
    }

    public List<String > getAllOrders() {
        List<String> list=new LinkedList<>();
       for(String s:orders.keySet()){
           list.add(s);
       }
       return list;
    }
}
