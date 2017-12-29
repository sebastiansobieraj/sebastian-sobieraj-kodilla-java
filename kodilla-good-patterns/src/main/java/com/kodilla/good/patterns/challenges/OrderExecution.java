package com.kodilla.good.patterns.challenges;

public class OrderExecution {

    private OrderRequest orderRequest;
    private boolean execution;

    public OrderExecution(OrderRequest orderRequest, boolean execution) {
        this.orderRequest = orderRequest;
        this.execution = execution;
    }

    public OrderRequest getOrderRequest() {
        return orderRequest;
    }

    public boolean isExecution() {
        return execution;
    }
}
