package com.matrixcampus.repository;

import com.matrixcampus.models.entity.Price;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;

public interface PriceRepository extends CrudRepository<Price, Long> {

    @Query("select p from Price p " +
            "where p.brandId = :brandId " +
            "and p.productId = :productId " +
            "and :searchDate between p.startDate and p.endDate " +
            "and p.priority = (select max(p2.priority) from Price p2 " +
                "where p.brandId = :brandId " +
                "and p2.productId = :productId " +
                "and :searchDate between p2.startDate and p2.endDate)")
    Price findByDateRange(@Param("productId") Long productId,
                          @Param("brandId") Long brandId,
                          @Param("searchDate") Date searchDate);

}
