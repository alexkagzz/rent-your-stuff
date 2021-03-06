package com.kagzz.jmix.rys.test_support.test_data;

import com.kagzz.jmix.rys.order.dto.OrderData;
import com.kagzz.jmix.rys.order.entity.Order;
import com.kagzz.jmix.rys.order.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component("rys_Orders")
public class Orders
        implements TestDataProvisioning<OrderData, OrderData.OrderDataBuilder, Order> {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    OrderLines orderLines;

    public static final String DEFAULT_NAME = "product_name";
    public static final LocalDate DEFAULT_ORDER_DATE = LocalDate.of(2022,2,15);

    @Override
    public OrderData.OrderDataBuilder defaultData() {
        return OrderData.builder()
                .orderDate(DEFAULT_ORDER_DATE)
                .orderLines(List.of());
    }

    @Override
    public Order save(OrderData orderData)  {
        return orderRepository.save(orderData);
    }

    @Override
    public Order saveDefault() {
        return save(defaultData().build());
    }

}