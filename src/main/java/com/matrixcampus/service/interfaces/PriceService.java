package com.matrixcampus.service.interfaces;

import com.matrixcampus.models.dto.PriceDto;

import java.text.ParseException;

public interface PriceService {

    PriceDto findPrice(Long productId, Long brandId, String searchDate);

}
