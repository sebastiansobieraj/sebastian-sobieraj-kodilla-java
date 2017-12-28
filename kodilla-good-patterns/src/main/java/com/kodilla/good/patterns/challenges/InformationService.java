package com.kodilla.good.patterns.challenges;

public class InformationService implements Information {

    public void inform(OrderRequest orderRequest){
        System.out.println("Name: " + orderRequest.getCustomer().getFirstName() +
                "\nSurname: " + orderRequest.getCustomer().getLastName() +
                "\nemail: " + orderRequest.getCustomer().getEmail() + "\nordered: " + orderRequest.getProduct() +
                ", in amout: " + orderRequest.getAmount());
    }
}
