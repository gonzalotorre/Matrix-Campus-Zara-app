package com.matrixcampus;

import com.matrixcampus.models.dto.PriceDto;
import com.matrixcampus.models.entity.Price;
import com.matrixcampus.utils.DateFormatUtils;

public class PriceMock {

    // Como los datos de prueba estos 3 campos son los mismos para todos aprovecho para crearlos como constantes para evitar repetir codigo.
    public static final Long PRODUCT_ID = 35455L;
    public static final Long BRAND_ID = 1L;
    public static final String CURR = "EUR";

    public static Price price() {
        return Price.builder()
                .productId(PRODUCT_ID)
                .brandId(BRAND_ID)
                .priceList(1)
                .price(35.50)
                .priority(0)
                .curr(CURR)
                .startDate(DateFormatUtils.parseDateStr("2020-06-14-00.00.00"))
                .endDate(DateFormatUtils.parseDateStr("2020-12-31-23.59.59"))
                .build();
    }

    public static PriceDto priceDto1() {
        return PriceDto.builder()
                .productId(PRODUCT_ID)
                .brandId(BRAND_ID)
                .priceList(1)
                .price(35.50)
                .startDate(DateFormatUtils.parseDateStr("2020-06-14-00.00.00"))
                .endDate(DateFormatUtils.parseDateStr("2020-12-31-23.59.59"))
                .build();
    }


    public static PriceDto priceDto2() {
        return PriceDto.builder()
                .productId(PRODUCT_ID)
                .brandId(BRAND_ID)
                .priceList(2)
                .price(25.45)
                .startDate(DateFormatUtils.parseDateStr("2020-06-14-15.00.00"))
                .endDate(DateFormatUtils.parseDateStr("2020-06-14-18.30.00"))
                .build();
    }

    public static PriceDto priceDto3() {
        return PriceDto.builder()
                .productId(PRODUCT_ID)
                .brandId(BRAND_ID)
                .priceList(3)
                .price(30.50)
                .startDate(DateFormatUtils.parseDateStr("2020-06-15-00.00.00"))
                .endDate(DateFormatUtils.parseDateStr("2020-06-15-11.00.00"))
                .build();
    }

    public static PriceDto priceDto4() {
        return PriceDto.builder()
                .productId(PRODUCT_ID)
                .brandId(BRAND_ID)
                .priceList(4)
                .price(38.95)
                .startDate(DateFormatUtils.parseDateStr("2020-06-15-16.00.00"))
                .endDate(DateFormatUtils.parseDateStr("2020-12-31-23.59.59"))
                .build();
    }
}
