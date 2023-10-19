package com.matrixcampus.models.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class PriceDto {

    private Long brandId;

    private Date startDate;

    private Date endDate;

    private Long productId;

    private Integer priceList;

    private Double price;

}
