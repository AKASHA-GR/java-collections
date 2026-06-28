package com.xworkz.collectionIntro.runner;

import com.xworkz.collectionIntro.constent.Status;
import com.xworkz.collectionIntro.dto.OrderDTO;

import java.util.ArrayList;
import java.util.Collection;

public class OrderRunner {
    public static void main(String[] args) {
        Collection<OrderDTO> order = new ArrayList<>();

        OrderDTO orderDTO = new OrderDTO(2221,111,"02/27/2024", Status.DELIVERED,5499);
        OrderDTO orderDTO1 = new OrderDTO(2222,112,"02/20/2026", Status.PENDING,5499);

        order.add(orderDTO);
        order.add(orderDTO1);
        System.out.println("Order details:"+order);
        System.out.println("Order details size:"+order.size());
    }
}
