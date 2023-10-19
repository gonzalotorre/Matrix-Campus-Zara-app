package com.matrixcampus.controller;

import com.matrixcampus.models.dto.PriceDto;
import com.matrixcampus.service.interfaces.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
public class PriceController {

    @Autowired
    private PriceService priceService;

    @GetMapping("/productId/{productId}/brandId/{brandId}/searchDate/{searchDate}")
    public PriceDto findPrice(
            @PathVariable Long productId,
            @PathVariable Long brandId,
            @PathVariable String searchDate
    ) {
        return this.priceService.findPrice(productId, brandId, searchDate);
    }

}
