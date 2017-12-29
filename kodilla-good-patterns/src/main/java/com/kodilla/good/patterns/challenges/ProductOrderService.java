package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private WearehouseInformation wearehouseInformation;

    public ProductOrderService(final InformationService informationService,
                               final WearehouseInformation wearehouseInformation) {
        this.informationService = informationService;
        this.wearehouseInformation = wearehouseInformation;
    }

    public OrderExecution process (final OrderRequest orderRequest){
        boolean isProductAvailiable = wearehouseInformation.checkAvailability(orderRequest);

        if(isProductAvailiable){
            informationService.inform(orderRequest);
            return new OrderExecution(orderRequest, true);
        } else {
            return new OrderExecution(orderRequest, false);
        }
    }
}
