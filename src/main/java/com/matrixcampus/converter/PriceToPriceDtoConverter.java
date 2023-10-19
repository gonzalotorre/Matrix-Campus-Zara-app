package com.matrixcampus.converter;

import com.matrixcampus.models.dto.PriceDto;
import com.matrixcampus.models.entity.Price;

public class PriceToPriceDtoConverter {

    public static PriceDto priceToDto(Price price) {
        return PriceDto.builder()
                .price(price.getPrice())
                .priceList(price.getPriceList())
                .brandId(price.getBrandId())
                .productId(price.getProductId())
                .startDate(price.getStartDate())
                .endDate(price.getEndDate())
                .build();
    }

}
